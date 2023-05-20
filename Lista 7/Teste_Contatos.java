package Lista_7;
import java.time.LocalDate;

public class Teste_Contatos {
    public static void main(String[] args) {
        try {
            Contato contato1 = new Contato("João", "joao@example.com", "123456789", LocalDate.of(1990, 5, 10));
            Contato contato2 = new Contato("Maria", "maria@example.com", "987654321", LocalDate.of(1985, 8, 20));

            contato1.imprimirContato();
            System.out.println();

            contato2.imprimirContato();
            System.out.println();

            Contato.mostrarTotalContatos(); // Exibe o total de contatos
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar contato: " + e.getMessage());
        }
    }
}






