package PracticeDollar;

public class  Dollar$ {
    private char name;
    private double dollars;
    public void dollar(){

    }
    public double convert(double sum,char sym){
        double resolt=0;
        if (sym == 'e'){
            resolt = sum*1.08;
        } else if (sym=='c') {
            resolt=sum/94.06;

        }
        return resolt;
    }


}
