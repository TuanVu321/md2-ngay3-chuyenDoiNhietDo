import java.util.Scanner;

public class changeTemp {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5.0)*celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9.0)*(fahrenheit-32);
        return celsius;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f,c;
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter F");
                    f = scanner.nextDouble();
                    System.out.println(fahrenheitToCelsius(f)+" C");
                    break;
                case 2:
                    System.out.println("Enter C");
                    c = scanner.nextDouble();
                    System.out.println(celsiusToFahrenheit(c)+" F");
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
