
import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
            // realiza as medições de voltagem
            double[] medicoes = new double[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite a medição " + (i+1) + ": ");
                medicoes[i] = scanner.nextDouble();
            }

            // calcula a média 
            double media = 0.0;
            for (int i = 0; i<10; i++) {
                media += medicoes[i];
            }
            media /= 10;
            // calculo do desvio padrao
            double desvio_padrao = 0.0;
            for (int i = 0; i<10; i++) {
                desvio_padrao += (medicoes[i] * medicoes[i]);
            }
            desvio_padrao /= 10;
            desvio_padrao = desvio_padrao - (media * media);
            desvio_padrao = Math.sqrt(desvio_padrao);


            // verifica se o multímetro está operacional
            double limite_desvio_padrao = 0.1 * media;
            if (desvio_padrao > limite_desvio_padrao) {
                System.out.println("\nO multímetro está com problemas e não pode ser utilizado.\n");
            } else {
                System.out.println("\nO multímetro está operacional.\n");
            }

            // imprime os resultados
            System.out.print("Leituras: ");
            for (int i = 0; i<10; i++) {
                System.out.print("=> "+medicoes[i] +"\n");
            }
            System.out.println();
            System.out.println("Média: " + media);
            System.out.println("Desvio padrão: " + desvio_padrao);
        }
	}
}
