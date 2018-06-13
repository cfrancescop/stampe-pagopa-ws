package it.govpay.stampews;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JsonDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
@Component
public class ExtReport {
	private final String TEMPLATE_DIR=System.getProperty("TEMPLATE_DIR", "/var/govpay/template");
	public void exportToStream(String report,byte[] bytes, OutputStream outputStream)
			throws Exception {
		Path pathToTemplate = Paths.get(TEMPLATE_DIR, report+".jasper");
		if(!pathToTemplate.toFile().exists()) {
			throw new IllegalArgumentException("Report "+report+"  does not exists");
		}
		InputStream jasperTemplateInputStream = Files.newInputStream(pathToTemplate);
		ByteArrayInputStream io = new ByteArrayInputStream(bytes);
		
		JsonDataSource dataSource=  new JsonDataSource(io, "");
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperTemplateInputStream);
		
		Map<String, Object> parameters=new HashMap<>();
		// parametro per usare sotto report
		parameters.put("Dir", TEMPLATE_DIR);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
	}
}
