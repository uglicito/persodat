/**
 * 
 */

/**
 * For eine Personendatei gibt es mehrere Methoden
 * 	-> Records erstellen
 *	-> Records ausgeben
 *	-> Datei auslesen
 * 	-> Datei schreiben
 * 	-> Datei löschen
 * @author user
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
	
	int wahl;
	// kommentar hallo
	do {
		System.out.println("		Persodat - Kontaktverwaltung");
		System.out.println("Wollen Sie...");
		System.out.println();
		System.out.println("   eine neue Person aufnehmen >1");
		System.out.println("            Records auflisten >2");
		System.out.println("Records in eine Datei sichern >3");
		System.out.println("Records aus einer Datei laden >4");
		System.out.println("                Datei Löschen >5");
		System.out.println("       das Programm verlassen >6");
		
		wahl=StdInput.readInt();
		
		} while (wahl>6);

	}

}
