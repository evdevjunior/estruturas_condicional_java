
import java.util.Locale;
import java.util.Scanner;

public class CalculoImpostoDeRenda {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;
        double impostoExcedente;

        if (salario > 2000.00 && salario <= 3000.00) { // validação de imposto de renda por salario
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto); // 8% IR
        } else if (salario > 3000.00 && salario <= 4500.00) {
            salario = salario - 2000.00;
            imposto = salario * 0.08;
            if (salario > 1000.00) {
                impostoExcedente = (salario - 1000.00) * 0.10; // 18% IR
            System.out.printf("R$1 %.2f%n", (imposto + impostoExcedente));
            } else {
                System.out.printf("R$ %.2f%n", imposto);
            } 
        } else if (salario > 4500.00) {
            salario = salario - 2000.00;
            imposto = salario * 0.08;
            if (salario > 1000.00) {
                impostoExcedente = (salario - 1000.00) * 0.10 + (11.1 * 0.18); // 28% IR
            System.out.printf("R$2 %.2f%n", (imposto + impostoExcedente));
            }
        } else {
            System.out.println("INSENTO DE IMPOSTO"); // isento
        }
    }
}
