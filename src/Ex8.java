import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area and perimeter of the circle
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        // Print the output
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        scanner.close();
    }
}
