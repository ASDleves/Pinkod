package pinkod;

import java.util.Scanner;

public class Pinkod {
    static int jelszo;
    static int bekertjelszo;
    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        Scanner beker = new Scanner(System.in);
        jelszoMegad(beker); 
        jelszoElker(beker); 
    }

    private static int jelszoMegad(Scanner beker) { 
        System.out.print("kód megadása: ");
        jelszo = beker.nextInt();
        String jelszoEllenorzes = Integer.toString(jelszo);
        while ((jelszoEllenorzes.length() <4) || (jelszoEllenorzes.length() >=7)){
            System.out.println("Nem megfelelő formátum, minimum 4, maximum 6 számjegy legyen!");
            System.out.print("kód megadása: ");
            jelszo = beker.nextInt();
        }
        System.out.println("pin elmentve!");
        return jelszo;
    }

    private static void jelszoElker(Scanner beker) {
        int i = 1;
        boolean helyes = false;
        while (i < 4 && helyes != true) {
            System.out.print("Kérem a belépési kódot (" +(i) + "/3): ");
            bekertjelszo = beker.nextInt();
            if (bekertjelszo == jelszo){
                helyes = true;
            }else{
                System.out.println("Hibás pinkód!");
            };
            
            i++;
        }
        if (i < 4){
                System.out.println("Rendben, sikeres belépés!");
        }else if((i == 4) && (jelszo == bekertjelszo)) {
                System.out.println("Rendben, sikeres belépés!");
            }else{
            System.out.println("Belépés megtagadva!");
        }
        
    }
}