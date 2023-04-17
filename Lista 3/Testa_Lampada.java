package Lista_3.lampada;

public class Testa_Lampada {
    public static void main(String[] args) {
        LampadaTresEstados lampada = new LampadaTresEstados();
        lampada.estadoDaLampada = "acesa";
        System.out.println("A lampada esta : " + lampada.estadoDaLampada);
        lampada.apaga();
        System.out.println("A lampada esta : " + lampada.estadoDaLampada);
        lampada.acender();
        lampada.mostraEstado();
        lampada.meia_luz();
        lampada.mostraEstado();
        lampada.acender();
        System.out.println("A lampada esta: " + lampada.estaLigada());
    }
}
