package introduction.file_handling.demo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream input=new FileInputStream("files\\filedemo\\input");
		int b=input.read();
		while(b!=-1)
		{
			System.out.print((char)b);
			b=input.read();
		}
		input.close();
		System.out.println();
		FileInputStream i=new FileInputStream("D:\\new.txt");
		b=i.read();
		while(b!=-1)
		{
			System.out.print((char)b);
			b=i.read();
		}
		i.close();
		FileOutputStream output=new FileOutputStream("files\\filedemo\\output");
		String s="To output file";
		byte[] bt=s.getBytes();
		output.write(bt);
		output.close();
		FileWriter w=new FileWriter("files\\filedemo\\write");
		w.write("c");
		w.write("\nThis is new Line");
		w.write("10+20");
		w.write(10);
		w.close();
		System.out.println(10+20);
		FileReader r=new FileReader("files\\filedemo\\sample");
		BufferedReader buffer=new BufferedReader(r);
		String line=buffer.readLine();
		while(line!=null)
		{
			System.out.print(line);
			line=buffer.readLine();
		}
		buffer.close();
		r.close();
	}
}
