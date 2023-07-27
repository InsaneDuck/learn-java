package basic;

public class challenge1 {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.println(reverseStringRecursively(hello,""));
    }

    static String reverseStringRecursively(String string,String modifiedString)
    {
        if(string.length()==0)
        {
            return modifiedString;
        }
        modifiedString = modifiedString+string.charAt(string.length()-1);
        return reverseStringRecursively(string.substring(0,string.length()-1),modifiedString);
    }
}
