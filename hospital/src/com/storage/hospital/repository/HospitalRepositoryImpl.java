package com.storage.hospital.repository;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.storage.hospital.dto.HospitalDTO;
import com.storage.hospital.enum1.MysqlJdbcCredential;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {

	}

	@Override
	public boolean save(HospitalDTO dto) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(MysqlJdbcCredential.URL.getValue(), MysqlJdbcCredential.USERNAME.getValue(),MysqlJdbcCredential.DONTSEE.getValue());
		 String name="insert into hospital values("+dto.getId()+",'"+dto.getName()+"','"+dto.getFounder()+"',"+dto.getSince()+",'"+dto.getSpecilist()+"')";
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

}
