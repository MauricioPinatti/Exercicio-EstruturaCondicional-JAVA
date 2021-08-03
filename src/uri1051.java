import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto;

        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) { // nesse caso o excedente de 2000 * 0.08
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) { // nesse caso o excedente de 3000 * 0.18 + o imposto de 0.08 sobre 1000
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else { // nesse caso o excedente de 4500 * 0.28 + o imposto de 0.18 sobre 1500 + o imposto de 0.08 sobre 1000
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }


        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
