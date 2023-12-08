package tn.essat.model;

public class Etudiant {
	private int id;
	private String nom;
	public Etudiant(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
