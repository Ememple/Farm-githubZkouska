import java.util.ArrayList;
import java.util.HashSet;

public class Farm {
    private HashSet<Flower> flowers;
    private Animal[] animals;
    private int farmArea;

    public void addFlower(Flower flower){
        if (flowers.size()<5){
            flowers.add(flower);
        }
        else {
            System.out.println("Nemůžete přidat další");
        }
    }
    public void getFlower(String name){
            ArrayList<Flower> flowersTemp = new ArrayList<>();
        for (Flower flower : flowers) {
            flowersTemp.add(flower);
        }
        for (int i = 0; i<flowersTemp.size(); i++){
            if (name.equals(flowersTemp.get(i).getName())){
                System.out.println(flowersTemp.get(i));
            }
        }

    }
    public void printHashSet(){
        System.out.println(flowers);
    }

    public Farm(HashSet<Flower> flowers, Animal[] animals, int farmArea) {
        this.flowers = flowers;
        this.animals = animals;
        this.farmArea = farmArea;
    }
}
