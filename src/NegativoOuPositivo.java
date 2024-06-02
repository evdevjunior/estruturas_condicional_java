import java.util.Locale;
import java.util.Scanner;

public class NegativoOuPositivo {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); // recebe a entradad de dados

        double x = sc.nextDouble();

        String y = (x >= 0) ? "NÃO NEGATIVO" : "NEGATIVO"; // operador ternario verfica se o numero é positivo ou negativo

        System.out.println("RESULTADO : " + y);
        sc.close();
    }

}