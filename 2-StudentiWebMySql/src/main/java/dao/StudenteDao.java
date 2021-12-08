package dao;

import java.util.ArrayList;

import model.StudenteEs;

public interface StudenteDao {

	String FIND_ALL = "select * from studente";	
	String ADD_ONE = "insert into studente(nome,cognome,email) values(?,?,?)";

	String FIND_ONE = "select * from studente where id =?";
	
	// matodi astratti
	ArrayList<StudenteEs> getAll(); 	
	boolean addOne(String nome, String cognome, String email);
	StudenteEs getOne(int id);
	
	
	
}
