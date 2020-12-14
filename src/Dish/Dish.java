package Dish;

public abstract class Dish {
    private String color;
    private String material;
    private boolean clean;

    public Dish(String color, String material, boolean clean){
        this.color = color;
        this.material = material;
        this.clean = clean;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean){
        this.clean = clean;
    }

    public abstract String wash();

    public abstract String info();
}
