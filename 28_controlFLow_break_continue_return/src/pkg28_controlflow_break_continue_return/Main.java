/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg28_controlflow_break_continue_return;

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
        
        // break, continue, dan return
        
        int a = 0;
        while(true){
            a++;
            if (a == 10){
                break;  //keyword memaksa keluar loop
            } else if (a == 5){
                continue; // keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7){
                return;     //program keluar method
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari program");
    }
    
}
