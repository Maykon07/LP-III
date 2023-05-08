package Lista_5;
import java.time.LocalDate;

public class Teste_Contatos {
    public static void main(String[] args) {
        // Criando um objeto Contato com valores válidos
        LocalDate dataNascimento = LocalDate.of(1995, 10, 15);
        Contato contato1 = new Contato("João Silva", "joao.silva@example.com", "11999999999", dataNascimento);
        
        // Imprimindo os dados do contato
        contato1.imprimirContato();
        
        // Alterando o telefone do contato
        contato1.setTelefone("88888888");
        
        // Imprimindo os dados atualizados do contato
        contato1.imprimirContato();
    }
}






