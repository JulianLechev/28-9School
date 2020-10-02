package edy.smg;

import javax.swing.JOptionPane;

public class FallingMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals = {"Bobar", "Guba", "Cvete"};
		String input = (String)JOptionPane.showInputDialog(null,
				"Choose an animal",
				"Animals",
				3,
				null,
				animals,
				animals[0]);
		System.out.println(input);
	}

}
