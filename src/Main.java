public class Main {
    public static void main(String[] args) {
        double num1 = 5.6;
        double num2 = 2.3;

        double sum = Hello_world.add(num1, num2);
        double difference = Hello_world.subtract(num1, num2);
        double product = Hello_world.multiply(num1, num2);
        double quotient = Hello_world.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
