import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.println("Quantas Horas");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }

        sc.close();
    }
}

         /*
        // estrutura condicional composta
        int hora;
        System.out.println("Quantas Horas");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa Tarde");
        }
        sc.close();

          */
        /*
        // estrutura condiconal simples
        int x = 5;

        System.out.println("Bom dia");

        if (x < 0){
            System.out.println("Boa tarde");
        }

        System.out.println("Boa Noite");

         */