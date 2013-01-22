// http://docs.oracle.com/javase/tutorial/essential/io/objectstreams.html
import java.io.*;

public class ReadWrite extends Person
{
	public void write()
	{
		
		String datei = StdInput.readString("Geben Sie einen Dateinamen ein: z.B. Datei");
				
		try
		{
			PrintWriter pw = new PrintWriter(datei); // wird im Programmverzeichnis angelegt
			
			for (int i = 0; i < y; i++){
				for (int j = 0; j<persMatrix.length; j++){
					
					pw.print(persMatrix[i][j]+",");
					pw.flush();
				}
				System.out.println();
			}
			pw.close();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(FileNotFoundException f){
			System.out.println(f);
		}
	}
}
