/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10_operator_komparasi;

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
        //operator komparasi akan menghasilkan nilai boolean
        int a,b;
        boolean hasilKomparasi;
        a = 10;
        b = 10;
        
        //metode komparasi
        hasilKomparasi = (a == b);
        System.out.println("hasil nya : "+hasilKomparasi);
        
        //cara lain
        System.out.printf("%d apakah sama dengan % d ? %s\n",a,b, (a == b));
        //dengan manipulasi increment
        a++; // mengubah kondisi
        System.out.printf("%d apakah sama dengan % d ? %s\n",a,b, (a == b));
        
        System.out.println("========================================================="); //pembatas
        System.out.println("=====PERSAMAAN=====");
        //operator equal atau persamaan
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ==> %s \n",a,b,hasilKomparasi);
        
        a = 15;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ==> %s \n",a,b,hasilKomparasi);
        
        System.out.println("=====PERTIDAKSAMAAN=====");
        //operator not equal atau pertidaksamaan
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ==> %s \n",a,b,hasilKomparasi);
        
        a = 15;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ==> %s \n",a,b,hasilKomparasi);
        
        System.out.println("=====PERBANDINGAN ATAU SAMA DENGAN=====");
        //
        a = 70;
        b = 70;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ==> %s \n",a,b,hasilKomparasi);
        
        a = 15;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ==> %s \n",a,b,hasilKomparasi);
        
        System.out.println("=====PERBANDINGAN=====");
        //
        a = 70;
        b = 70;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ==> %s \n",a,b,hasilKomparasi);
        
        a = 15;
        b = 18;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ==> %s \n",a,b,hasilKomparasi);
    }
    
}
