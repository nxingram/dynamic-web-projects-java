package test;

import java.util.ArrayList;

import database.DbCalciatori;
import model.Calciatore;

public class CalciatoreTest {

	public static void main(String[] args) {
		DbCalciatori db = new DbCalciatori(); 
		ArrayList<Calciatore> listCalciatori =  db.getCalciatori();
		
		for (Calciatore calciatore : listCalciatori) {
			System.out.println(calciatore);
		}
		

	}

}
