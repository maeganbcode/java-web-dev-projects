import java.util.Random;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");

        double length = scanner.nextDouble();

        System.out.println("Enter width of rectangle:");

        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is:" + area);
    }
}