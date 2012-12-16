public class Person{
	/*
	  String name;
	String vorname;
	String email;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setVorname(String vorname)
	{
		this.vorname=vorname;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	String getName(){
		return name;
	}
	String getVorname(){
		return vorname;
	}
	String getEmail(){
		return email;
	}   
	 */
	public void setPerson(){
		
		int b;
		int c;
		int i;
				
		String[][] persMatrix;
		persMatrix = new String[5][3];
		
		for (i=1; i < persMatrix.length; i++){
			if (i!=1)
			{
				i=i-1;
				System.out.println(i+" "+persMatrix[i][0]+" "+persMatrix[i][1]+" "+persMatrix[i][2]);
				System.out.println("Sind die Eingaben Korrekt?");
				c=StdInput.readInt("Geben Sie bitte 1 für Ja und 0 für Nein ein");
			}			
				
				System.out.println("Möchten Sie eine weitere Person Aufnehmen?");
				b=StdInput.readInt("Geben Sie bitte 1 für Ja und 0 für Nein ein");
			 	if (b==1){
						persMatrix[i][0]	=StdInput.readString("Name    : ");
						persMatrix[i][1]	=StdInput.readString("Vorname : ");
						persMatrix[i][2] 	=StdInput.readString("E-Mail  : ");
				}
				else{
							System.out.println(i+" "+persMatrix[i][0]+" "+persMatrix[i][1]+" "+persMatrix[i][2]);
							break;
				}
			}
		}
	}
//	/*void setName(String neuName)
//	{
//		name = neuName;
//	}
//	void setVorname(String neuVorname)
//	{
//		name = neuVorname;
//	}
//	void setEmail(String neuEmail)
//	{
//		name = neuEmail;
//	}
//	*/
//public void setPerson(String name, String vorname, String email)
//{
//	this.name=name;
//	this.vorname=name;
//	this.email=name;
//}
