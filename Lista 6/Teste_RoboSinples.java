package Lista_6;

public class Teste_RoboSinples {
    public static void main(String[] args) {
        RoboSimples robo1 = new RoboSimples("Johnny 5");
        RoboSimples robo2 = new RoboSimples("R2D2", 2, 3, "SE");

        System.out.println("Estado inicial dos robôs:");
        System.out.println(robo1);
        System.out.println(robo2);

        robo1.move();
        robo2.move(2);
        robo1.mudaDirecao("NE");
        robo2.mudaDirecao("O");

        System.out.println("\nApós movimentação e mudança de direção:");
        System.out.println(robo1);
        System.out.println(robo2);
    }
}
