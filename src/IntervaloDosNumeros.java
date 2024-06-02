
import java.util.Locale;
import java.util.Scanner;

public class IntervaloDosNumeros {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // ajusta o ponto flutuante de virgula padrão do double para pomto 

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        if (x >= 0 && x <= 25) // validações dos intervalos de 0, 25, 50, 75 e 100 condições aninhadas
        {
            System.out.println("INTERVALO: [0, 25]" );
        } 
        else if (x >= 25 && x <= 50) 
        {
            System.out.println("INTERVALO: [25, 50]");
        } 
        else if (x >= 50 && x <= 75) 
        {
            System.out.println("INTERVALO: [50, 75]"); 
        }
        else if (x >= 75 && x >= 100)
        {
            System.out.println("INTERVALO: [75, 100]");
        }
        else System.out.println("FORA DO INTERVALO");
    }
}
