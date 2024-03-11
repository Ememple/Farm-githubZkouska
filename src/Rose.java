public class Rose extends Flower{
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

    public Rose(Color color) {
        this.name="růže";
        this.price=50;
        this.neededArea=10;
        this.chanceOfGrowth=0.4;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
