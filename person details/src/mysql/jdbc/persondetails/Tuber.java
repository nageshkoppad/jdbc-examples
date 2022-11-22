
package mysql.jdbc.persondetails;

import mysql.jdbc.persondetails.repository.PersonDetailsRepositoryImpl;
import mysql.jdbc.persondetails.service.PersonDetailsServiceImpl;

public class Tuber {

	public static void main(String[] args) {
		
		PersonDetailsRepositoryImpl power=new PersonDetailsRepositoryImpl();
		PersonDetailsServiceImpl ok=new PersonDetailsServiceImpl(power);
		ok.displayAll();
		ok.displayAllAgeGreaterThanOrderByName();
		ok.displayAllByGenderDescOrderByName();
		ok.displayAllBySalaryGreaterThanOrderByDesc();
		ok.count();
		ok.displaySumOfSalary();
	}

}
