/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25_forloop;

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
        //mock up for loop
        //for (inisialisasi; kondisi; step nilai){
        //
        //    aksi;
        //}
        
        System.out.println("loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++){
            System.out.println("ini for loop ke - " + nilai);
        }
        
        System.out.println("\nloop kedua");
        for (int nilai = 0; nilai < 10; nilai++){
            System.out.println("ini for loop ke - " + nilai);
        }
        
        System.out.println("\n loop ketiga");
        for (int nilai = 10; nilai >= 5; nilai--){
            System.out.println("ini for loop ke - " + nilai);
        }
        
        System.out.println("loop keempat");
        
        int nilai = 0;
        for (; nilai < 10; nilai++){
            System.out.println("for loop ke - " + nilai);
        }
        System.out.println("ini adalah akhir program");
    }
    
}
