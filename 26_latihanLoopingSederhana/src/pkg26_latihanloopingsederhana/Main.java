/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26_latihanloopingsederhana;

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
        
        Scanner inp;
        inp = new Scanner(System.in);
        //program menjumlahkan angka dengan rentang
        int nilai_awal, nilai_akhir, total;
        int nilai_awal2, nilai_akhir2,total2;
        int nilai_awal3,  nilai_akhir3,total3;
        
        System.out.println("=== dengan while loop===");
        System.out.print("masukan nilai awal = ");
        nilai_awal = inp.nextInt();
        
        System.out.print("masukan nilai akhir = ");
        nilai_akhir = inp.nextInt();
        
        total = 0;
        //dengan while
        while (nilai_awal <= nilai_akhir){
            total = total + nilai_awal;
            
            System.out.println("ditambah " + nilai_awal + " menjadi " + total);
            nilai_awal++;
        }
        
        System.out.println("\n=== dengan do while ===");
        System.out.print("masukan nilai awal = ");
        nilai_awal2 = inp.nextInt();
        
        System.out.print("masukan nilai akhir = ");
        nilai_akhir2 = inp.nextInt();
        
        //dengan do while
        total2 = 0;
        do {
            total2 = total2 + nilai_awal2;
            System.out.println("ditambah " + nilai_awal2 + " menjadi " + total2);
            nilai_awal2++;
        }while (nilai_awal2 <= nilai_akhir2);
        
        System.out.println("\n=== dengan for loop ===");
        System.out.print("masukan nilai awal = ");
        nilai_awal3 = inp.nextInt();
        
        System.out.print("masukan nilai akhir = ");
        nilai_akhir3 = inp.nextInt();
        total3 = 0;
        for(;nilai_awal3 <= nilai_akhir3; nilai_awal3++){
            total3 = total3 + nilai_awal3;
            System.out.println("ditambah " + nilai_awal3 + " menjadi " + total3);
        }
    }
    
}
