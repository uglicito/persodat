
public class Main{
		public static void main(String[]args){
	
			int wahl;
			Person p 	= new Person();
			ReadWrite w = new ReadWrite();
	
			for (;;) {
				System.out.println("		Persodat - Kontaktverwaltung");
				System.out.println("Wollen Sie...");
				System.out.println();
				System.out.println("   eine neue Person aufnehmen >1");
				System.out.println("            Records auflisten >2");
				System.out.println("Records in eine Datei sichern >3");
				System.out.println("Records aus einer Datei laden >4");
				System.out.println("                Datei Löschen >5");
				System.out.println("       das Programm verlassen >6");
				System.out.println();
				wahl=StdInput.readInt("Ihre Eingabe von 1-6: ");
		
				//	while (wahl>6 || wahl<1);
				switch (wahl)
				{
				case 1:		p.setPerson();		break;
				case 2:		p.printPerson();	break;
				case 3:							break;
//		case 4:  System.out.println("Ausreichend");break;
//		case 5:  System.out.println("Mangelhaft");break;
//		case 6:  System.out.println("Ungenügend");break;
				}
			}
  }
}
