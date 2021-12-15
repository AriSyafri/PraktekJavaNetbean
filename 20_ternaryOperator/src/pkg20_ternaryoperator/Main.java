/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20_ternaryoperator;

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
        Scanner inp = new Scanner(System.in);
        
        //ternary operator
        
        int input, x;
        
        System.out.print("masukan nilai : ");
        input = inp.nextInt();
        System.out.println(input);
        
        //variable x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);
        
        //model if 
        
        /*
        if (input==10){
            x = input * input;
        }else{
            x = input / 2;
        }
        */
        
        System.out.println("hasilnya " + x);
    }
    
}
