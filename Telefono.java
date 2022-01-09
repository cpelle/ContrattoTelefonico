package Contratti;


public class Telefono {

	private String numero;

	public Telefono(String n) {
		this.numero = n;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", getNumero()=" + getNumero() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
