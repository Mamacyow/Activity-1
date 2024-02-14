/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Activity1 {

   
    public static void main(String[] args) {
      Scanner scn = new Scanner (System.in);
                
        System.out.println("Enter First Name: ");
        String fName = scn.nextLine();
        
        System.out.println("Enter Middle Name: ");
        String mName = scn.nextLine();
        
        System.out.println("Enter Last Name: ");
        String lName = scn.nextLine();
        
        System.out.println("Enter Your Gender: ");
        String gender = scn.nextLine();
        
        System.out.println("Enter Birthdate: ");
        int birthdate = scn.nextInt ();
       
        System.out.println("Enter Age: ");
        int age = scn.nextInt();
        
        
        
        System.out.println("Your Data: " + fName + " " + mName + " " + gender + " " + age + " " + birthdate );
        
    }
    
}
