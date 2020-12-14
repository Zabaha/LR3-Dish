package Dish;

public class testDish {

    public static void main(String[] args) {
        Cup myCup = new Cup("Синяя", "Стекло", false);
        System.out.println(myCup.info());
        System.out.println(myCup.wash());
        System.out.println(myCup.wash());
        Plate myPlate = new Plate("Белая", "Пластиковая", true);
        System.out.println(myPlate.info());
        Pan myPan = new Pan("Черная", "Алюминий", true);
        System.out.println(myPan.info());
        System.out.println(myPan.cook());
        System.out.println(myPan.wash());
    }
}
