public class Farengate extends BaseConverter {
    private String name;

    @Override
    public double temper(double r) {
        return r + 273.15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(getName());

    }
}