/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_operatorlogika;

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
        
        // Operator logika --> i=operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi
        
        boolean a,b,c;
        // OR / atau (||)
        System.out.println("=== OR (||) ===");
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a +"  || " + b +" = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a +" || " + b +" = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a +"  || " + b +" = " + c);
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a +" || " + b +" = " + c);
        
        // AND  atau (&&)
        System.out.println("=== AND (&&) ===");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a +"  && " + b +" = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a +" && " + b +" = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a +"  && " + b +" = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a +" && " + b +" = " + c);
        
        // XOR  atau (^)
        System.out.println("=== XOR (^) ===");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a +" ^ " + b +" = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a +" ^ " + b +" = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a +" ^ " + b +" = " + c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a +" ^ " + b +" = " + c);
        
        // NOT / NEGASI --> FLIPPING
        System.out.println("=== NOT (!) ===");
        a = true;
        c = !a; 
        System.out.println(a + " ==> (!) " + c);
        a = false;
        c = !a; 
        System.out.println(a + " ==> (!) " + c);
        
    }
    
}
