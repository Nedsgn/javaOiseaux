package fr.Management.oiseaux;

import fr.Mangement.oiseaux;

public class Canard extends oiseaux implements volant, Nageur {// on lui implémente ici deux interfaces ! {

	public Canard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Canard(boolean plumes, String nom, String race, double taille, int age, boolean griffes, String couleur,
			String regime) {
		super(plumes, nom, race, taille, age, griffes, couleur, regime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nager() {
		System.out.println("je nage");

	}

	@Override
	public void voler() {
		System.out.println("je vole");

	}

}
