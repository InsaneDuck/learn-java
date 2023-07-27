package basic;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Basics {
    static int age;

    public static void main(String[] args) {

        Node<String> node = new Node<>("hello",null);
        Node<String> node1 = new Node<>("world",node);
        Node<String> node2 = new Node<>("alpha",node1);
        Node<String> node3 = new Node<>("beta",node2);
        Node<String> node4 = new Node<>("gamma",node3);
        Node<String> node5 = new Node<>("delta",node4);
        Node<String> node6 = new Node<>("jon",node5);
        Node<String> node7 = new Node<>("doe",node6);
        Node<String> head = new Node<>("foo",node7);

        Node.printAllNode(head);
    }
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        String s = "";
        return nums;
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static String run(int N, int M) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */


        String sequence = "";
        int length = M - N + 1;
        for(int i = N; i<length+1 ;i++)
        {
            if(i%15==0)
            {
                sequence = sequence + ",FizzBuzz";
            }
            else if(i%3==0)
            {
                sequence = sequence + ",Fizz";
            }
            else if(i%5==0)
            {
                sequence = sequence +",Buzz";
            }
            else{
                sequence = sequence+","+i;
            }
        }

        return sequence.substring(1);
    }



    <T> void test(T t){
        System.out.println(t);
    }

    public static void readFile()
    {
        File file = new File("./file.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            // Create buffer
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * enhanced switch statements introduced in java 12 and above
     * to assign output of switch directly to an object
     * <p>
     * for switch statements with complex case use ENUMS to define cases
     */
    public static void SwitchStatements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int stage = scanner.nextInt();
        String season = switch (stage) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            default -> {
                System.out.println("entered invalid number");
                yield "Invalid";
            }
        };

        System.out.println(season);

        enum Seasons {SPRING, SUMMER, WINTER, FALL}

        Seasons stageEnum = Seasons.SUMMER;

        season = switch (stageEnum) {
            case SUMMER, SPRING -> "Summer";
            case WINTER -> "Winter";
            case FALL -> "Fall";
            default -> {
                System.out.println("entered invalid number");
                yield "Invalid";
            }
        };

        System.out.println(season);

    }

    public static void Strings() {
        //strings are immutable any actions performed on them creates new string and reassigned
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;
        System.out.println("1: " + fullName);

        fullName = firstName.concat(" ").concat(lastName);
        System.out.println("2: " + fullName);

        //string builder can perform a lot of operations as below
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName);
        stringBuilder.append(" ");
        stringBuilder.append(lastName);
        fullName = stringBuilder.toString();
        System.out.println("3: " + fullName);

        stringBuilder.insert(0, "Hello ");
        fullName = stringBuilder.toString();
        System.out.println("4: " + fullName);

        stringBuilder.delete(0, 6);
        fullName = stringBuilder.toString();
        System.out.println("5: " + fullName);

        //same as string builder but thread safe because it's methods are synchronized
        StringBuffer stringBuffer = new StringBuffer();
    }
}
