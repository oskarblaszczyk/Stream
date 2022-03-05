package joptionpane;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// 5) Za pomoca JOptionpane wczytaj liczbę i sprawdź czy jest parzysta (można
		// zrobić to za pomocą metody)
	
		
		String odczytLiczby2 = JOptionPane.showInputDialog("Podaj Liczbe do sprawdzenia");
		int liczba = Integer.parseInt(odczytLiczby2);
		if (liczba % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Podana liczba " + liczba + " jest parzysta");
		}else {
			JOptionPane.showMessageDialog(null, "Podana liczba " + liczba + " nie jest parzysta");

		}
		
		
		
	}

}
