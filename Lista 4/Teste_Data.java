public class Teste_Data {
    public static void main(String[] args) {
        Data data = new Data();
        data.inicializarData(16, 10, 2022);

        if (data.verificarData()) {
            data.imprimirData(); // Saída: 16/10/2022
            data.imprimirDataExtenso(); // Saída: 16 de outubro de 2022
        } else {
            System.out.println("Data inválida.");
        }
    }
}
