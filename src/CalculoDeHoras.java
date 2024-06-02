
import java.util.Locale;
import java.util.Scanner;

public class CalculoDeHoras {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double horaInicio = sc.nextDouble();
        double horaFim = sc.nextDouble();
        double horasDeJogo;

        if (horaFim - horaInicio != 0) { // condição verifica se a horafim menos a horainicio é diferente de zero 
            horasDeJogo = horaInicio - horaFim;
            System.out.println("O JOGO DUROU " + Math.abs(horasDeJogo) + " HORAS"); // imprime o valor absoluto para não trazer horas negativas, math.abd retira o numero negativo, converte para positivo
        } else {
            if (horaFim == horaInicio) { // valida se as horas tem o mesmo valor assim a tribui 24 horas um dia
                horasDeJogo = 24;
                System.out.println("O JOGO DUROU " + horasDeJogo + " HORAS");

            } else {
                System.out.println("HORAS INVÁLIDAS");
            }
            
        }
        sc.close();
    }
}
