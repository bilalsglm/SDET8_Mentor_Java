package HOMEWORK.Day_1;

public class Soru3 {
    public static void main(String[] args) {
        //3.soru
        oyKullanma(19);
    }

    public static void oyKullanma(int yas){
        if(yas>=19){
            System.out.println("Oy Kullanabilirsiniz!");
        }else
            System.out.println("Uzgunuz, yasiniz tutmuyor.");
    }
}
