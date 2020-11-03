package com.nhance.automation.webGenericLibrary;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

public class GenericFunctionsForWeb {
	
	// Reading the file path and dynamic variable from from external .properties files	
	public static void read_Environment_Variable_for_Web() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("/Environment File/environmentVariableForWebProduction2.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
		    Map<String, Object> map = new HashMap<>();
			for (Entry<Object, Object> entry : prop.entrySet()) {
				map.put((String) entry.getKey(), entry.getValue());
			}
			EnvironmentVariablesForWeb.setEnvironmentPropertyMap(map);
			/*EnvironmentVariables.PLATFORM_NAME = prop.getProperty("PLATFORM_NAME");
			EnvironmentVariables.VERSION_NAME = prop.getProperty("VERSION_NAME");
			EnvironmentVariables.DEVICE_NAME = prop.getProperty("DEVICE_NAME");
			System.out.println(EnvironmentVariables.PLATFORM_NAME);
			System.out.println(EnvironmentVariables.VERSION_NAME);
			System.out.println(EnvironmentVariables.DEVICE_NAME);*/

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	  }
	
	 public static void writeInto_File(String contentText , String filePath_to_Write)
		{
			   
				BufferedWriter bw = null;
				FileWriter fw = null;

				try {

					String content = contentText;

					fw = new FileWriter(filePath_to_Write);
					bw = new BufferedWriter(fw);
					bw.write(content);

					System.out.println("Done");

				} catch (IOException e) {

					e.printStackTrace();

				} finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}

				}

			}



}
