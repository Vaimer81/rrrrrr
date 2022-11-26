package lesson21;

public class CarTest {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        StringBuilder cb = new StringBuilder();
        Car bmwCar = new Car();
        bmwCar.color = "black";
        bmwCar .model = "320";
        bmwCar.brand = "BMW";
        bmwCar.createDate ="2022";
        System.out.println("model =" + bmwCar.model);
    }
}
