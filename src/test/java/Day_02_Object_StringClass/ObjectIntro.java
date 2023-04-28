package Day_02_Object_StringClass;


class HesapMakinesi{
    int num4=5;
    public int sum(){

        System.out.println("in add");
        return 0;
    }
}

public class ObjectIntro {
    public static void main(String[] args) {

        int num1=4;
        int num2=5;

        HesapMakinesi hesap=new HesapMakinesi();
        System.out.println("hesap.sum() = " + hesap.sum());
        System.out.println("hesap.num4 = " + hesap.num4);


    }





    public static int sum(int i,int i2){
       return i+i2;
    }
}
