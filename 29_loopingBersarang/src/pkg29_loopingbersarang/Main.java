/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29_loopingbersarang;

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
        
        //looping bersarang
        System.out.println("looping bersarang=======");
        for (int i = 0; i < 5; i++){
            System.out.print("loop ke- " + i);
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        // dengan increment
        System.out.println("\n\n");
        System.out.println("dengan increment===========");
        for(int i = 0; i < 5; i++){
            for(int  j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.println("");
        }
        
        //dengan decrement
        System.out.println("\n\n");
        System.out.println("dengan decrement===========");
        for(int i = 5; i > 0; i--){
            for (int j = 5; j > 0; j--){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.println("");
        }
        
        //looping bersarang
        System.out.println("\n\n");
        System.out.println("variasi 2===========");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if ((i+j) == 4){
                    break;
                }
            }
            System.out.println("");
        }
        
        //looping bersarang
        System.out.println("\n\n");
        System.out.println("variasi gabugan 1 dan 2");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }else if((i + j) == 8){
                    break;
                }
                
            }
            System.out.println("");
        }
        
        System.out.println("\n\n");
        System.out.println("variasi 4========");
        System.out.println("looping bersarang=======");
        for (int i = 1; i <= 5; i++){
            for (int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
                
            }
            System.out.println("");
        }
        
        System.out.println("\n\n");
        System.out.println("variasi 5========");
        System.out.println("looping bersarang=======");
        for (int i = 1; i <= 5; i++){
            for (int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print("*");
            } 
            System.out.println();
        }
        
        System.out.println("\n\n");
        System.out.println("variasi 6========");
        System.out.println("looping bersarang=======");
        for (int i = 1; i <= 5; i++){
            for (int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    
}
