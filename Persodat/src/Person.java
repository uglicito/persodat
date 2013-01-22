public class Person{
	
	String[][] persMatrix = new String[5][3];	// Das Array und die Variablen müssen hier initalisiert und erzeugt werden, da 2 Methoden auf diese zugreifen. 
	int i;
	int j;
	int y;
	
	
	public void setPerson(){					// Es können max 5 Personen mit 3 Attributen eingegeben werden 
	
		int c	= 0;
		int d	= 0;
		int z;
		y 		= 0;							// Der Counter muss bei jedem erneutem Aufruf von setPerson() zurückgesetzt werden.
	
		for (i=0; i <persMatrix.length; i++){								// Ein füllen der letzten Spalte führt zu einem out of Bounds 
				
				persMatrix[i][0]	=StdInput.readString("Name    : ");		// Kann beliebig erweitert werden
				persMatrix[i][1]	=StdInput.readString("Vorname : ");
				persMatrix[i][2] 	=StdInput.readString("E-Mail  : ");
				
				System.out.println("PersNr: "+(i+1)+" "+persMatrix[i][0]+" "+persMatrix[i][1]+" "+persMatrix[i][2]);
				System.out.println("Sind die Eingaben Korrekt?");
				c=StdInput.readInt("Geben Sie bitte 1 für Ja und 0 für Nein ein.");
				
				if (c==0){						// Prüfung ob die Eingabe korrekt war, bei 0 ist sie falsch und das Array wird eine Zeile in der for-Schleife zurückgesetzt 
					i--;
					continue;
				}
				
				else if (i!=4){ 				// Solange das Array die Zeile 5 nicht erreicht hat führe diese Schleife aus.
					z=4-i;						// 4 minus Anzahl der Arrayzeile, ergibt die Anzahl der weiteren möglichen Personen 
					System.out.println("Möchten Sie eine weitere Person Aufnehmen?");
					System.out.println("Es koennen noch "+z+" weitere Personen aufgenommen werden.");
					d=StdInput.readInt("Geben Sie bitte 1 für Ja und 0 für Nein ein.");
					y++;						// Counter für die Methode printPerson damit keine Überflüssigen null-werte ausgegeben werden
					}
				if (d==1){						// Prüfung ob eine weitere Person ins array geschrieben werden soll
					continue;					// Continue führt vorzeitig an den Anfang der for-Schleife
				}
				else{
					System.out.println();
					break;						// break erzeugt den vorzeitigen Austieg aus der for-Schleife 
				}
		}
		
	}

	public void printPerson(){
		for (i=0; i < y ; i++)					// Gibt nur die Werte mittels y-Counter aus welche bei dem letzten durchlauf der Methode setPerson() erzeugt wurden.
		{
			for(j=0; j < 3; j++) 
			{
				System.out.print(persMatrix[i][j]+"\t");
			}
			System.out.println();
		}
			
	}
}