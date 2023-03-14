import java.util.HashMap;

public class Cat {
    private String name;
    private int weight;
    private int height;
    private int pedigree;


    public Cat() {

    }

    public Cat(String name, int weight, int height, int pedigree) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.pedigree = pedigree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPedigree() {
        return pedigree;
    }

    public void setPedigree(int pedigree) {
        this.pedigree = pedigree;
    }

    public static String getCountry(Cat cat) {
        HashMap<String,String> countryMap = new HashMap<>();
        countryMap.put("1","Россия");
        countryMap.put("2","Англия");
        countryMap.put("3","Шотландия");
        return countryMap.get(Integer.toString((cat.getPedigree())));
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Boris",6,30,1);
        System.out.println(getCountry(cat));
        Cat cat2 = new Cat("Dima",5,24,2);
        System.out.println(getCountry(cat2));

    }
}
