package com.nhance.automation.enumFiles;

public enum ServiceRequest_specific_identifier {
	SERVICEREQUEST_SET_UP(0,"moduleSpecificSetUp"),
	ADD_SERVICEREQUEST(1, "add"),
	DUPLICATE_SERVICEREQUEST(2, "duplicate"),
	VALIDATE_SERVICEREQUEST(3,"validateField"),
	EDIT_SERVICEREQUEST(4,"edit"),
	INLINE_SEARCH_IN_SERVICEREQUEST(5,"inlinesearch"),
	DELETE_SERVICEREQUEST(6,"delete"),
	;
	
private Integer code;
	
	private String name;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	ServiceRequest_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
