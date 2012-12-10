public class Person{
	String name;
	String vorname;
	String email;
	String person;
	
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
		name	=StdInput.readString("Name    : ");
		vorname =StdInput.readString("Vorname : ");
		email 	=StdInput.readString("E-Mail  : ");
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
