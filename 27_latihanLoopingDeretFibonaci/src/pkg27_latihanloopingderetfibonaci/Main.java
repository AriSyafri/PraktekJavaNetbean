/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27_latihanloopingderetfibonaci;

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
        int f_n, f_n_1,f_n_2,n;
        
        Scanner inp = new Scanner(System.in);
        
        //dengan for loop
        System.out.println("===== Dengan For Loop =====");
        //user input
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inp.nextInt();
        
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        for(int i = 1; i <= n; i++){
            System.out.println("nilai ke = "+ i +" adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        
        //dengan while loop
        System.out.println("===== Dengan While Loop =====");
        //user input
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inp.nextInt();
        
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        int i = 1;
        while (i <= n)
        {
            System.out.println("nilai ke = "+ i +" adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }
        
        //dengan do while loop
        System.out.println("===== Dengan Do While Loop =====");
        //user input
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inp.nextInt();
        
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        i = 1;
        
        do{
            System.out.println("nilai ke = "+ i +" adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }while(i <= n);
    }
    
}
