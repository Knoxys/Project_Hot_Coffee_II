public class TicketSystem {

	public static void main(String[] args) {
		
		try {
			// 1. METHODE Passwort BEIPSIEL
			new Passwort().passwordExample();
			//BEISPIEL ENDE
			
			Benutzer b = new Benutzer();
			Wahl 	 w = new Wahl();
			DB 		 db = new DB();
			Zeit 	 z = new Zeit();
			Dokument d = new Dokument();
			
			b.getName();
			w.getStichwort();
			z.getZeitStempel();
			d.setDokument();
			db.setDB();
			
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}
		
		
	}
}


