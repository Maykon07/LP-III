public class Lampada {
    // Definição dos possíveis estados da lâmpada
    public enum TresEstado {
        APAGADA, ACESA, MEIA_LUZ
    }
    
    private TresEstado estadoDaLampada;

    // Método para acender a lâmpada
    public void acende() {
        estadoDaLampada = TresEstado.ACESA;
    }
    
    // Método para apagar a lâmpada
    public void apaga() {
        estadoDaLampada = TresEstado.APAGADA;
    }
    
    // Método para definir o estado da lâmpada
    public void setEstadoDaLampada(TresEstado estado) {
        estadoDaLampada = estado;
    }
    
    // Método para obter o estado da lâmpada
    public TresEstado getEstadoDaLampada() {
        return estadoDaLampada;
    }
    
    // Método para mostrar o estado da lâmpada
    public void mostraEstado() {
        System.out.println("Estado da lâmpada: " + estadoDaLampada);
    }
    
    // Método para verificar se a lâmpada está ligada
    public boolean estaLigada() {
        return estadoDaLampada != TresEstado.APAGADA;
    }
}
