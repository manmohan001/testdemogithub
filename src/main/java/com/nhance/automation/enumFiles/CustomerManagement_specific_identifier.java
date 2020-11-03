package com.nhance.automation.enumFiles;

public enum CustomerManagement_specific_identifier {
	
	CUSTOMER_SET_UP(0,"moduleSpecificSetUp"),
	ADD_CUSTOMER(1, "add"),
	DUPLICATE_CUSTOMER(2, "duplicate"),
	VALIDATE_CUSTOMER(3,"validateField"),
	EDIT_CUSTOMER(4,"edit"),
	INLINE_SEARCH_IN_CUSTOMER(5,"inlinesearch"),
	DELETE_CUSTOMER(6,"delete"),
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
	
	CustomerManagement_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

}
