import java.util.Scanner;

class Tec02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int N = sc.nextInt();

        int anterior = 0;
        int atual = 1;
        int F = 0;

        while (atual <= N) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (atual == N) {
                F = 1;
            }
        }

        if (F == 1) {
            System.out.println(N + " é um número da sequência.");
        } else {
            System.out.println(N + " não é um número da sequência.");
        }

        sc.close();

    }
}