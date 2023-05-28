package Lista_8;

public class Teste_DataTime_Agregacao {
    public static void main(String[] args) {
        // Criação de objetos DataTime
        Data d1 = new Data(20,5,2023);
        Data d2 = new Data(22,5,2023);
        Time t1 = new Time(12,30,0);
        Time t2 = new Time(10,45,0);
        DataTime_Agregacao dataTime1 = new DataTime_Agregacao(d1, t1);
        DataTime_Agregacao dataTime2 = new DataTime_Agregacao(d2, t2);

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
