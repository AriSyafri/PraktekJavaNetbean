/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19_switchcase;

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
        //switch case
 
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("panggil nama : ");
        input = inputUser.nextLine();
        
        
        //ekspresinya berupa satuan (int, long, byte, short), string, atau enum
        switch(input)
        {
            case "otong" :
                System.out.println("Saya otong dan hadir Boss!!");
                break; //biar keluar switch
                
            case "ucup" :
                System.out.println("Saya ucup dan hadir Boss!!");
                break;
                
            case "mario" : 
                System.out.println("Saya mario dan hadir Boss!!");
                break;
                
            default: //ini else nya
                System.out.println(input +" tidak hadir Boss!!!");
        }
        
        System.out.println("program selesai");
    }
    
}
