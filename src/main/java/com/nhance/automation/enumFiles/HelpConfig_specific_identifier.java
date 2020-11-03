package com.nhance.automation.enumFiles;

public enum HelpConfig_specific_identifier {

	HELPCONFIG_SET_UP(0,"moduleSpecificSetUp"),
	ADD_HELPCONFIG(1, "add"),
	DUPLICATE_HELPCONFIG(2, "duplicate"),
	VALIDATE_HELPCONFIG(3,"validateField"),
	EDIT_HELPCONFIG(4,"edit"),
	INLINE_SEARCH_IN_HELPCONFIG(5,"inlinesearch"),
	DELETE_HELPCONFIG(6,"delete"),
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
	
	HelpConfig_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
