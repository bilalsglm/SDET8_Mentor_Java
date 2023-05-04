package Day_04_ArrayArrayList;

import java.util.Scanner;

public class C03_Task {
    public static void main(String[] args) {

        String [] days=new String[7];
        days[0]="Pazartesi";
        days[1]="Sali";
        days[2]="Carsamba";
        days[3]="Persembe";
        days[4]="Cuma";
        days[5]="Cumartesi";
        days[6]="Pazar";

        Scanner sc=new Scanner(System.in);
        System.out.println("Gun giriniz ");
        int gun=sc.nextInt();

        System.out.println(("Girdiginiz rakama karsilik gelen gun : " + days[gun - 1]));

    }
}
