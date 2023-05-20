package Lista_7;

public class Teste_UnidadePesoUtils {
    public static void main(String[] args) {
        double pesoGramas = 1000;
        
        double pesoQuilogramas = UnidadePesoUtils.gramasParaQuilogramas(pesoGramas);
        System.out.println("Peso em Quilogramas: " + pesoQuilogramas);  // Saída: 1.0
        
        double pesoLibras = UnidadePesoUtils.gramasParaLibras(pesoGramas);
        System.out.println("Peso em Libras: " + pesoLibras);  // Saída: 2.20462
        
        double pesoOncas = UnidadePesoUtils.gramasParaOncas(pesoGramas);
        System.out.println("Peso em Onças: " + pesoOncas);  // Saída: 35.27396
    }
}
