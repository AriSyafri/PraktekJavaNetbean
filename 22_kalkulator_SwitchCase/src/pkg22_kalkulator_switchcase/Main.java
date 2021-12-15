/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22_kalkulator_switchcase;

/**
 *
 * @author Ari
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputUser;
        float a,b,hasil;
        String operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        
        System.out.print("operator = ");
        operator = inputUser.next();
        
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();
        
        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                if (b == 0){
                    System.out.println("nilai pembagi tidak boleh 0");
                }else {
                    hasil = a / b;
                    System.out.println("hasil = " + hasil);
                }
                break;
            default: 
                System.out.println("operator tidak ada");
        }
        
    }
    
}
