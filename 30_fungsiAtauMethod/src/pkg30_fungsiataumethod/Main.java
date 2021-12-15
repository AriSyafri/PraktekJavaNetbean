/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30_fungsiataumethod;

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
        // menghitung fungsi y = (x + 2) * x
        //cara manual
        int y,x;
        x = 10;
        y = hitung(x);
        System.out.println("x = "+ x +", y = " + y);
        
        x = 20;
        y = hitung(x);
        System.out.println("x = "+ x +", y = " + y);
        
        x = 40;
        y = hitung(x);
        System.out.println("x = "+ x +", y = " + y);
    }
        private static int hitung(int input){
            int hasil;
            hasil = (input + 2) * input;
            return hasil;
        }
    }
    
