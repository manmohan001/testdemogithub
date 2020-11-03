package com.nhance.automation.webGenericLibrary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class CustomerModelResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ChangePasswordModelResponse {

	/** The message. */
	private ChangePasswordModel message;

	public ChangePasswordModel getMessage() {
		return message;
	}

	public void setMessage(ChangePasswordModel message) {
		this.message = message;
	}

	
}
