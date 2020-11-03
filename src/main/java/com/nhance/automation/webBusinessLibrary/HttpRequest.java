package com.nhance.automation.webBusinessLibrary;

import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nhance.automation.webGenericLibrary.ChangePasswordModel;
import com.nhance.automation.webGenericLibrary.ChangePasswordModelResponse;



public class HttpRequest {

	//@Test
	public String getOTPByApi(String emailOrMobile , int applicationtype) throws Exception
	{
		ChangePasswordModel model = new ChangePasswordModel();
		model.setApplicationType(applicationtype);
		model.setLoginPrincipal(emailOrMobile);
		model = sendRequest(model, "https://app-in.nhancenow.com/b2c/v3/auth/getOtp");
		//model = sendRequest(model, "https://qa.nhancenow.com/b2c/v3/auth/getOtp");
		System.out.println("Otp : " + model.getOtp());
		return model.getOtp();
	}
	
	public static ChangePasswordModel sendRequest(ChangePasswordModel model, String url) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		String payload = objectMapper.writeValueAsString(model);

		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod("POST");
		//connection.setRequestProperty("application-type", "4");
		//connection.setRequestProperty("Authorization", "Basic NDpteS1zZWNyZXQta2V5");
		//connection.setRequestProperty("access_token", "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJkMmRhMjk4Zi04OTEwLTQ4Y2UtYTY5My05MjI3YTdkMTFjNzkiLCJhcHBfdHlwZSI6IjMiLCJleHAiOjE1NTYxNzIwODcsInVzZXJfbmFtZSI6Ijk4ODYzMDcxNTMiLCJqdGkiOiJiODYyMWI3Yy01YjEyLTQzYzMtOWY0My1iMjYyN2EyMTFmYTIiLCJzY29wZSI6WyJpbmRpYSJdfQ.8MMLrNZyxq9ksIo7QJtsp0yuWBl0OdH1MUfkyKd484e4WHBU8zP_29Gy5bn5Krzv0CsDlY16gf1dn07kqa6ggg");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(300000);

		connection.getOutputStream().write(payload.getBytes());
		connection.getOutputStream().flush();

		System.out.println("Response Code: " + connection.getResponseCode());
		System.out.println("Response Message: " + connection.getResponseMessage());

		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		int byteRead = 0;
		while ((byteRead = connection.getInputStream().read()) != -1) {
			buffer.write(byteRead);
		}
		ChangePasswordModelResponse response = objectMapper.readValue(buffer.toString(), ChangePasswordModelResponse.class);
		return response.getMessage();

	}

}
