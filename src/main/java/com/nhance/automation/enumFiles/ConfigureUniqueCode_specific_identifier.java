package com.nhance.automation.enumFiles;

public enum ConfigureUniqueCode_specific_identifier {

			
		CONFIG_UNQCODE_SET_UP(0,"moduleSpecificSetUp"),
		 
		CONFIG_UNQCODE_MANUAL_ADD(1, "add"),
		CONFIG_UNQCODE_SEQUENCE_ADD(2, "add"),
		CONFIG_UNQCODE_IMPORT_ADD(3,"add"),
		DUPLICATE_CONFIG_UNQCODE_MANUAL(4, "duplicate"),
		DUPLICATE_CONFIG_UNQCODE_SEQUENCE(5, "duplicate"),
		VALIDATE_CONFIG_UNQCODE(6,"validateField"),
		EDIT_CONFIG_MANUAL_UNQCODE(7,"editManual"),
		EDIT_CONFIG_SEQUENTIAL_UNQCODE(8,"editManual"),
		INLINE_SEARCH_IN_CONFIG_UNQCODE(9,"inlinesearch"),
		DELETE_CONFIG_UNQCODE(10,"delete"),
		VALIDATE_GENERATED_METHOD(11,"validateGeneratedMethod"),
		CONFIG_UNQCODE_MANUAL_COUNT(12,"manualCount"),
		CONFIG_UNQCODE_SEQUENTIAL_COUNT(13,"sequentialCount"),
		CONFIG_UNQCODE_MANUAL_STATUS_COUNT(14,"statusManualCount"),
		CONFIG_UNQCODE_SEQUENTIAL_STATUS_COUNT(15,"statusSequentialCount"),

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
			
			ConfigureUniqueCode_specific_identifier(Integer code, String name) {
		        this.code = code;
		        this.name = name;
		    }


		}
