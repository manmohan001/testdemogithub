package com.nhance.automation.enumFiles;

public enum DK_specific_identifier {

	DK_SET_UP(0,"moduleSpecificSetUp"),
	ISSUE_DK(1, "add"),
	DUPLICATE_DK(2, "duplicate"),
	VALIDATE_DK(3,"validateField"),
	EDIT_DK(4,"edit"),
	INLINE_SEARCH_IN_DK(5,"inlinesearch"),
	DELETE_DK(6,"delete"),
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
	
	DK_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
