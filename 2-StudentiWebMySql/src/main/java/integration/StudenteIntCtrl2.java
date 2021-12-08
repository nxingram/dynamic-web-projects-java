package integration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.StudenteDao;
import dao.StudenteDaoImpl;
import model.StudenteEs;

@WebServlet("/api/studenti/one")
public class StudenteIntCtrl2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudenteDao sti;

	public StudenteIntCtrl2() {
		this.sti = new StudenteDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		System.out.println(id);
		StudenteEs s =  sti.getOne(Integer.parseInt(id));
		
		JSONObject obj = new JSONObject();
		obj.put("id", s.getId());
		obj.put("nome", s.getNome());
		obj.put("cognome", s.getCognome());
		obj.put("email", s.getEmail());
		
		// dire al broser che gli restituiamo un json
		response.setContentType("application/json");

		// restituire i dati con il writer
		response.getWriter().append(obj.toString());

	}

}
