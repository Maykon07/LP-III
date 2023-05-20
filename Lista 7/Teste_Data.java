package Lista_7;


public class Teste_Data {
    public static void main(String[] args) {
            // Criação de uma instância da classe Data
            Data data = new Data(20, 5, 2023);

            // Exemplo de uso do método dayOfWeek
            String dayOfWeek = Data.dayOfWeek(data);
            System.out.println("Dia da semana: " + dayOfWeek);
    
            // Exemplo de uso do método dayToPrintShort
            String dayToPrintShort = Data.dayToPrintShort(data);
            System.out.println("Data formatada (curta): " + dayToPrintShort);
    
            // Exemplo de uso do método dayToPrintLong
            String dayToPrintLong = Data.dayToPrintLong(data);
            System.out.println("Data formatada (longa): " + dayToPrintLong);
    }
}
