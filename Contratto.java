package Contratti;

public class Contratto {
	
	private String prodotto;
	private Telefono numeroTelefonico;
	private Utente uteContatto; // chi stipula il contratto
	private double canone;
	private int periodo; // 12 mensile; 1 annuale
	private double minuti;
	private int SMS;
	private double mbDati;
	
	public Contratto(String nome, double canone,int periodo, double mm, int nsms, double MbDati ) {
		this.prodotto = nome;
		this.canone = canone;
		this.periodo = periodo;
		this.minuti = mm;
		this.SMS = nsms;
		this.mbDati = MbDati;
		
	}
	
	@Override
	public String toString() {
		return "Contratto [prodotto=" + prodotto + ", numeroTelefonico=" + numeroTelefonico + ", uteContatto="
				+ uteContatto + ", canone=" + canone + ", periodo=" + periodo + ", minuti=" + minuti + ", SMS=" + SMS
				+ ", mbDati=" + mbDati + ", getProdotto()=" + getProdotto() + ", getNumeroTelefonico()="
				+ getNumeroTelefonico() + ", getMbDati()=" + getMbDati() + ", getUteContatto()=" + getUteContatto()
				+ ", getCanone()=" + getCanone() + ", getPeriodo()=" + getPeriodo() + ", getMinuti()=" + getMinuti()
				+ ", getSMS()=" + getSMS() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getProdotto() {
		return prodotto;
	}
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}


	public Telefono getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(Telefono numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public double getMbDati() {
		return mbDati;
	}

	public void setMbDati(double mbDati) {
		this.mbDati = mbDati;
	}

	public Utente getUteContatto() {
		return uteContatto;
	}

	public void setUteContatto(Utente uteContatto) {
		this.uteContatto = uteContatto;
	}

	public double getCanone() {
		return canone;
	}
	public void setCanone(double canone) {
		this.canone = canone;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMinuti() {
		return minuti;
	}
	public void setMinuti(double minuti) {
		this.minuti = minuti;
	}
	public int getSMS() {
		return SMS;
	}
	public void setSMS(int sMS) {
		SMS = sMS;
	}
	
	

}
