import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.print("coloque um numero:");
        int n = ler.nextInt();
        int n2 = n + 1;
        int n3 = n + 2;
        for (int i=1 ; i<=10 ; i++){
            int resultado1 = i * n;
            int resultado2 = i * n2;
            int resultado3 = i * n3;
            System.out.println(n+"x"+i+"="+resultado1 );
            System.out.println(n2+"x"+i+"="+resultado2 );
            System.out.println(n3+"x"+i+"="+resultado3 );
            System.out.println("--------------------");

        }
    }
}