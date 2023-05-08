package Lista_5;

import Lista_5.Lampada.TresEstado;

public class Teste_Lampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.mostraEstado();
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
        
        lampada.setEstadoDaLampada(Lampada.TresEstado.MEIA_LUZ);
        lampada.mostraEstado();
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
        
        lampada.apaga();
        lampada.mostraEstado();
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());

        Lampada l1 = new Lampada(TresEstado.ACESA);
        l1.acende();
        l1.mostraEstado();
        System.out.println("A l1 está ligada? " + l1.estaLigada());
        
        l1.setEstadoDaLampada(Lampada.TresEstado.MEIA_LUZ);
        l1.mostraEstado();
        System.out.println("A l1 está ligada? " + l1.estaLigada());
        
        l1.mostraEstado();
        System.out.println("A l1 está ligada? " + l1.estaLigada());
    }
}


