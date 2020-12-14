package Dish;

public class Pan extends Dish{

    public Pan(String color, String material, boolean clean) {
        super(color, material, clean);
    }

    public String cook(){
        setClean(false);
        return "Еда готовится";
    }

    @Override
    public String wash() {
        if(isClean()){
            return "Чище уже не станет";
        }
        else
            setClean(true);
        return "Сковорода помыта";
    }

    @Override
    public String info() {
        return "Сковорода\nЦвет: " + getColor() + "\nМатериал: " + getMaterial();
    }
}
