package Contratti;

// udente che fa il login per usare l'aggenda

public class Utente {
	private String nome;
	private String cognome;
	private String login;
	private String pass;
	
	public Utente(String nome,String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		//this.pass = getAccount();
		
		
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
