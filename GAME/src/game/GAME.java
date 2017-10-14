package game;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.EventQueue;

//@author Loroark

public class GAME {
    static int ileWierszy;
    static int ileKolumn;
    static int[][]teren;
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter zapis;
        Scanner input;
        double liczba;

        int ileLiczb;
        int ile0 = 0;
        int ile1 = 0;
        int ile2 = 0;
        int suma = 0;
        
        
        zapis = new PrintWriter("Teren.txt");
        input = new Scanner(System.in);
        System.out.print("Ile kolumn: ");
        ileKolumn = input.nextInt();
        System.out.print("Ile wierszy: ");
        ileWierszy = input.nextInt();
        ileLiczb = ileWierszy * ileKolumn;
        teren = new int[ileWierszy][ileKolumn];
        
        /*
        Double asdf = 3.0/7.0;
        System.out.println(asdf);
        Double obcieteasdf = BigDecimal.valueOf(asdf).setScale(1, RoundingMode.HALF_UP).doubleValue();
        System.out.println(obcieteasdf);
        */
        
        for(int i = 0; i < ileWierszy; i++){
            for(int j = 0; j < ileKolumn; j++){
                liczba = Math.random();
                if(i < 333){
                    if(liczba < 0.50){
                        teren[i][j] = 0;
                        ile0++;
                    }else if(liczba < 0.85){
                        teren[i][j] = 1;
                        ile1++;
                    }else{
                        teren[i][j] = 2;
                        ile2++;
                    }
                }else if(i < 666){
                    if(liczba < 0.20){
                        teren[i][j] = 0;
                        ile0++;
                    }else if(liczba < 0.70){
                        teren[i][j] = 1;
                        ile1++;
                    }else{
                        teren[i][j] = 2;
                        ile2++;
                    }
                }else{
                    if(liczba < 0.10){
                        teren[i][j] = 0;
                        ile0++;
                    }else if(liczba < 0.40){
                        teren[i][j] = 1;
                        ile1++;
                    }else{
                        teren[i][j] = 2;
                        ile2++;
                    }
                }
                //System.out.printf("%d ", teren[i][j]);
                //zapis.printf("%d ", teren[i][j]);
            }
            //System.out.printf("%n");
            //zapis.printf("%n");
        }
        suma = suma + (ile1 * 1) + (ile2 * 2);
        System.out.println();
        zapis.println();
        
        System.out.printf("ile0: %d --> co stanowi: %.2f%%%n", ile0, (float)ile0/(float)ileLiczb*100);
        zapis.printf("ile0: %d --> co stanowi: %.2f%%%n", ile0, (float)ile0/(float)ileLiczb*100);
        System.out.printf("ile1: %d --> co stanowi: %.2f%%%n", ile1, (float)ile1/(float)ileLiczb*100);
        zapis.printf("ile1: %d --> co stanowi: %.2f%%%n", ile1, (float)ile1/(float)ileLiczb*100);
        System.out.printf("ile2: %d --> co stanowi: %.2f%%%n", ile2, (float)ile2/(float)ileLiczb*100);
        zapis.printf("ile2: %d --> co stanowi: %.2f%%%n", ile2, (float)ile2/(float)ileLiczb*100);
        
        System.out.println("Suma: " + suma);
        zapis.println("Suma: " + suma);
        
        zapis.close();
        
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new MyFrame();
            }
        });
        
    }
}
