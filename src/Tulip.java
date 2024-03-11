public class Tulip extends Flower{
    public enum Color{
        YELLOW,
        BLACK,
        BLUE,
        RED,
    }
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tulip(Color color) {
        this.name="tulipány";
        this.price=20;
        this.neededArea=5;
        this.chanceOfGrowth=0.9;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
