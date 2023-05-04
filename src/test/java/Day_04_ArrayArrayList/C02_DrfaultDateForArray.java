package Day_04_ArrayArrayList;

public class C02_DrfaultDateForArray {
    public static void main(String[] args) {
        int [] dizi= new int[5];
        String [] dizi2=new String[6];

        boolean[] dizi3=new boolean[3];
        double [] dizi4=new double[4];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi[int] = " + dizi[i]);

        }
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("dizi[String] = " + dizi2[i]);

        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi[boolean] = " + dizi3[i]);

        }
        for (int i = 0; i < dizi4.length; i++) {
            System.out.println("dizi[double] = " + dizi4[i]);

        }

        System.out.println("dizi[0] = " + dizi[0]);
        System.out.println("dizi[0] = " + dizi[1]);
        System.out.println("dizi[0] = " + dizi[2]);
        System.out.println("dizi[0] = " + dizi[3]);

        String [] name;
        name =new String[4];

        name[1]="Bilal";
        name[2]="Gulsah";

        System.out.println("name[4] = " + name[4]);//ArrayIndexOutOfBoundsException

    }



}
