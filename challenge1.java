
package javaapplication19.newpackage;


 import java.util.Scanner;
public class challenge1 {
    public static void main(String[] args){
       System.out.println("==KOMISI YANG KAMU DAPAT==");
       double komisi;
       double hasil;
       //ketentuan A
       double uangjasaA = 10000;
       
       //ketentuan B
       double uangjasaB = 20000;
       //ketentuan C
       double uangjasaC = 30000;
       //ketentuan D
       double uangjasaD = 50000;
       //ketentuan E
       double uangjasaE = 75000;
       
       Scanner data = new Scanner(System.in);
       System.out.print("barang yang dapat dijual ? ");
       int baca = data.nextInt();
       
       
       //A
       if (baca <= 20000){
           System.out.println("termasuk uang jasa A");
            komisi = (baca * 0.1);
            System.out.println("komisi : " + komisi );
            hasil = (uangjasaA + komisi);
            System.out.println("hasil = " + hasil);
            
        //B
       }else
           if (baca > 20000 && baca <=50000){
           System.out.println("termasuk uang jasa B");
            komisi = (baca * 0.15);
            System.out.println("komisi : " + komisi );
            hasil = (uangjasaB + komisi);
            System.out.println("hasil = " + hasil);
            
           }else
               if (baca > 50000 && baca <=100000){
           System.out.println("termasuk uang jasa C");
            komisi = (baca * 0.2);
            System.out.println("komisi : " + komisi );
            hasil = (uangjasaC + komisi);
            System.out.println("hasil = " + hasil);
            
               }else
                   if (baca >100000 && baca <=150000){
           System.out.println("termasuk uang jasa D");
            komisi = (baca * 0.3);
            System.out.println("komisi : " + komisi );
            hasil = (uangjasaD + komisi);
            System.out.println("hasil = " + hasil);
            
                   }else
                       if (baca >150000){
           System.out.println("termasuk uang jasa E");
            komisi = (baca * 0.1);
            System.out.println("komisi : " + komisi );
            hasil = (uangjasaE + komisi);
            System.out.println("hasil = " + hasil);
            
            
               
            
            
            
           
           
           
       }
    
       
       
        

        
    }
    
}
