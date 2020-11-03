package com.nhance.automation.enumFiles;

public enum Partner_specific_identifier {
	PARTNER_SET_UP(0,"moduleSpecificSetUp"),
	ADD_PARTNER(1, "add"),
	DUPLICATE_PARTNER(2, "duplicate"),
	VALIDATE_PARTNER(3,"validateField"),
	EDIT_PARTNER(4,"edit"),
	INLINE_SEARCH_IN_PARTNER(5,"inlinesearch"),
	DELETE_PARTNER(6,"delete"),
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
	
	Partner_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
