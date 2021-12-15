/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_operatorunary;

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
        // unary = operasi yang dilakukan 1 variabel
        int angka = 1;
        
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka); //ini tidak merubah angka
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka); //ini tidak merubah angka
        
        //unary decrement dan increment
        int angka2 = 10;
        angka2++; //ini increment
        angka2++;
        System.out.println("nilai dengan '++' menjadi = "+ angka2); //dengan increment dan decrement mengubah angka
        
        int angka3 = 15;
        int temp = angka3; //tempat menyimpan sementara
        angka3--;
        System.out.println("nilai awal " +temp +" nilai dengan '--' menjadi = "+ angka3);
        
        
        //prefix fan postfix
        int p = 5;
        System.out.printf("nilai dengan '++' prefix menjadi  = %d \n",++p); //dijumlah baru di tampilkan
        int q = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n",q++);//di tampil baru di jumlah
        System.out.printf("nilai dengan postfix menjadi = %d \n",q);
        
        //unary boolean denfan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup); //tidak merubah nilai
        
        //pembuktian
        System.out.println("nilai boolean = " + ucup);
    }
    
}
