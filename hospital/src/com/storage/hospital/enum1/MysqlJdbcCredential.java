package com.storage.hospital.enum1;

public enum MysqlJdbcCredential {
    URL("jdbc:mysql://localhost:3306/collection") ,USERNAME("root"),DONTSEE("Xworkzodc@123");
	private String value;

	
	private MysqlJdbcCredential(String value) {
		this.value = value;
	}
		
		public String getValue() {
			return value;
		}
}
