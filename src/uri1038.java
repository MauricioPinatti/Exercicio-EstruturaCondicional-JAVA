import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtdade = sc.nextInt();
        double valor = 0;

        switch (codigo) {
            case 1:
                valor = 4.00;
                break;
            case 2:
                valor = 4.50;
                break;
            case 3:
                valor = 5.00;
                break;
            case 4:
                valor = 2.00;
                break;
            case 5:
                valor = 1.50;
                break;
            default:
                System.out.println("Codigo Inválido");
                break;
        }
        double total = qtdade * valor;

        System.out.printf("Total: R$ %.2f%n",total);

        sc.close();
    }

}
