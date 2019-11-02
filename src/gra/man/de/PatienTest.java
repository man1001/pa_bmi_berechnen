package gra.man.de;

public class PatienTest {

	public static void main(String[] args) {
		Patient max = new Patient("Max Musterkerl", 'm', 175.0, 1.82);
		System.out.println(max.bmiBerechnen());
		System.out.println(max.zustandBestimmen(max.bmiBerechnen()));
	}

}
