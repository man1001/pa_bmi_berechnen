package gra.man.de;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class PatienTest {

	public static void main(String[] args) {
		String n ="";
		char gesch = 'd';
		double gew=0;
		double groess =0;
		String eing;
		
		boolean neuerLoop=true;
		
		

		while(neuerLoop==true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Bitte den Namen des Patienten eingeben: ");
				n=scan.nextLine();
				
				boolean geschPr�fen = false;
				while(geschPr�fen == false) {
					System.out.println("Bitte geschlecht eingeben[m�nnlich/weiblich]: ");
					eing = scan.next();
					
					if(eing.equalsIgnoreCase("m�nnlich") || eing.equalsIgnoreCase("m")) {
						gesch = 'm';
						geschPr�fen=true;
					}
					else if(eing.equalsIgnoreCase("weiblich") || eing.equalsIgnoreCase("w")) {
						gesch = 'w';
						geschPr�fen=true;
					}else {
						System.out.println("[!]Fehler Falsche Eingabe");
					}
				}
				
				boolean grPruefen =false;
				while(grPruefen ==false) {
										
					try {
						System.out.println("Bitte die gr��e des Patienten eingeben: ");
						groess = scan.nextDouble();
						grPruefen=true;
						
					}catch (Exception e) {
						System.out.println("[!]Fehler Bitte nur Zahlenwerte eingeben (f�r Komma-Zahlen , verwenden...)");		
						
						scan.next();
					}
					
				}

				boolean gewPruefen =false;
				while(gewPruefen==false) {
					try {
						System.out.println("Bitte das Gewicht des Patienten eingeben: ");
						gew = scan.nextDouble();	
						gewPruefen=true;
					}catch (Exception e) {
						System.out.println("[!]Fehler Bitte nur Zahlenwerte eingeben (f�r Komma-Zahlen , verwenden...)");		
						scan.next();
					}
				
				}
				

				
			
				
			
			Patient max = new Patient(n, gesch, gew, groess);
			max.getAlleWerte();
			
			boolean neue=true;
			while(neue==true) {
				System.out.println("\nWollen sie eine weitere Abfrage durchf�hren?");
				String antwort =scan.next();
				if(antwort.equalsIgnoreCase("y")) {
					neue =false;
					
				}
				if(antwort.equalsIgnoreCase("n")) {
					neuerLoop=false;
					neue =false;
				}
			}
			
		}
		

		
	
		
		
	}

}
