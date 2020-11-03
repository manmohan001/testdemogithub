package com.nhance.automation.enumFiles;

public enum ProductDiscovery_specific_identifier {
	
	PRODUCTDISCOVERY_SET_UP(0,"moduleSpecificSetUp"),
	ADD_PRODUCTDISCOVERY(1, "add"),
	DUPLICATE_PRODUCTDISCOVERY(2, "duplicate"),
	VALIDATE_PRODUCTDISCOVERY(3,"validateField"),
	EDIT_PRODUCTDISCOVERY(4,"edit"),
	INLINE_SEARCH_IN_PRODUCTDISCOVERY(5,"inlinesearch"),
	DELETE_PRODUCTDISCOVERY(6,"delete"),
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
	
	ProductDiscovery_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

}
