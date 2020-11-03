package com.nhance.automation.webGenericLibrary;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentVariablesForWeb {
	
	private static Map<String, Object> environmentPropertyMap = new HashMap<>();
	
	public static void setEnvironmentPropertyMap(Map<String, Object> environmentPropertyMap) {
		EnvironmentVariablesForWeb.environmentPropertyMap = environmentPropertyMap;
	}
	
	public static Object getPropertyValue(String propertyName) {
		return environmentPropertyMap.get(propertyName);
	}
	
	public static Object getPropertyValue(boolean propertyName) {
		return environmentPropertyMap.get(propertyName);
	}
	
	public static Object getPropertyValue(Path propertyName) {
		return environmentPropertyMap.get(propertyName);
	}
	
	
}
