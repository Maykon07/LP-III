public class Teste_Lampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acende();
        lampada.mostraEstado();
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
        
        lampada.setEstadoDaLampada(Lampada.TresEstado.MEIA_LUZ);
        lampada.mostraEstado();
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
        
        lampada.apaga();
        lampada.mostraEstado();
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
    }

}
