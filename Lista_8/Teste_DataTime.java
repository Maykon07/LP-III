package Lista_8;

public class Teste_DataTime {
    public static void main(String[] args) {
        // Criação de objetos DataTime
        DataTime dataTime1 = new DataTime(20, 5, 2023, 12, 30, 0);
        DataTime dataTime2 = new DataTime(22, 5, 2023, 10, 45, 0);

        // Impressão dos objetos DataTime
        System.out.println("DataTime 1:");
        dataTime1.imprimeDataTime();
        System.out.println();

        System.out.println("DataTime 2:");
        dataTime2.imprimeDataTime();
        System.out.println();

        // Comparação de DataTime
        if (dataTime1.isEqual(dataTime2)) {
            System.out.println("DataTime 1 e DataTime 2 são iguais.");
        } else {
            System.out.println("DataTime 1 e DataTime 2 são diferentes.");
        }

        if (dataTime1.isGreather(dataTime2)) {
            System.out.println("DataTime 1 é maior que DataTime 2.");
        } else if (dataTime1.isLower(dataTime2)) {
            System.out.println("DataTime 1 é menor que DataTime 2.");
        } else {
            System.out.println("DataTime 1 e DataTime 2 são iguais.");
        }
    } 
}
