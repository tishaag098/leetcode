/*
Write an efficient program to print all the duplicates and their counts in the input string 


*/import java.util.*;
public class printDuplicates {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        printDups(str);
    }
    public static void printDups(String str)
    {
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            if(!hm.containsKey(str.charAt(i)))
               hm.put(str.charAt(i),1);
            else
               hm.put(str.charAt(i),hm.get(str.chatAt(i))+1);
        }

        for(int i=0;i<str.length();i++)
        {
            char key=hm.getKey();
            char value=hm.getValue();

            if(value>1)
              System.out.println(key+"counts= "+value);
        }

    }
}
