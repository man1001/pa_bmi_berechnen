package gra.man.de;

public class Patient {
	String name;
	char geschlecht;
	double gewicht;
	double groesse;
	
	public Patient(String name, char geschlecht, double gewicht, double groesse){
		this.name = name;
		this.geschlecht = geschlecht;
		this.gewicht = gewicht;
		this.groesse = groesse;
	}
	
	public double bmiBerechnen(){
		double bmi=0;
		bmi = gewicht/(groesse*groesse);	
		return bmi;
	}
	
	public double idealBerechnen(){
		if(geschlecht=='m'){
			return 22.0;
		}
		if(geschlecht=='w'){
			return 21.0;
		}
		return 0;
	}
	
	public String zustandBestimmen(double bmi){
		
		// Wenn Patient maenlich ist
		if(geschlecht=='m'){
			if(bmi<20){
				return "Untergewicht";
			}
			if(20<=bmi && bmi<25){
				return "Normalgewicht";
			}
			if(bmi>=25 && bmi<30){
				return "�bergewicht";
			}
			if(bmi>=30 && bmi<40){
				return "Starkes �bergewicht (Adipositas)";
			}
			if(bmi>=40){
				return "Extremes �bergewicht";
			}
			
		}
		//wenn Patient weiblich ist:
		if(geschlecht=='w'){
			if(bmi<19){
				return "Untergewicht";
			}
			if(19<=bmi && bmi<24){
				return "Normalgewicht";
			}
			if(bmi>=24 && bmi<30){
				return "�bergewicht";
			}
			if(bmi>=30 && bmi<40){
				return "Starkes �bergewicht (Adipositas)";
			}
			if(bmi>=40){
				return "Extremes �bergewicht";
			}
			
		}
		
		return "";
	}
	
}
