package Contratti;

import java.util.Scanner;

public class UsaContratto {

	
	  public static void main(String args[]) {
		// creiamo l'oggetto scanner
		Scanner scanner = new Scanner(System.in);
		
		//public Contratto(String nome, double canone,int periodo, double mm, int nsms, double MbDati ) {
		
		System.out.println("Inserisci nome prodotto/contratto:  ");
		String nomeprod = scanner.next();
		
		System.out.println("Inserire il periodo di pagamento del contratto: \n 1) per annuale; 2) per mensile");
		int periodo = scanner.nextInt();
		
		System.out.println("Inserire l'importo del canone ");
		double impcanone = scanner.nextDouble();
		
		System.out.println("Inserire il numero di minuti inclusi nel contratto ");
		int m = scanner.nextInt();
		
		System.out.println("Inserire il numero di sms inclusi nel contratto ");
		int smsm = scanner.nextInt();
		 
		System.out.println("Inserire i Md di dati inclusi nel contratto ");
		double mb = scanner.nextDouble();
		
		// creiamo il contratto
		Contratto c = new Contratto(nomeprod,impcanone,periodo, m, smsm, mb);  
		
		System.out.println("Il contratto è stato venduto?(Y/N) ");
		String ris = scanner.next();
		
		if (ris.equals("Y")) {
			// Aggiungiamo dopo la vendita del contratto l'utente e il numero di telefono
			System.out.println("Inserire il nome dell'utente che ha acquistato il contratto: ");
			String nomeutenre = scanner.next();
		
			System.out.println("Inserire il cognome dell'utente che ha acquistato il contratto: ");
			String cognomeutenre = scanner.next();
					
			//utente
			Utente u = new Utente(nomeutenre,cognomeutenre);
			// aggiunge l'utente al contratto
			c.setUteContatto(u);
		
			System.out.println("Inserire il numero di telefono associato al contratto: ");
			String num = scanner.next();
			
			// creaiamo l'oggetto telefono
			Telefono t = new Telefono(num); 
			
			c.setNumeroTelefonico(t);
			
		}
		
		System.out.println("il contratto: "+c.toString());
		scanner.close();
	}

}
