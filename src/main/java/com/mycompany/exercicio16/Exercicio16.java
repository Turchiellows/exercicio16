package com.mycompany.exercicio16;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
         // INSTANTIATE
        Scanner sc = new Scanner(System.in);
	
	
	// DECLARATE
        double a;
        double b;
        int option;
        
	
	// COLLECT DATA
        System.out.print("A : ");
        a = sc.nextDouble();
        System.out.print("B : ");
        b = sc.nextDouble();
       
        
        // MENU
        System.out.println("======================================");
        System.out.println("CHOSE AN OPTION");
        System.out.println("======================================");
        System.out.println("1 - ADD");
        System.out.println("2 - SUB");
        System.out.println("3 - MUL");
        System.out.println("4 - DIV");
	 System.out.print("Your option: ");
        option = sc.nextInt();
        
       

        // OUTPUT
        switch (option) {
            case 1:
                System.out.println(a + b);
                break;
                
            case 2:
                 System.out.println(a - b);
                break;
                
            case 3:
                 System.out.println(a * b);
                break;
                
            default: 
                 System.out.println(a / b);
        }

               
       
        
        
  
    }
}
