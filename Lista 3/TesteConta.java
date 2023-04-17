package Lista_3.banco;

public class TesteConta {
    public static void main(String[] args) {
        Conta cliente1 = new Conta();
        Conta cliente2 = new Conta();

        cliente1.abreConta("Maykon", 250.50, true );
        cliente2.contaSimplis("Matheus");
        cliente1.mostrDados();
        cliente2.mostrDados();
        cliente1.setnome("Junior");
        cliente1.mostrDados();

    }
}
