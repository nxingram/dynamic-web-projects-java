package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.StudenteEs;

public class StudenteDaoImpl implements StudenteDao{

	// Queste proprietà ci servono per eseguire le query
	// e leggere i risultati
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public ArrayList<StudenteEs> getAll() {
//		String selectAll = FIND_ALL;
		ArrayList<StudenteEs> listaStudenti =  new ArrayList<StudenteEs>();
		
		try {
			// prendo la connessione da db
			this.conn = DB.connetti();			
			this.ps = conn.prepareStatement(FIND_ALL);
			this.rs = ps.executeQuery();
			
			while(this.rs.next()) {
				// riga corrente
				StudenteEs studente = new StudenteEs();
				
				studente.setNome(rs.getString("nome"));
				studente.setCognome(rs.getString("cognome"));
				studente.setEmail(rs.getString("email"));
				studente.setId(rs.getInt("id"));
				
				listaStudenti.add(studente);				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaStudenti;
	}


	@Override
	public boolean addOne(String nome, String cognome, String email) {
		try {
			this.conn = DB.connetti();	
			this.ps = conn.prepareStatement(ADD_ONE);
			
			// uno based (parte da 1)
			ps.setString(1, nome);
			ps.setString(2, cognome);
			ps.setString(3, email);
			
			this.ps.execute();			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	
	
	
}
