import java.io.*;
import java.util.*;

public class Task6
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a word or number :");
    String input =sc.nextLine();
    input =input.toLowerCase();
    String reversed = new StringBuilder(input).reverse().toString();
    if(input.equals(reversed))
    {
      System.out.println(input + " is a palinrome");
    }
    else
    {
      System.out.println(input + " is not a palinrome");
    }
  } 
}