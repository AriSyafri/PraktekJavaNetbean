/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_operatorbitwise;

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
        //operator bitwise --> operator untuk melakukan operasi pada nilai bit
        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;
        
        //operator SHIFT LEFT(geser kiri)
        System.out.println("==== SHIFT LEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(a << 3);//ini buat gesernya
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",b_bits,b);
        
        //operator SHIFT RIGHT(geser kekanan)
        System.out.println("==== SHIFT right");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(a >> 2);//ini buat gesernya
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",b_bits,b);
        
        //operator bitwise OR
        System.out.println("==== BITWISE OR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("============= OR");
        c = (byte)(a | b); //operasinya or
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",c_bits,c);
        
        System.out.println("==== BITWISE AND");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("============= AND");
        c = (byte)(a & b); // operasinya and
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",c_bits,c);
        
        System.out.println("==== BITWISE XOR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("============= XOR");
        c = (byte)(a ^ b);//operasinya xor
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",c_bits,c);
        
        //Operator Negasi / not
        System.out.println("========= BITWISE NOT (~)");
        a = 24;
        b = (byte)~a;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');//.replace buat ngeganti
        System.out.printf("%s = %d \n",a_bits,a);
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));//.replace buat ngeganti
        System.out.printf("%s = %d \n",b_bits,b);
        
    }
    
}
