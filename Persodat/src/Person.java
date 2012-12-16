public class Person{
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
	public void setPerson(){
		
		String[][] persMatrix = new String[5][];
		
		for (int i=0; i < persMatrix.length; i++){
			
			int b;
			
			do{
				System.out.println("Möchten Sie eine weitere Person Aufnehmen?");
				b=StdInput.readInt("Geben Sie bitte "+1+" für Ja und "+0+" für Nein ein");
			}while(b<0 || b>2);
			
			if (b==1){
					persMatrix[0][i]	=StdInput.readString("Name    : ");
					persMatrix[1][i]	=StdInput.readString("Vorname : ");
					persMatrix[2][i] 	=StdInput.readString("E-Mail  : ");
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
