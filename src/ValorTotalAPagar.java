
import java.util.Locale;
import java.util.Scanner;


public class ValorTotalAPagar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigoItem = sc.nextInt();
        int quantidadeItem = sc.nextInt();

        switch (codigoItem) { // case para validar uma das cinco entradas do pedido efetuando a multiplicação dos valores dos itens selecionado por caso
            case 1:
                double valorPagar = 4.00 * quantidadeItem;
                System.out.println("TOTAL R$ " + valorPagar);
                break;
            case 2:
                valorPagar = 4.50 * quantidadeItem;
                System.out.println("TOTAL R$ " + valorPagar);
                break;
            case 3:
                valorPagar = 5.00 * quantidadeItem;
                System.out.println("TOTAL R$ " + valorPagar);
                break;
            case 4:
                valorPagar = 2.00 * quantidadeItem;
                System.out.println("TOTAL R$ " + valorPagar);
            case 5:
                valorPagar = 1.50 * quantidadeItem;
                System.out.println("TOTAL R$ " + valorPagar);
                break;
                default:
                System.out.println("ENTRADA INVALIDA");
        }
        sc.close();

    }
}