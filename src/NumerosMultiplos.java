
import java.util.Locale;
import java.util.Scanner;

public class NumerosMultiplos {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // corrige o ponto flutunate com ponto ao invés da virgula
        
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
            if (x % y  == 0 || y % x == 0) { // condição verifica se o resto da divisão entre os dois numeros é igual a zero se sim são multiplos
                  System.out.println("SÃO MULTIPLOS");
            } else {
                System.out.println("NÃO SÃO MULTIPLOS");
            }
            sc.close();
    }
}