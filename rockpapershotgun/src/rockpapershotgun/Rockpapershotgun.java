/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpapershotgun;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Rockpapershotgun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rock Paper Scizor Game");
        Scanner input = new Scanner (System.in);
        boolean indikator = true;
         int menang = 0;
         int kalah = 0;
         int draw = 0;
         Random rand = new Random();
         
        do {
            System.out.println("Menang :" + menang);
            System.out.println("Kalah :" + kalah);
            System.out.println("draw :" + draw);
            System.out.println("|------------------------------------------|");
            System.out.println("Pilih  : ");
            System.out.println("1 Batu");
            System.out.println("2 Kertas");
            System.out.println("3 Gunting");
            int value = input.nextInt();
            int x = (int) ((Math.random()*(4 - 1))+1);
            switch(value){
                case 1:
                    System.out.println("Batu");
                    if (x == 3) {
                        System.out.println("Menang! Musuh Adalah Gunting");
                        menang++;
                    }
                    if (x == 2) {
                        System.out.println("Kalah! Musuh Adalah Kertas");
                        kalah++;
                    }
                    if(x==1){
                        System.out.println("Draw! Musuh Memilih Batu");
                        draw++;
                    }
                    break;
                case 2 :
                    System.out.println("Kertas");
                    if (x == 3) {
                        System.out.println("Kalah! Musuh Adalah Gunting");
                        kalah++;
                    }
                    if (x == 2) {
                        System.out.println("Draw! Musuh Adalah Kertas");
                        draw++;
                    }
                    if(x==1){
                        System.out.println("Menang! Musuh Memilih Batu");
                        menang++;
                    }
                    break;
                case 3 :
                    System.out.println("Gunting");
                    if (x == 3) {
                        System.out.println("Draw! Musuh Adalah Gunting");
                        draw++;
                    }
                    if (x == 2) {
                        System.out.println("Menang! Musuh Adalah Kertas");
                        menang++;
                    }
                    if(x==1){
                        System.out.println("Kalah! Musuh Memilih Batu");
                        kalah++;
                    }
                    break;
                case 0 :
                    indikator = false;
                    break;
            }
                    
            System.out.println("|-----------------|");
            System.out.println("");
            System.out.println("");
        } while (indikator);
        System.out.println("Stop");
        
    }
    
}
