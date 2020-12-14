package Dish;

public class Cup extends Dish{

    public Cup(String color, String material, boolean clean) {
        super(color, material, clean);
    }

    @Override
    public String wash() {
        if(isClean()){
            return "Чище уже не станет";
        }
        else
            setClean(true);
            return "Чашка помыта";
    }

    @Override
    public String info() {
        return "Чашка\nЦвет: " + getColor() + "\nМатериал: " + getMaterial();
    }
}
