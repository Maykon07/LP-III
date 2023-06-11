import java.text.DecimalFormat;

public class Cilindro extends FiguraTridimensional{
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

    public double calcularAreaSuperficial() {
        return 2 * Math.PI * raio * (raio + altura);
    }

    public void imprimirDados() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Cilindro:");
        System.out.println("Raio da base: " + df.format(raio));
        System.out.println("Altura: " + df.format(altura));
        System.out.println("Volume: " + df.format(calcularVolume()));
        System.out.println("Área Superficial: " + df.format(calcularAreaSuperficial()));
    }
}
