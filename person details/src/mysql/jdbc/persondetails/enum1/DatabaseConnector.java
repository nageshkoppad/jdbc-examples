package mysql.jdbc.persondetails.enum1;

public enum DatabaseConnector {
	  URL("jdbc:mysql://localhost:3306/collection") ,USERNAME("root"),DONTSEE("Xworkzodc@123");
		private String value;

		
		private DatabaseConnector(String value) {
			this.value = value;
		}
			
			public String getValue() {
				return value;
    }
}
