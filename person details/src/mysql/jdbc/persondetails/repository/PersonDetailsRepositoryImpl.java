package mysql.jdbc.persondetails.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mysql.jdbc.persondetails.dto.PersonDetailsDTO;
import mysql.jdbc.persondetails.enum1.DatabaseConnector;

public class PersonDetailsRepositoryImpl implements PersonDetailsRepository {

	public PersonDetailsRepositoryImpl() {
		
	}
	@Override
	public boolean save(PersonDetailsDTO dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="insert into collection.personDetails1 values("+dto.getId()+",'"+dto.getName()+"','"+dto.getEmail()+"',"+dto.getMobileNo()+",'"+dto.getGender()+"','"+dto.getQualification()+"','"+dto.getMarried()+"','"+dto.getWorking()+"','"+dto.getCompanyName()+"',"+dto.getSalary()+","+dto.getAge()+","+dto.getExperience()+",'"+dto.getLocation()+"','"+dto.getCity()+"','"+dto.getState()+"','"+dto.getCountry()+"',"+dto.getAadharNo()+","+dto.getPanNo()+",'"+dto.getAlive()+"',"+dto.getBankAccountNo()+")";
			   Statement state= conn.createStatement();
			   System.out.println(state);
			  int n=state.executeUpdate(name);
			  if(n>0) {
				  return true;
			  }
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
			}
		return false;

	}
	@Override
	public void displayAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="select*from collection.personDetails1";
			   Statement state= conn.createStatement();
			   System.out.println(state);
			  ResultSet n=state.executeQuery(name);
			  
			   while(n.next()) {
				   System.out.println("id="+n.getInt(1)+" "+"name="+n.getString(2)+" "+"email="+n.getString(3)+" "+"mobileNo="+n.getLong(4)+" "+"gender="+n.getString(5)+" "+"qualification="+n.getString(6)+" "+"married="+n.getString(7)+" "+"working="+n.getString(8)+" "+"companyName="+n.getString(9)+" "+"salary="+n.getInt(10)+" "+"age="+n.getInt(11)+" "+"age="+n.getInt(11)+" "+"experience="+n.getInt(12)+" "+"location="+n.getString(13)+" "+"city="+n.getString(14)+" "+"state="+n.getString(15)+" "+"country="+n.getString(16)+" "+"aadharNo="+n.getLong(17)+" "+"panNo="+n.getLong(18)+" "+"alive="+n.getString(19)+" "+"bankAccountNo="+n.getLong(20));
				   
			   }
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
		}
		System.out.println("*************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
	    System.out.println("************************************************************************************************************************************************************************************************");
	
	}
	
	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="select*from collection.personDetails1 where age>="+age+" order by name desc";
			   Statement state= conn.createStatement();
			   System.out.println(state);
			  ResultSet n=state.executeQuery(name);
			  
			   while(n.next()) {
				   System.out.println("id="+n.getInt(1)+" "+"name="+n.getString(2)+" "+"email="+n.getString(3)+" "+"mobileNo="+n.getLong(4)+" "+"gender="+n.getString(5)+" "+"qualification="+n.getString(6)+" "+"married="+n.getString(7)+" "+"working="+n.getString(8)+" "+"companyName="+n.getString(9)+" "+"salary="+n.getInt(10)+" "+"age="+n.getInt(11)+" "+"age="+n.getInt(11)+" "+"experience="+n.getInt(12)+" "+"location="+n.getString(13)+" "+"city="+n.getString(14)+" "+"state="+n.getString(15)+" "+"country="+n.getString(16)+" "+"aadharNo="+n.getLong(17)+" "+"panNo="+n.getLong(18)+" "+"alive="+n.getString(19)+" "+"bankAccountNo="+n.getLong(20));
			   
			   }
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
		}
		System.out.println("*************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
	    System.out.println("************************************************************************************************************************************************************************************************");
	
	}
	@Override
	public void displayAllByGenderOrderByName(String gender) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="select*from collection.personDetails1  where gender='"+gender+"'order by name desc";
			   Statement state= conn.createStatement();
			   System.out.println(state);
			  ResultSet n=state.executeQuery(name);
			  
			   while(n.next()) {
				   System.out.println("id="+n.getInt(1)+" "+"name="+n.getString(2)+" "+"email="+n.getString(3)+" "+"mobileNo="+n.getLong(4)+" "+"gender="+n.getString(5)+" "+"qualification="+n.getString(6)+" "+"married="+n.getString(7)+" "+"working="+n.getString(8)+" "+"companyName="+n.getString(9)+" "+"salary="+n.getInt(10)+" "+"age="+n.getInt(11)+" "+"age="+n.getInt(11)+" "+"experience="+n.getInt(12)+" "+"location="+n.getString(13)+" "+"city="+n.getString(14)+" "+"state="+n.getString(15)+" "+"country="+n.getString(16)+" "+"aadharNo="+n.getLong(17)+" "+"panNo="+n.getLong(18)+" "+"alive="+n.getString(19)+" "+"bankAccountNo="+n.getLong(20));
			   
			   }
			   
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
		}
		System.out.println("*************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
	    System.out.println("************************************************************************************************************************************************************************************************");
	
	}
	@Override
	public void displayAllBySalaryGreateThanOrderByDesc(double salary) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="select*from collection.personDetails1  where salary>="+salary+"order by salary desc";
			   Statement state= conn.createStatement();
			   System.out.println(state);
			  ResultSet n=state.executeQuery(name);
			  
			   while(n.next()) {
				   System.out.println("id="+n.getInt(1)+" "+"name="+n.getString(2)+" "+"email="+n.getString(3)+" "+"mobileNo="+n.getLong(4)+" "+"gender="+n.getString(5)+" "+"qualification="+n.getString(6)+" "+"married="+n.getString(7)+" "+"working="+n.getString(8)+" "+"companyName="+n.getString(9)+" "+"salary="+n.getInt(10)+" "+"age="+n.getInt(11)+" "+"age="+n.getInt(11)+" "+"experience="+n.getInt(12)+" "+"location="+n.getString(13)+" "+"city="+n.getString(14)+" "+"state="+n.getString(15)+" "+"country="+n.getString(16)+" "+"aadharNo="+n.getLong(17)+" "+"panNo="+n.getLong(18)+" "+"alive="+n.getString(19)+" "+"bankAccountNo="+n.getLong(20));
			   
			   }
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
		}
		System.out.println("*************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
	    System.out.println("************************************************************************************************************************************************************************************************");
	
	}
	@Override
	public void count() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="select count(*) from collection.personDetails1";
			 Statement state= conn.createStatement();
			    ResultSet n=state.executeQuery(name);
			     
			      while(n.next()) {
				  int count=n.getInt(1);
				  System.out.println("total records>>"+ count);
			     
			      }
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
		}
		System.out.println("*************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
	    System.out.println("************************************************************************************************************************************************************************************************");
	
	}
	@Override
	public void displaySumOfSalary() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(DatabaseConnector.URL.getValue(), DatabaseConnector.USERNAME.getValue(),DatabaseConnector.DONTSEE.getValue());
			 String name="select sum(salary) from collection.personDetails1";
			  // PreparedStatement ok=conn.prepareStatement(name);
			   Statement state= conn.createStatement();
			    ResultSet n=state.executeQuery(name);
			      n.next();
				  int count=n.getInt(1);
				  System.out.println("total salary>>"+ count);
			conn.close();
			}
			catch(ClassNotFoundException | SQLException e) {
				System.out.println("file not found");
		}
	}
	

}
