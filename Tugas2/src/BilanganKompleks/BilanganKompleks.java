package BilanganKompleks;

import java.util.Scanner;

/**
 *
 * @author Aprilia Susanti
 */
public class BilanganKompleks {
    
    static int r,i;
    
    public static void main(String[] args) {
        Scanner baca=new Scanner(System.in);
        String A1 = baca.nextLine();
        String A2 = baca.nextLine();
        
        char[] arrayA1 = A1.toCharArray();
        int banyakA1 = arrayA1.length; 
        char[] arrayA2 = A2.toCharArray();
        int banyakA2 = arrayA2.length;
        System.out.println("");
        
        if (banyakA1 == 4 && banyakA2==4) {
            cariAngka(A1,0,1,1,3);
            int r1=r;
            int i1=i;
            cariAngka(A2,0,1,1,3);
            int r2=r;
            int i2=i;
            print(i1,i2,r1,r2);
            
        }
        else if (banyakA1 == 2 && banyakA2 == 4) {
            cariAngka(A1,0,0,0,1);
            int r1=0;
            int i1=i;
            cariAngka(A2,0,1,1,3);
            int r2=r;
            int i2=i;
            print(i1,i2,r1,r2);
        }
    }
    
    public static void cariAngka(String A, int R1, int R2, int I1, int I2) {
        if (R1==0 && R2 == 0) {
            r = ubahAngka("0");
        }
        else {
            String real = A.substring(R1,R2);
            r = ubahAngka(real);
        }
        String imajiner = A.substring(I1,I2);
        i = ubahAngka(imajiner);
    }
    
    public static int ubahAngka(String huruf) {
        int angka = Integer.parseInt(huruf);
        return angka;
    }
    
    public static void print(int i1,int i2,int r1,int r2) {
        int hasilR = (r1*r2) - (i1*i2);
        int hasilI = (r1*i2) + (i1*r2);
        System.out.println(hasilR + "+" + hasilI + "i");
    }
    
}