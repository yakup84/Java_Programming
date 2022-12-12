package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
    }
    public void autopilot(){

    }


    public String toString() {
        return "Tesla{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
