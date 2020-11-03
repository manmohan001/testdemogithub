package com.nhance.automation.enumFiles;

public enum PartnerPlan_specific_identifier {
	PARTNERPLAN_SET_UP(0,"moduleSpecificSetUp"),
	ADD_INSURANCE_PLAN(1, "add"),
	ADD_ACCESSORY_PLAN(2, "add"),
	DUPLICATE_PARTNER_PLAN(3, "duplicate"),
	VALIDATE_PARTNER_PLAN(4,"validateField"),
	EDIT_PARTNER_PLAN(5,"edit"),
	INLINE_SEARCH_IN_PARTNER_PLAN(6,"inlinesearch"),
	DELETE_PARTNER_PLAN(7,"delete"),
	DELETE_PARTNER_SLAB(8,"delete")
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
	
	PartnerPlan_specific_identifier(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

}
