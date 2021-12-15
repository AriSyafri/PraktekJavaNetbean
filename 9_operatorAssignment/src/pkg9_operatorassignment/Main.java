/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_operatorassignment;

/**
 *
 * @author Ari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Operator assignment
        
        //Assignment operator jumlah
        int a = 1;
        a += 10; //a = a +10
        System.out.println("nilai a = " + a);
        
        //Assignment operator pengurangan
        int b = 10;
        b -= 5;
        System.out.println("nilai b = " + b);
        
        //Assignment operator perkalian
        int c = 3;
        c *= 4; 
        System.out.println("nilai c = " + c);
        
        //Assignment operator pembagian
        int d = 10;
        d /= 5;
        System.out.println("nilai d = " + d);
        
        //Assignment operator modulus
        int e = 12;
        e %= 2;
        System.out.println("nilai e = " + e);
    }
    
}
