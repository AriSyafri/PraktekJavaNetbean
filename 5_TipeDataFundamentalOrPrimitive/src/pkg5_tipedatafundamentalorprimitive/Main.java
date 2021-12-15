/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_tipedatafundamentalorprimitive;

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
        //tipe data di java:
        //integer, byte, short, long, float, char, boolean
        
        //integer (satuan)
        int i = 7;
        System.out.println("===Integer===");
        System.out.println("nilai integer : "+ (i + 1));
        System.out.println("Nilai max = "+ Integer.MAX_VALUE);
        System.out.println("Nilai min = "+ Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");
        
        //byte (satuan)
        byte b = 7;
        System.out.println("===Byte===");
        System.out.println("nilai byte : "+ (b + 1));
        System.out.println("Nilai max = "+ Byte.MAX_VALUE);
        System.out.println("Nilai min = "+ Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");
        
        //short (satuan)
        short c = 7;
        System.out.println("===Short===");
        System.out.println("nilai short : "+ (c + 1));
        System.out.println("Nilai max = "+ Short.MAX_VALUE);
        System.out.println("Nilai min = "+ Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit");
        
        //byte (satuan)
        long d = 7; //untuk long bisa pake 7L sebagai penanda long
        System.out.println("===Long===");
        System.out.println("nilai long : "+ (d + 1));
        System.out.println("Nilai max = "+ Long.MAX_VALUE);
        System.out.println("Nilai min = "+ Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit");
        
        //double (koma, bilangan real)
        double e = -10.5d; //untuk double bisa pake 7 atau 7.5 sebagai penanda double
        System.out.println("===Double===");
        System.out.println("nilai double : "+ (e));
        System.out.println("Nilai max = "+ Double.MAX_VALUE);
        System.out.println("Nilai min = "+ Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");
        
        //float (koma, bilangan real)
        double f = -8.5f; //untuk double bisa pake 7 atau 7.5 sebagai penanda double
        System.out.println("===Float===");
        System.out.println("nilai float : "+ (f));
        System.out.println("Nilai max = "+ Float.MAX_VALUE);
        System.out.println("Nilai min = "+ Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        
        //char (karakter) berdasarkan ASCII
        char g = 'f'; //untuk double bisa pake 7 atau 7.5 sebagai penanda double
        System.out.println("===Char===");
        System.out.println("nilai char : "+ (g));
        System.out.println("Nilai max = "+ Character.MAX_VALUE);
        System.out.println("Nilai min = "+ Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit");
        
        //boolean (nilai true or false)
        boolean h = true; //untuk double bisa pake 7 atau 7.5 sebagai penanda double
        System.out.println("===Boolean===");
        System.out.println("nilai char : "+ (h));
        System.out.println("Nilai max = "+ Boolean.TRUE);
        System.out.println("Nilai min = "+ Boolean.FALSE);
    }
    
}
