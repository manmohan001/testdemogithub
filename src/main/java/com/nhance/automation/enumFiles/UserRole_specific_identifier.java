package com.nhance.automation.enumFiles;

public enum UserRole_specific_identifier {
	
	USERROLE_SET_UP(0,"moduleSpecificSetUp"),
	ADD_USERROLE(1, "add"),
	DUPLICATE_USERROLE(2, "duplicate"),
	VALIDATE_USERROLE(3,"validateField"),
	EDIT_USERROLE(4,"edit"),
	INLINE_SEARCH_IN_USERROLE(5,"inlinesearch"),
	DELETE_USERROLE(6,"delete"),
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
	
	UserRole_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

}
