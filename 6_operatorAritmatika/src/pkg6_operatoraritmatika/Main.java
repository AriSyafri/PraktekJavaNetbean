/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_operatoraritmatika;

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
        //operasi Aritmarika
        
        // operasi Aritmatika
        int variable1 = 12;
        int variable2 = 5;
        int hasil;
        
        // 1. penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);
        
        // 2. pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);
        
        // 3. perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);
        
        // 4. pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil); //nanti ada penjelasan konversi
        
        float a =11;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a+ " / " + b + " = "+hasilFloat + "(menggunakan float)");
        
        // 5. modulus (sisa bagi)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
    }
    
}
