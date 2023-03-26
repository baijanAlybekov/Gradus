import PracticeDollar.Dollar$;

public class Main {
    public static void main(String[] args) {


        Kelvin kelvin=new Kelvin();
        System.out.println(kelvin.temper(kelvin.temper(45)));
        kelvin.setName("+273.15");
        kelvin.getName();
        Farengate farengate=new Farengate();
        System.out.println(farengate.temper(farengate.temper(14)));
        farengate.setName("jarko");
        farengate.getName();
        Selsiya selsiya=new Selsiya();
        System.out.println(selsiya.temper(selsiya.temper(23)));
        selsiya.setName("nemnogo");
        selsiya.getName();
        Dollar$ dollar$=new Dollar$();
        System.out.println(dollar$.convert(13, 'c'));


    }
}