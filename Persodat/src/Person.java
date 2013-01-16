public class Person{
	
	String[][] persMatrix = new String[5][3];
	
	int c = 0;
	int i = 0;
	int z;
	
	public void setPerson(){
				
		for (i=0; i <=(persMatrix.length)-1; i++){
				
				int d = 0;
			
				persMatrix[i][0]	=StdInput.readString("Name    : ");
				persMatrix[i][1]	=StdInput.readString("Vorname : ");
				persMatrix[i][2] 	=StdInput.readString("E-Mail  : ");
				
				System.out.println("PersNr: "+(i+1)+" "+persMatrix[i][0]+" "+persMatrix[i][1]+" "+persMatrix[i][2]);
				System.out.println("Sind die Eingaben Korrekt?");
				c=StdInput.readInt("Geben Sie bitte 1 für Ja und 0 für Nein ein.");
				
				if (c==0){
					i--;
					continue;
				}
				
				else if (i!=4){
					z=4-i;
					System.out.println("Möchten Sie eine weitere Person Aufnehmen?");
					System.out.println("Es koennen noch "+z+" weitere Personen aufgenommen werden.");
					d=StdInput.readInt("Geben Sie bitte 1 für Ja und 0 für Nein ein.");
				}
				
				if (d==1){
					continue;
				}
				else{
					break;
				}
		}
		
	}

	public void printPerson(){
		for (int i=0; i <=(persMatrix.length)-1; i++)
		{
			System.out.println(persMatrix[i][0]+"\t"+persMatrix[i][1]+"\t"+persMatrix[i][2]);
		}
		
	}
}