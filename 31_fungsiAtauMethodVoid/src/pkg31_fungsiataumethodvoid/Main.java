/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg31_fungsiataumethodvoid;

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
        
        // void dalam bahasa inggris artinya kosong
        //sehingga tidak memerlukan return
        System.out.println(simpel());
        
        fungsiVoid("apa pun");
        selamatPagi("abah");
        selamatPagi("emak");
    }
    
    //fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        //fungsi void gaada kembalian
        //jadi delegasi aksi aja tanpa mengambil nilai
        
        System.out.println(input);
    }
    
    
    // ini fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    //mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
    
    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }
}
