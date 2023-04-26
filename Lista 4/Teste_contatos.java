import java.time.LocalDate;

public class Teste_contatos {
    public static void main(String[] args) {
        Contatos contato = new Contatos();
        contato.inicializarContato("Maykon Santos", "maykonsantos215@gmail.com", "555-1234", LocalDate.of(2002, 9, 7));
        contato.imprimirContato();
        System.out.println("Idade: " + contato.calcularIdade() + " anos");
    }
}
