/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_pengelompokanaritmatika;

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
        //maka order operation berlaku
        
        // perkalian atau pembagianakan dilakukan terlebih dahulu
        
        // jika dilakukan perkalian dan pembagian, maka akan dilakukan operasi dari kiri ke kanan
        int hasil1 = 2 * 5 + 10;
        int hasil2 = 10 + 2 * 5 / 5;
        System.out.println(hasil1);
        System.out.println(hasil2);
        
        //menggunakan pengelompokan operasi dengan ()
        hasil1 = 60 / (2 + 10);
        System.out.println(hasil1);
        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c; 
        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradien m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = m * x * x + c;
        System.out.println("nilai y = "+ y);
    }
    
}
