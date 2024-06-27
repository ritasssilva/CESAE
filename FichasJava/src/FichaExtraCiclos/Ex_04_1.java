package FichaExtraCiclos;

public class Ex_04_1 {
    public static void main(String[] args) {

        int linhas = 4;  // Número de linhas que queremos imprimir
        int asteriscosPorLinha = 10;  // Número de asteriscos por linha

        for (int n = 0; n < linhas; n++) {
            for (int x = 0; x < asteriscosPorLinha; x++) {
                System.out.print("*");
            }
            System.out.println();  // Move para a próxima linha após imprimir todos os asteriscos
        }

    }
}
