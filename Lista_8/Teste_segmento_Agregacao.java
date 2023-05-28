package Lista_8;

public class Teste_segmento_Agregacao {
    public static void main(String[] args) {
        // Criação dos objetos Ponto2D
        Ponto2D ponto1 = new Ponto2D(2, 3);
        Ponto2D ponto2 = new Ponto2D(5, 7);

        // Criação do objeto SegmentoReta utilizando a agregação de classe
        SegmentoReta segmento = new SegmentoReta(ponto1, ponto2);

        // Impressão dos atributos do objeto SegmentoReta
        System.out.println(segmento.imprimeSegmentoReta());

        // Acessando os objetos Ponto2D através da agregação
        Ponto2D p1 = segmento.getP1();
        Ponto2D p2 = segmento.getP2();

        // Impressão dos atributos dos objetos Ponto2D
        System.out.println("Ponto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Ponto 2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
