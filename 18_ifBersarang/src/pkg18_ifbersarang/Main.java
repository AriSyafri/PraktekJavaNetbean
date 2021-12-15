/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18_ifbersarang;

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
        
        //nested if (if bersarang)
        
        int a = 5;
        int b = 1;
        System.out.println("ini adalah awal dari program");
        if (a == 5)
        {
            if (b == 10)
            {
                System.out.println("ini adalah aksi, dimana a = 5 dan b = 10");
            }
            else
            {
                    System.out.println("ini adalah aksi default 1, dimana a = 5 dan bukan b = 10");
            }
        }
        else
        {
            if (b == 10)
            {
                System.out.println("ini adalah aksi, dimana bukan a = 5 dan b = 10");
            }
            else
            {
                System.out.println("ini adalah aksi default, dimana bukan a = 5 dan bukan b = 10");
            }
        }
        System.out.println("ini adalah akhir dari program");
    }
    
}
