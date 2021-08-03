import java.util.Scanner;

public class uri1044 {

    // descobrindo se os numeros digitados são multiplos entre si.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
        /*
        if ( A > B && A % B == 0){
            System.out.println("Sao Multiplos");
        }
        else if(B > A && B % A == 0){
            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();

         */
