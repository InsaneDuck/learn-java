package introduction.arrays.string;

public class StringMethods
	{
		public static void main(String[] args)
		{
			String s1="Hello World!!";   
			//String is a method to store chars in an array
			// H  e  l  l  0     W  o  r  l  d  !  !
			// 0  1  2  3  4  5  6  7  8  9  10 11 12  -total 13 chars including space
			System.out.println("charAt:3"+s1.charAt(3));
			//character at 3 in s1 String
			System.out.println("Length:"+s1.length());
			//length of the string s1
			System.out.println("Index of 'r':"+s1.indexOf('r'));
			//to get index of a char in a String
			System.out.println("Index of 'l':"+s1.indexOf('l'));
			//index of repeated char example it only shows index of it's first occurrence
			System.out.println("Last Index of 'l':"+s1.lastIndexOf('l'));
			//for rest of the String methods we take another string s2
			String s2="How are you?";
			System.out.println("Concatenation :"+s1.concat(s2));
			//s1=s1.concat(s2); concatenation can also performed by "+" operator s1=s1+s2;
			System.out.println(s1);
			//output to concat
			System.out.println("Uppercase :"+s1.toUpperCase());
			//converts every char to Upper case
			System.out.println("LOwercase :"+s1.toLowerCase());
			//converts every char to Lower case
			//let's compare to Strings
			String s3="hello";
			String s4="HELLO";
			System.out.println("equals :"+s3.equals(s4));
			//checks if string s3 is equal to s4 this is case sensitive
			System.out.println("Ignore case equals :"+s3.equalsIgnoreCase(s4));
			//checks if string s3 is equal to s4 this ignore case
			s1="Hello World";
			System.out.println("subString :"+s1.substring(0,5));
			//prints all values from 0 up to 5 but ignore 5
			int i=s1.indexOf('r');
			//to store index of a char in a int variable;
			System.out.println("Value of i:"+i);
			System.out.println(s1.substring(0,i));
			//prints from index 0 to int i above and i is index of r so 0 to 8
			System.out.println(s1.substring(2));
			//prints char after index 2
			s2="how are you?";
			System.out.println("Trim :"+s2.trim());
			//compareTo :-1 0 1
			System.out.println("compareTo"+s3.compareTo(s4));
			//compares them in lexical order also known as dictionary order
			//then returns -1,0 or 1
			System.out.println("compareToIgnoreCase :"+s2.compareToIgnoreCase(s4));
			//same as compare to but ignores case
			System.out.println("Splitting sentences by a char and storing them in array :");
			String[] split=s2.split(" ");
			//splitting when " " occurs
			for(int a=0;a<split.length;a++)
			{
				System.out.println(split);
			}
		}
	}
