package Lista_8;

public class Teste_segmento_composicao {
    public static void main(String[] args) {
      
        // Criação do objeto SegmentoReta 
        SegmentoReta segmento = new SegmentoReta(2, 3, 5, 7);

        // Impressão dos atributos do objeto SegmentoReta
        System.out.println(segmento.imprimeSegmentoReta());

        // Acessando a dimensão do segmento
        double dimensao = segmento.getDimensao();
        System.out.println("Dimensão do segmento: " + dimensao);
    }
}
