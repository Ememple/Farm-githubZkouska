import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Rose rose1 = new Rose(Rose.Color.BLACK);
        Rose rose2 = new Rose(Rose.Color.BLUE);
        Rose rose3 = new Rose(Rose.Color.YELLOW);
        Tulip tulip1= new Tulip(Tulip.Color.RED);
        Tulip tulip2= new Tulip(Tulip.Color.YELLOW);
        Tulip tulip3= new Tulip(Tulip.Color.BLACK);
        Farm farm = new Farm(new HashSet<>(),new Animal[5], 10);
        farm.addFlower(rose1);
        farm.addFlower(rose2);
        farm.addFlower(rose3);
        farm.addFlower(tulip1);
        farm.addFlower(tulip2);
        farm.addFlower(tulip3);
        farm.getFlower("tulipány");
    }
}