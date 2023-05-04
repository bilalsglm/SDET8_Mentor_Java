package Day_04_ArrayArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_ArrayMethod {
    public static void main(String[] args) {
        int [] plakalar={1,4,34,56,47,6,35};

        ilkVeSonElementKontrol(plakalar);


        // toString (dizi)
        String []names={"Ayse","Gulden","Tazeoglu","Suheda","Bilal","Selim","Ramazan","Ali"};
        System.out.println(Arrays.toString(names));

        // sort()
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int []numbers={5,4,3,2,1,0,-1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers,2,5);
        System.out.println(Arrays.toString(numbers));

        // equals

        int []dizi1={1,2,3};
        int []dizi2={1,2,3};
        int []dizi3={1,2,3};

        System.out.println(Arrays.equals(dizi1, dizi2));
        System.out.println(dizi1 == dizi2);

        // fill()

        int [] sayilar=new int[5];
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar));
        Arrays.fill(sayilar,7);

        System.out.println(Arrays.toString(sayilar));


       // copyOfRange
        System.out.println(Arrays.toString(Arrays.copyOfRange(names, 2, 6)));

        //split()
        String t="Merhaba Guzel insanlar";
        String[] textArr=t.split("");
        System.out.println("textArr.length = " + textArr.length);
        System.out.println("Arrays.toString(textArr) = " + Arrays.toString(textArr));

        /*
        String t="Merhaba";
        String[] textArr=t.split("");
        System.out.println("textArr.length = " + textArr.length);
        System.out.println("Arrays.toString(textArr) = " + Arrays.toString(textArr));
        */

    }









    public static void ilkVeSonElementKontrol(int [] arr) {
        if(arr[0]==arr[arr.length-1]){
            System.out.println("Esittir");
        }else {
            System.out.println("Esit degil");
        }
    }
    public static void ilkVeSonElementKontrol(String [] arr) {
        if(arr[0].equalsIgnoreCase(arr[arr.length-1]) ){
            System.out.println("Esittir");
        }else {
            System.out.println("Esit degil");
        }
    }


}
