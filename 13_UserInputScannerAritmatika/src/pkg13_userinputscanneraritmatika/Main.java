/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13_userinputscanneraritmatika;

import java.util.Scanner;

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
        //memakai input dari user kita pakai library scanner
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, volume, tinggi;
        
        System.out.println("===MENGHITUNG LUAS====");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
         
        luas = panjang * lebar;
        System.out.println("luas = " + luas);
        
        System.out.println("===MENGHITUNG VOLUME===");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume = "+ volume);
    }
    
}
