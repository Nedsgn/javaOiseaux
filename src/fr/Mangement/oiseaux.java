package fr.Mangement;

public class oiseaux {

	protected boolean plumes;
	protected String nom;
	protected String race;
	protected double taille;
	protected int age;
	protected boolean griffes;
	protected String couleur;
	protected String regime;

	public oiseaux() {
		super();
	}

	public oiseaux(boolean plumes, String nom, String race, double taille, int age, boolean griffes, String couleur,
			String regime) {
		super();
		this.plumes = plumes;
		this.nom = nom;
		this.race = race;
		this.taille = taille;
		this.age = age;
		this.griffes = griffes;
		this.couleur = couleur;
		this.regime = regime;
	}

	public void manger() {
		System.out.println("miam miam");
	}

	public void boire() {
		System.out.println("slurp slup");
	}

	public void sauter() {
		System.out.println("et hop !");
	}

	public void courir() {
		System.out.println("je cours");
	}

	public void jouer() {
		System.out.println("jouer");
	}

	/**
	 * @return the plumes
	 */
	public boolean isPlumes() {
		return plumes;
	}

	/**
	 * @param plumes the plumes to set
	 */
	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the taille
	 */
	public double getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(double taille) {
		this.taille = taille;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the griffes
	 */
	public boolean isGriffes() {
		return griffes;
	}

	/**
	 * @param griffes the griffes to set
	 */
	public void setGriffes(boolean griffes) {
		this.griffes = griffes;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the regime
	 */
	public String getRegime() {
		return regime;
	}

	/**
	 * @param regime the regime to set
	 */
	public void setRegime(String regime) {
		this.regime = regime;
	}

}
