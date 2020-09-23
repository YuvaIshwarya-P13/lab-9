/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class expectiontypes {
     public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("\nArithmatic Exception:");
       
        try
        {
           int i=10;
           int j=0;
           int k=i/j;
        }
        catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("=================================================");
        System.out.println("\nArrayindexoutofbound Exception:");
        
        try
        {
            int a[]={1,2,3,4,5};
            int b=a[8];
            System.out.println(b);
        }
         catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("==================================================");
        System.out.println("\nNumberformat Exception:");
        
        try
        {
            String s="vvvvvv";
            int c=Integer.parseInt(s);
            System.out.println(c);
        }
         catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("==================================================");
        System.out.println("\nStringindexoutofbound Exception:");
        
        String s="Welcome to OOPS class";
        try
        {
            System.out.println(s.substring(6,90));
        }
        catch(Exception e)
        {
            System.out.println(e);        
        }
        
    }
}

    

