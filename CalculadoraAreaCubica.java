import java.util.Scanner;

public class CalculadoraAreaCubica {

    public static int calcularAreaCubica(int altura, int largura, int comprimento) {
        // Valida se alguma das dimensões é negativa
        if (altura < 0 || largura < 0 || comprimento < 0) {
            return 0; // Retorna zero se alguma dimensão for negativa
        }

        // Calcula a área cúbica do cubo diretamente
        int areaCubica = altura * largura * comprimento;
        return areaCubica;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do cubo: ");
        int altura = scanner.nextInt();

        System.out.print("Digite a largura do cubo: ");
        int largura = scanner.nextInt();

        System.out.print("Digite o comprimento do cubo: ");
        int comprimento = scanner.nextInt();

        scanner.close();

        int areaCubica = calcularAreaCubica(altura, largura, comprimento);

        if (areaCubica == 0) {
            System.out.println("As dimensões do cubo são inválidas. A área cúbica é zero.");
        } else {
            System.out.println("A área cúbica do cubo é: " + areaCubica);
        }
    }
}
