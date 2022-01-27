package org.baseclass;

import java.io.File;
import java.util.*;

import javax.security.auth.login.*;

import org.baseclass.BaseClass;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReoprt{
	
public static void generateJVMReport(String json) {

	File loc=new File("E:\\Users\\Kamal\\eclipse-workspace\\TargetEcommerce\\src\\test\\resources\\Reports\\JVMReports");
	
	Configuration con=new Configuration(loc, "Target");
	con.addClassifications("Browsername", "Chrome");
	con.addClassifications("Browser version", "45");
	con.addClassifications("os", "windows");
	
	List<String> jsonfiles=new LinkedList<String>();
	jsonfiles.add(json);
	ReportBuilder r=new ReportBuilder(jsonfiles,con);
	r.generateReports();

}
	
}
