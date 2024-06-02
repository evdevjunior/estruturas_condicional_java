
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        String y = (x % 2 == 0) ? "PAR" : "IMPAR"; // operador ternario identifica se o numero é par ou impar se divisivel por dois resto zero é PAR

        System.err.println(y);
        sc.close();
    }
}