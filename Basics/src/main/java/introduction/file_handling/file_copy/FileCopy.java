package introduction.file_handling.file_copy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopy
{
	public static void copypaste(FileInputStream source,FileOutputStream destination) throws IOException
	{
		int b=source.read();
		String s="";
		while(b!=-1)
		{
			s=s+(char)b;
			b=source.read();
		}
		System.out.println(s);
		byte[] bt=s.getBytes();
		destination.write(bt);
	}
	public static void main(String[] args) throws IOException
	{
		FileInputStream source=new FileInputStream("files\\filecopy\\source");
		FileOutputStream destination=new FileOutputStream("files\\filecopy\\destination");
		copypaste(source,destination);
	}
}
