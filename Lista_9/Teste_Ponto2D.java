public class Teste_Ponto2D {
     public static void main(String[] args) {
        // Criando objetos da classe Ponto2D
        Ponto2D ponto1 = new Ponto2D(); // origem (0, 0)
        Ponto2D ponto2 = new Ponto2D(3, 4); // posição (3, 4)
        Ponto2D ponto3 = new Ponto2D(ponto2); // usando um ponto construído previamente

        // Imprimindo os pontos
        System.out.println("Ponto 1: " + ponto1.toString()); // Saída: Ponto 1: (0.0, 0.0)
        System.out.println("Ponto 2: " + ponto2.toString()); // Saída: Ponto 2: (3.0, 4.0)
        System.out.println("Ponto 3: " + ponto3.toString()); // Saída: Ponto 3: (3.0, 4.0)

        // Verificando se os pontos estão nos eixos X e Y
        System.out.println("Ponto 1 está no eixo X? " + ponto1.inAxisX()); // Saída: Ponto 1 está no eixo X? true
        System.out.println("Ponto 2 está no eixo Y? " + ponto2.inAxisY()); // Saída: Ponto 2 está no eixo Y? false

        // Verificando se os pontos estão sobre os eixos
        System.out.println("Ponto 1 está sobre os eixos? " + ponto1.inAxis()); // Saída: Ponto 1 está sobre os eixos? true
        System.out.println("Ponto 2 está sobre os eixos? " + ponto2.inAxis()); // Saída: Ponto 2 está sobre os eixos? false
     }
}
