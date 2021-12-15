/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_konversitipedata;

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
        //program untuk konversi data
        
        int nilaiInt = 90;
        System.out.println("nilai int = "+nilaiInt);
        
        //memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong); //pindah dari kecil ke besar bisa ga masalah
        
        //memperkecil rentang tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; //menggunakan metode casting
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai max byte = " + Byte.MIN_VALUE);
        
        //casting pembagian
        //salah satu float otomatis jadi float
        float a = 10;
        byte b = 4;
        
        float c = a/b;
        
        System.out.printf("%f / %d = %f\n",a,b,c);
        
        //kasus lain
        int x = 10;
        int y =4;
        
        float z = (float)x/y;
        System.out.printf("%d / %d = %f \n",x,y,z);
    }
    
}
