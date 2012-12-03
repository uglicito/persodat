/**
 * 
 */

/**
 * Eine Person hat Eigenschaften
 * 
 * 	-> Name
 * 	-> Vorname
 * 	-> E-Mail
 * 
 * @author user
 *
 */
public class person {
	
	String name;
	String vorname;
	String email;
	
	String getName()
	{
		return name;
	}
	String getVorname()
	{
		return vorname;
	}
	String getEmail()
	{
		return email;
	}
	void setPerson (String n, String v, String e)
	{
		name 	= n;
		vorname = v;
		email 	= e;
	}
	/*
	void setName(String neuName)
	{
		name = neuName;
	}
	void setVorname(String neuVorname)
	{
		name = neuVorname;
	}
	void setEmail(String neuEmail)
	{
		name = neuEmail;
	}
	*/
}
