import java.io.*;
import java.util.*;
   class stringOp{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Input String:");
      String str=sc.nextLine();
      int count=0;
      for(int i=0;i<str.length();i++)
        {
          for(int j=0;j<str.length();j++)
            {
              if(str.charAt(i)==str.charAt(j))
              {
                count++;
              }
            }
            if(count==1)
            {
              System.out.print(str.charAt(i)+" ");
              count=0;
            }
            else
            {
              count=0;
            }
        }  
        
     }
   }  
        
