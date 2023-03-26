public class  Kelvin extends BaseConverter{
    private String name;


    @Override
    public double temper(double r) {
        return r+32;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(getName());
        System.out.println(temper(20));

    }

}
