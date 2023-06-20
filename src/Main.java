
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Dizinin Uzunluğunu Girin : ");
        int uzunluk = scanner.nextInt();
        
        int [] arrays = new int[uzunluk];
        
        for(int i=0;i<uzunluk;i++){
            System.out.print("Lütfen Dizinin " + (i+1) + ". Elemanını girin : ");
            int eleman = scanner.nextInt();
            arrays[i]=eleman;
        }
        
        
        double toplam = 0;
        
        for(int i=0;i<uzunluk;i++){     
            toplam += (1 / arrays[i]);
        }
        
        
        double harmonikOrtalama = uzunluk / toplam ;
        
        System.out.println("Girilen Dizinin Harmonik Ortalaması  : " + harmonikOrtalama);
        
        
    }
}
