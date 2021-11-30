package presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudenteDao;
import dao.StudenteDaoImpl;
import model.StudenteEs;

// action o rotta
@WebServlet("/studenti")
public class StudentiPresCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	private StudenteDao sti;   

	// costruttore
    public StudentiPresCtrl() {
    	this.sti = new StudenteDaoImpl();
    }

    // elenco studenti
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// studenti presi da db tramite daoimpl
		ArrayList<StudenteEs> listaStudenti = sti.getAll();
		
		
		// passare gli studenti alla pagina jsp trmite request
		request.setAttribute("chiave-studenti", listaStudenti);
		
		// giro tutto alla pagina jsp
		request.getRequestDispatcher("studenti-elenco.jsp").forward(request, response);
		
		
	}


	// aggiungi studente
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("sono nella post");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		
		// dao impl aggiunge un record
		boolean esito = sti.addOne(nome, cognome, email);				
		
		if(esito) { // se va tutto bene
			// redireziona su elenco studenti
			doGet(request, response);
		}else {
			// pagina errore
			request.setAttribute("chiave-errore", "Errore inserimento studente");
			
			// giro tutto alla pagina jsp
			request.getRequestDispatcher("errore.jsp").forward(request, response);
		}
	}

}
