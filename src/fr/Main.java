package fr;

import fr.Management.oiseaux.Aigle;
import fr.Management.oiseaux.Autruche;
import fr.Management.oiseaux.Canard;
import fr.Management.oiseaux.Perruche;
import fr.Management.oiseaux.Pingouin;

public class Main {

	public static void main(String[] args) {// creation d'objets
		Pingouin pingu = new Pingouin(false, "pingu", "mer", 1.60, 3, true, "noir et blanc", "poisson d'eau douce");

		System.out.println(pingu.getNom() + " :");
		// pingu.nager();

		Autruche autruche = new Autruche(true, "autruche", "oiseau", 1.10, 1, true, "rose", "serpent");

		System.out.println(autruche.getNom() + " :");
		autruche.courir();

		Perruche coco = new Perruche(true, "Perruche coco", "race", 145, 12, true, "couleur", "regime");
		System.out.println(coco.getNom() + " :");
		coco.courir();

		Aigle vaillant = new Aigle(true, "Aigle vaillant", "1gt", 136, 12, true, "beige", "herbivore");
		System.out.println(vaillant.getNom() + " :");
		vaillant.voler();

		Canard ducky = new Canard(true, "Ducky le canard", "col vert", 10, 3, false, "vert et marron", "herbivore");//
		System.out.println(ducky.getNom() + " :");
		ducky.voler();
		ducky.nager();
	}

}
