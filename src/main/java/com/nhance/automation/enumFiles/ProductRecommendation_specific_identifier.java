package com.nhance.automation.enumFiles;

public enum ProductRecommendation_specific_identifier {

		
	PRODUCTRECCOMND_SET_UP(0,"moduleSpecificSetUp"),
	PRODUCTRECCOMND_ADD(1, "add"),
	DUPLICATE_PRODUCTRECCOMND(2, "duplicate"),
	VALIDATE_PRODUCTRECCOMND(3,"validateField"),
	EDIT_PRODUCTRECCOMND(4,"edit"),
	INLINE_SEARCH_IN_PRODUCTRECCOMND(5,"inlinesearch"),
	DELETE_PRODUCTRECCOMND(6,"delete"),
	PRODUCTRECCOMND_SORT(7, "sort"),
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
		
		ProductRecommendation_specific_identifier(Integer code, String name) {
	        this.code = code;
	        this.name = name;
	    }


	}

