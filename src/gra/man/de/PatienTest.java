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
				
				boolean geschPrüfen = false;
				while(geschPrüfen == false) {
					System.out.println("Bitte geschlecht eingeben[männlich/weiblich]: ");
					eing = scan.next();
					
					if(eing.equalsIgnoreCase("männlich") || eing.equalsIgnoreCase("m")) {
						gesch = 'm';
						geschPrüfen=true;
					}
					else if(eing.equalsIgnoreCase("weiblich") || eing.equalsIgnoreCase("w")) {
						gesch = 'w';
						geschPrüfen=true;
					}else {
						System.out.println("[!]Fehler Falsche Eingabe");
					}
				}
				
				boolean grPruefen =false;
				while(grPruefen ==false) {
										
					try {
						System.out.println("Bitte die größe des Patienten eingeben: ");
						groess = scan.nextDouble();
						grPruefen=true;
						
					}catch (Exception e) {
						System.out.println("[!]Fehler Bitte nur Zahlenwerte eingeben (für Komma-Zahlen , verwenden...)");		
						
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
						System.out.println("[!]Fehler Bitte nur Zahlenwerte eingeben (für Komma-Zahlen , verwenden...)");		
						scan.next();
					}
				
				}
				

				
			
				
			
			Patient max = new Patient(n, gesch, gew, groess);
			max.getAlleWerte();
			
			boolean neue=true;
			while(neue==true) {
				System.out.println("\nWollen sie eine weitere Abfrage durchführen?");
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
