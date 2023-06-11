import java.text.DecimalFormat;

public class Cone extends FiguraTridimensional{
     private double raio;
    private double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume() {
        return (1.0 / 3.0) * Math.PI * raio * raio * altura;
    }

    public double calcularAreaSuperficial() {
        double geratriz = Math.sqrt(raio * raio + altura * altura);
        return Math.PI * raio * (raio + geratriz);
    }

    public void imprimirDados() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Cone:");
        System.out.println("Raio da base: " + df.format(raio));
        System.out.println("Altura: " + df.format(altura));
        System.out.println("Volume: " + df.format(calcularVolume()));
        System.out.println("Área Superficial: " + df.format(calcularAreaSuperficial()));
    }
}
