package model;

public class Calciatore {

	private String nome;
	private String cognome;
	private String posizione;
	private int numero;
	private int eta;
	private String url;
	
	
	public Calciatore() {
	}


	public Calciatore(String nome, String cognome, String posizione, int numero, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.posizione = posizione;
		this.numero = numero;
		this.eta = eta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getPosizione() {
		return posizione;
	}


	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", posizione=" + posizione + ", numero=" + numero
				+ ", eta=" + eta + "]";
	}
	
	
	
	
	
}
