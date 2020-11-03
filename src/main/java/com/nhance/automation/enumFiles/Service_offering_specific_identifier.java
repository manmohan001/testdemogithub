package com.nhance.automation.enumFiles;

public enum Service_offering_specific_identifier {
	SERVICE_OFFERING_SET_UP(0,"moduleSpecificSetUp"),
	ADD_SERVICE_OFFERING(1, "add"),
	DUPLICATE_SERVICE_OFFERING(2, "duplicate"),
	VALIDATE_SERVICE_OFFERING(3,"validateField"),
	EDIT_SERVICE_OFFERING(4,"edit"),
	INLINE_SEARCH_IN_SERVICE_OFFERING(5,"inlinesearch"),
	DELETE_SERVICE_OFFERING(6,"delete"),
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
	
	Service_offering_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
