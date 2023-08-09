import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи радиус: ");
        int radius = scanner.nextInt();
        System.out.print("Площадь круга: ");
        circle.area(radius);

        System.out.print("Длина окружности: ");
        circle.circumference(radius);
    }
}