package Day_02_Object_StringClass;

public class C03_StringClassMethods {
    public static void main(String[] args) {

        //length
        String dil="java";// String pool icerisinde bir obje olusturdum

        System.out.println(dil.length());
        dil="python";
        System.out.println(dil.length());

        System.out.println("-----------------");

        // toUpperCase(), toOwerCase()

        System.out.println(dil.toUpperCase());
        System.out.println("dil = " + dil);
        dil=dil.toUpperCase();
        System.out.println("dil = " + dil);

        System.out.println("-----------------");

        // charAt()--- dil = PYTHON

        System.out.println("dil.charAt(0) = " + dil.charAt(0));
        System.out.println("dil.charAt(0) = " + dil.charAt(5));
        //System.out.println("dil.charAt(0) = " + dil.charAt(6));// hata verir cunku bu index no yok

        System.out.println("dil.charAt(dil.length()-1) = " + dil.charAt(dil.length() - 1));

        System.out.println("-----------------");
        //concat() dil=PYTHON

        System.out.println("dil.concat(\"programlama dili java´dan daha kolaydir.\") = " +
                dil.concat(" programlama dili java´dan daha kolaydir."));

        dil=dil.concat(" programlama dili java´dan daha kolaydir.");
        //System.out.println("(dil+\" \") = " + (dil + "5"));
        //System.out.println("dil.concat(5) = " + dil.concat(5));//HATA veirir.

        System.out.println("-----------------");

        System.out.println("dil = " + dil);
        System.out.println("dil.contains(\"dili\") = " + dil.contains("dili"));
        System.out.println("dil.contains(\"dili\") = " + dil.contains("dili j"));
        System.out.println("dil.contains(\"dili\") = " + dil.contains("dilij"));

        System.out.println("-----------------");

        //trim()

        String s="     Hello      World    ";
        System.out.println("s = " + s);
        System.out.println("s.trim() = " + s.trim());

        System.out.println("s = " + s);
        String trimesS=s.trim();
        System.out.println("trimesS = " + trimesS);

        System.out.println("-----------------");

        //indexOf()

        System.out.println("trimesS = " + trimesS);
        System.out.println("trimesS.indexOf(\"H\") = " + trimesS.indexOf("H"));
        System.out.println("trimesS.indexOf(\"Hell\") = " + trimesS.indexOf("Hell"));
        System.out.println("trimesS.indexOf(\"World\") = " + trimesS.indexOf("World"));

    }
}
