
import java.util.Locale;
import java.util.Scanner;

public class QuadranteDoPontoNasCordenadas {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); // obtem os dados de entrada

        double x = sc.nextDouble(); // atribui os dados de entrada as variaveis
        double y = sc.nextDouble();
            
        if (x > 0 && y > 0){ // condição que valida os quadrantes do plano cartesiano y, x onde se encontra o ponto 
            System.out.println("Q1");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0 ) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("ORIGEM DO PLANO");
        }
    }
}