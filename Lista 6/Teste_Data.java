package Lista_6;

public class Teste_Data {
    public static void main(String[] args) {
        // Cria uma nova instância da classe Data
        Data data = new Data();

        // Inicializa a data com o método inicializarData
        //data.inicializarData(15, 4, 2023);

        // Imprime a data no formato dd/mm/yyyy
        data.imprimirData();

        // Imprime a data por extenso
        data.imprimirDataExtenso();

        // Verifica se a data é válida
        if (data.verificarData()) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }

        // Cria outra instância da classe Data
        Data outraData = new Data(0, 0, 0);

        // Inicializa a outra data com o método inicializarData
        outraData.inicializarData(10, 5, 2023);

        // Verifica se a outra data é anterior à data original
        System.out.println("A outra data:");
        outraData.imprimirData();
        if (data.isPrevious(outraData)) {
            System.out.println("A outra data é anterior à data original");
        } else {
            System.out.println("A outra data não é anterior à data original");
        }

        // Calcula a diferença em dias entre as duas datas
        int diferenca = data.howManyDays(outraData);
        System.out.printf("A diferença entre as datas é de %d dias\n", diferenca);

        // Altera o valor do dia da data original usando o método setDia
        data.setDia(20);

        // Imprime a data novamente no formato dd/mm/yyyy
        data.imprimirData();
    }
}
