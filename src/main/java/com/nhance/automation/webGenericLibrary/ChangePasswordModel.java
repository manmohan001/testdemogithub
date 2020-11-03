package com.nhance.automation.webGenericLibrary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ChangePasswordModel {
	
	private Integer applicationType;
	
	private String loginPrincipal;
	
	private String otp;

	public Integer getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
	}

	public String getLoginPrincipal() {
		return loginPrincipal;
	}

	public void setLoginPrincipal(String loginPrincipal) {
		this.loginPrincipal = loginPrincipal;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

}
