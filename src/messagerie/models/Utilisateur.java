package messagerie.models;

public class Utilisateur extends Object {
	private String nom ="nil";
	private String prenom;
	private int age;
	
	public Utilisateur(String nom ,String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Utilisateur(String nom ,String prenom) {
		this(nom,prenom,0);
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
		
}//fin
