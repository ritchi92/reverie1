package messagerie.models;

import java.util.Date;

public class Utilisateur extends Object {
	private String nom ="nil";
	private String prenom;
	private Date dNaissance;
	
	public Utilisateur(String nom ,String prenom, Date dNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dNaissance = dNaissance;
	}
	public Utilisateur(String nom ,String prenom) {
		this(nom,prenom,null);
	}
	public void afficher() {
		System.out.println(nom+"...");
	}
	
	@Override
	public 	String toString() {
		return nom + " " + prenom + " ("+ age + " ans )";
	}
	//accesseur et mutateur
	public String getNom() {
		return this.nom;
		}
		
	public void setNom(String nom) {
		this.nom=nom;
		}
		
	public String getPrenom() {
		return this.prenom;
		}
		
	public void setPrenom(String prenom) {
		this.prenom=prenom;
		}
	
	public int getAge() {
		return age;
		}
		
	public void setAge(int age) {
		if (age>=0 && age <=130) {
			this.age=age;
		}else{
			throw new NumberFormatException();
		}
	}
	public int getAge() {
		
		
	}
		
}//fin
