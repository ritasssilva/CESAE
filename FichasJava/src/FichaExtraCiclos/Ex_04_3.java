package FichaExtraCiclos;

public class Ex_04_3 {

    public static void main(String[] args) {

        int linhas = 5;  // Número de linhas que queremos imprimir

        for (int n = 0; n < linhas; n++) {
            // Imprimir espaços em branco
            for (int x = 0; x < linhas - n - 1; x++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int x = 0; x < 2 * n + 1; x++) {
                System.out.print("*");
            }
            // Mudar para a próxima linha
            System.out.println();
        }

    }
}
