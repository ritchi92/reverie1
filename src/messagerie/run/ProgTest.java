package messagerie.run;

import Reverie.technics.MinCharRule;
import Reverie.technics.Password;
import Reverie.technics.SpeCharRule;
import Reverie.technics.SpeCharRuleRegex;
import messagerie.models.Utilisateur;

public class ProgTest {
	
	
	
	
	public static void main(String[] args) {
		
		
		Utilisateur nil = new Utilisateur("nil","michel");
		Utilisateur zoro = new Utilisateur("zoro","roronoa");
		
		System.out.println(nil);
		nil.afficher();
		
		System.out.println(zoro);
		zoro.afficher();
		System.out.println(nil);
		try {
		nil.setdNaissance(300);
		}catch (Exception e) {
			System.out.println("Age incorrect");
		}
		Password motDePassword=new Password("azerty?!azer");
		motDePassword.addRule(new MinCharRule(10));
		motDePassword.addRule(new SpeCharRuleRegex(2));
		System.out.println(motDePassword.isValid());
	}
	
}//FIN
