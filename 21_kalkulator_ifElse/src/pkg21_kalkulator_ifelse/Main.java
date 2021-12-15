/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21_kalkulator_ifelse;

/**
 *
 * @author Ari
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("nilai operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();
        
        System.out.println("input user : " + a + " " + operator + " " + b);
        
        //operator tersedia * / + -
        if (operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        }else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        }else if (operator  == '/'){
            //pembagian
            if (b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            }else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
            
        }else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        }else {
            //operator tidak ditemukan 
            System.out.println("operator tidak ditemukann");
        }
        
        
    }
    
}
