package messagerie.models;

import java.util.Date;

public class Utilisateur extends Object {
	private String firstname ;
	private String lastname;
	private Date bDate;
	
	
	
	public Utilisateur(String firstname ,String lastname) {
		this(firstname,lastname,null);
	}
	public Utilisateur(String firstname ,String lastname, Date bDate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.bDate = bDate;
	}
	
	public Utilisateur() {
		this("?","?",null);
	}
	public void afficher() {
		System.out.println(firstname+"...");
	}
	
	@Override
	public 	String toString() {
		return firstname + " " + lastname + " ("+ bDate + " ans )";
	}
	//accesseur et mutateur\\
	
	
	public String getfirstname() {
		return this.firstname;
		}
		
	public void setfirstname(String firstname) {
		this.firstname=firstname;
		}
		
	public String getlastname() {
		return this.lastname;
		}
		
	public void setlastname(String lastname) {
		this.lastname=lastname;
		}
	
	public Date getbDate() {
		return bDate;
		}
		
	public void setbDate(int age, Date bDate) {
		if (age>=0 && age <=130) {
			this.bDate=bDate;
		}else{
			throw new NumberFormatException();
		}
	}
	public int getAge() {
		return 0;
		
	}
		
}//fin
