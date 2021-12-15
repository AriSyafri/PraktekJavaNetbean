/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15_latihanoperatorlogika;

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
        //membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);
        
        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("masukan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah : " + nilaiTebakan);
        
        //operasi logika 
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda : "+ statusTebakan);
        
        // operasi aljabar boolean (and / or)
        
        System.out.print("masukan nilai diantara 4 dan 9 : ");
        nilaiTebakan = inputUser.nextInt();
        //aljabar boolean berlaku
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("tebakan anda : " + statusTebakan);
    }
    
}
