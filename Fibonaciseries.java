import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner obj=new Scanner(System.in);
     System.out.println("enter x");
    int x=obj.nextInt();
    int a=0; 
    int b=1;
    System.out.print(a);
    System.out.print(b);
    for(int i=0;i<x-2;i++)
    {
      
     
    int  c=a+b;
      System.out.print(c);
      
      a=b;
      b=c;
    
    }
   }
 }
    
