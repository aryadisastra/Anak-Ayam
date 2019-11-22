
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABKOM01-RPL07
 */
public class AnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a,c;
         System.out.println("Masukan Jumlah Anak Ayam :");
         a= sc.nextInt();
         
         for(c=1;c<a;)
         {
             System.err.println("Anak Ayam Ada :"+a);
             System.err.println("Mati : "+c);
             a=a-c;
             System.err.println("Tinggal : "+a);
         }
         System.err.println("Anak Ayam Ada : 1");
         System.err.println("Mati : 1");
         System.err.println("Tinggal Induknya");
         
        
    
    
}
}