/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_whileloop;

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
    //    while (kondisi) {
    //        aksi
    //    }
    
        int a = 0;
        int b = 0;
        boolean kondisi = true;
    
        System.out.println("awal program");
        while(a < 10){
            System.out.println("1_while loop ke-"+ a);
            a++;
        }
        
        while (kondisi){
            System.out.println("2_while loop ke-"+ b);
            b++;
            if (b == 10){
                kondisi = false;
            }
        }
        System.out.println("Akhir program");
    }
    
}
