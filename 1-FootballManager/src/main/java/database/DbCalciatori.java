package database;

import java.util.ArrayList;
import java.util.Arrays;

import model.Calciatore;

public class DbCalciatori {
	
	private ArrayList<Calciatore> listCalciatori;
	
	//costruttore
	public DbCalciatori() { 
		this.listCalciatori = new ArrayList<Calciatore>();
		listCalciatori.add(new Calciatore("Ciro", "Immobile", "Attaccante", 17, 31));
		listCalciatori.add(new Calciatore("Nicolò", "Barella", "centrocampista", 23, 24));
		listCalciatori.add(new Calciatore("Daniel", "Maldini", "Attaccante", 8, 19));
		listCalciatori.get(0).setUrl("https://upload.wikimedia.org/wikipedia/commons/3/35/20150616_-_Portugal_-_Italie_-_Gen%C3%A8ve_-_Ciro_Immobile_1.jpg");
		listCalciatori.get(1).setUrl("https://sempreinter.com/wp-content/uploads/2020/06/barella-1-scaled-e1591890059328.jpg");
		listCalciatori.get(2).setUrl("https://icdn.sempremilan.com/wp-content/uploads/2020/02/AC-Milan-v-Hellas-Verona-Serie-A-1580673373.jpg");
	}
	
	public ArrayList<Calciatore> getCalciatori() {
		return this.listCalciatori;
	}
	
	public Calciatore getCalciatoreById(int id) {
		return this.listCalciatori.get(id);
	}

}
