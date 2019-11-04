package gra.man.de;

import java.util.Scanner;

public class PatienTest {

	public static void main(String[] args) {
		String n ="";
		char gesch = 'd';
		double gew=0;
		double groess =0;
		String eing;
		
		boolean eingabe=false;
		
		Scanner scan = new Scanner(System.in);

		
		
		while(eingabe == false) {
			boolean eingGW =false;
			boolean eingGR =false;
			System.out.println("Bitte den Namen des Patienten eingeben: ");
			n=	scan.nextLine();
			System.out.println("Bitte geschlecht eingeben[m�nnlich/weiblich]: ");
			eing = scan.next();
			
			if(eing.equalsIgnoreCase("m�nnlich") || eing.equalsIgnoreCase("m")) {
				gesch = 'm';
			}
			else if(eing.equalsIgnoreCase("weiblich") || eing.equalsIgnoreCase("w")) {
				gesch = 'w';
			}else {
				System.out.println("[!]Fehler Falsche Eingabe");
			}
			
			try {
				System.out.println("Bitte die gr��e des Patienten eingeben: ");
				groess = scan.nextDouble();
				eingGR = true;
			}catch (Exception e) {
				System.out.println("[!]Fehler Bitte nur Zahlenwerte eingeben (f�r Komma-Zahlen , verwenden...)");		
				eingGR =false;
			}
			
			try {
				System.out.println("Bitte das Gewicht des Patienten eingeben: ");
				gew = scan.nextDouble();
				eingGW = true;
			}catch (Exception e) {
				System.out.println("[!]Fehler Bitte nur Zahlenwerte eingeben (f�r Komma-Zahlen , verwenden...)");		
				eingGW = false;
			}
			
			if(eingGR==true &&eingGW==true) {
				eingabe=true;
			}
			
		}
		
	
		
		Patient max = new Patient(n, gesch, gew, groess);
		max.getAlleWerte();
	}

}
