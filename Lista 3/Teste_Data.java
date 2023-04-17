package Lista_3.data;

public class Teste_Data {
    public static void main(String[] args) {
        Data hoje = new Data(17, 4, 2023);
        System.out.println("Hoje é: " + hoje);
        hoje.setDia(18);
        hoje.setMes(4);
        hoje.setAno(2023);
        System.out.println("Amanhã é: " + hoje);
    }
}
