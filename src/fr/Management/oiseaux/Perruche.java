package fr.Management.oiseaux;

import fr.Mangement.oiseaux;

public class Perruche extends oiseaux implements volant {

	public Perruche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perruche(boolean plumes, String nom, String race, double taille, int age, boolean griffes, String couleur,
			String regime) {
		super(plumes, nom, race, taille, age, griffes, couleur, regime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voler() {
		System.out.println("je voooooooooole");

	}

}
