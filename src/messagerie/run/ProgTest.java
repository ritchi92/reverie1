package messagerie.run;

import messagerie.models.Utilisateur;

public class ProgTest {
	
	public static void main(String[] args) {
		Utilisateur nil = new Utilisateur("nil","michel",19);
		Utilisateur zoro = new Utilisateur("zoro","roronoa");
		
		System.out.println(nil);
		nil.afficher();
		
		System.out.println(zoro);
		zoro.afficher();
		System.out.println(nil);
		try {
		nil.setAge(300);
		}catch (Exception e) {
			System.out.println("Age incorrect");
		}
	}
	
}//FIN
