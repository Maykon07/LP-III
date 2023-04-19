package Lista_3.Ponto2D;

public class Teste_Ponto2D {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(1.0, 2.0);
        Ponto2D p2 = new Ponto2D(3.0, 4.0);

        System.out.println("Coordenadas do ponto p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Coordenadas do ponto p2: (" + p2.getX() + ", " + p2.getY() + ")");

        p1.setX(5.0);
        p2.setY(6.0);

        System.out.println("Coordenadas do ponto p1 depois de alterar x: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Coordenadas do ponto p2 depois de alterar y: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
