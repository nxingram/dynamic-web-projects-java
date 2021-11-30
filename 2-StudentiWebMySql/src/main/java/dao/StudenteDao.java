package dao;

import java.util.ArrayList;

import model.StudenteEs;

public interface StudenteDao {
	
	// proprietà: static final 
	String TABLE_NAME = "studente";
	String FIND_ALL = "select * from " + TABLE_NAME;
	String ADD_ONE = "insert into "+ TABLE_NAME + "(nome,cognome,email) values(?,?,?)";
	
	// metodi: astratti
	ArrayList<StudenteEs> getAll(); 	
	boolean addOne(String nome, String cognome, String email);	
	
}
