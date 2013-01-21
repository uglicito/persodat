/**
  http://stackoverflow.com/questions/5820508/writing-an-array-to-a-file-in-java
  public void save(String fileName) throws FileNotFoundException {
    BufferedWriter writer = null;
    try {

        writer = new BufferedWriter(new FileWriter(fileName));
        for ( int i = 0; i < nbrMovies; i++)
        {      
          writer.write(movies[i].getName());
          writer.newLine();
      writer.flush();
        }

    } catch(IOException ex) {
        ex.printStackTrace();
    } finally{
        if(writer!=null){
            writer.close();
        }  
    }
}
 @author user

*/

// http://docs.oracle.com/javase/tutorial/essential/io/objectstreams.html
import java.io.*;

public class ReadWrite 
{
	public void write()
	{
		Person pw 	= new Person();
		ObjectOutputStream datei = new ObjectOutputStream (new FileOutputStream("Person.txt"));
		datei.write(pw.printPerson()); // versuch eine Metode zu verweden 
	}
}
