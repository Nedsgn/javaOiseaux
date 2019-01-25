package fr.Management.oiseaux;

import fr.Mangement.oiseaux;

public class Pingouin extends oiseaux implements Nageur {

	public Pingouin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pingouin(boolean plumes, String nom, String race, double taille, int age, boolean griffes, String couleur,
			String regime) {
		super(plumes, nom, race, taille, age, griffes, couleur, regime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nager() {
		System.out.println("je nage");

	}

}
