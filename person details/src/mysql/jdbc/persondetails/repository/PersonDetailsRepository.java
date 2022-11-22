package mysql.jdbc.persondetails.repository;

import mysql.jdbc.persondetails.dto.PersonDetailsDTO;

public interface PersonDetailsRepository {
	boolean save(PersonDetailsDTO dto);
	void displayAll();
	void displayAllAgeGreaterThanOrderByName(int age);
	void displayAllByGenderOrderByName(String gender);
	void displayAllBySalaryGreateThanOrderByDesc(double salary);
	void count();
	void displaySumOfSalary();
}
