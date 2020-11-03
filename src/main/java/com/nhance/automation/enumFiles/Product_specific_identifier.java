package com.nhance.automation.enumFiles;

public enum Product_specific_identifier {

	
	PRODUCT_SET_UP(0,"moduleSpecificSetUp"),
	ADD_PRODUCT(1, "add"),
	DUPLICATE_PRODUCT(2, "duplicate"),
	VALIDATE_PRODUCT(3,"validateField"),
	EDIT_PRODUCT(4,"edit"),
	INLINE_SEARCH_IN_PRODUCT(5,"inlinesearch"),
	DELETE_PRODUCT(6,"delete"),
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
	
	Product_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }


}
