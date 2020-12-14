package Dish;

public class Plate extends Dish{

    public Plate(String color, String material, boolean clean) {
        super(color, material, clean);
    }

    @Override
    public String wash() {
        if(isClean()){
            return "Чище уже не станет";
        }
        else
            setClean(true);
        return "Тарелка помыта";
    }

    @Override
    public String info() {
        return "Тарелка\nЦвет: " + getColor() + "\nМатериал: " + getMaterial();
    }
}
