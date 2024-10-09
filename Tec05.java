import java.util.Scanner;

public class Tec05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        char[] caracteres = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = palavra.charAt(i);
        }

        String invertido = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertido += caracteres[i];
        }

        System.out.println("A palavra invertida: " + invertido);

        sc.close();

    }
}
