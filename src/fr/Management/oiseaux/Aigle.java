package fr.Management.oiseaux;

import fr.Mangement.oiseaux;

public class Aigle extends oiseaux implements volant {

	public Aigle() {
		super();

	}

	public Aigle(boolean plumes, String nom, String race, double taille, int age, boolean griffes, String couleur,
			String regime) {
		super(plumes, nom, race, taille, age, griffes, couleur, regime);

	}

	@Override
	public void voler() {
		System.out.println("je vole dans les airs");

	}

}
