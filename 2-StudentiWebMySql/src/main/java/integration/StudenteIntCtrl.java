package integration;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import dao.StudenteDao;
import dao.StudenteDaoImpl;
import model.StudenteEs;


@WebServlet("/api/studenti")
public class StudenteIntCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudenteDao sti;   
	
    public StudenteIntCtrl() {
    	this.sti = new StudenteDaoImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<StudenteEs> listaStudenti = sti.getAll();
		
//		StringBuilder s = new StringBuilder();
//		for (StudenteEs studenteEs : listaStudenti) {
//			s.append(studenteEs).append(";");
//		}
//		
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().print(s.toString());
		
		JSONArray jsArray = new JSONArray();
		
		for (StudenteEs s : listaStudenti) {
			JSONObject obj = new JSONObject();
			obj.put("id", s.getId());
			obj.put("nome", s.getNome());
			obj.put("cognome", s.getCognome());
			obj.put("email", s.getEmail());
			
			jsArray.put(obj);
		}
		
		// dire al broser che gli restituiamo un json
		response.setContentType("application/json");		
		
		// restituire i dati con il writer
		response.getWriter().append(jsArray.toString());		
		
	}

}
