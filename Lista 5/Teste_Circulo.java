package Lista_5;

public class Teste_Circulo {
    public static void main(String[] args) {
         // Criando um objeto Ponto2D
         Ponto2D ponto = new Ponto2D(1, 2);
        
         // Criando um objeto Circulo
         Circulo circulo = new Circulo(0, 0, 5);
         
         // Imprimindo as informações do círculo
         circulo.imprimirCirculo();
         
         // Verificando se o ponto está dentro do círculo
         if (circulo.isInnerPoint(ponto)) {
             System.out.println("O ponto (" + ponto.getX() + ", " + ponto.getY() + ") está dentro do círculo.");
         } else {
             System.out.println("O ponto (" + ponto.getX() + ", " + ponto.getY() + ") não está dentro do círculo.");
         }
         
         // Calculando e imprimindo a área do círculo
         float area = circulo.area();
         System.out.println("A área do círculo é " + area);
         
         // Calculando e imprimindo o perímetro do círculo
         float perimetro = circulo.perimeter();
         System.out.println("O perímetro do círculo é " + perimetro);
         
         // Criando outro círculo
         Circulo outroCirculo = new Circulo(0, 0, 3);
         
         // Verificando se o primeiro círculo é maior que o segundo
         if (circulo.isBiggerThan(outroCirculo)) {
             System.out.println("O primeiro círculo é maior que o segundo.");
         } else {
             System.out.println("O segundo círculo é maior que o primeiro.");
         }
    }
}
