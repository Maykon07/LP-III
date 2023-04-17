package Lista_3.lampada;

public class LampadaTresEstados {
    //atributo
    String estadoDaLampada;

    void acender(){
        estadoDaLampada = "acesa";
    }
    void apaga(){
        estadoDaLampada = "apagada";
    }
    void meia_luz(){
        estadoDaLampada = "meia luz";
    }
    void mostraEstado(){
        System.out.println("A lampada esta: " + estadoDaLampada);
    }
    int estaLigada(){
        if( estadoDaLampada == "acesa"){
            return 1;
        }else{
            return 0;
        }
    }
}
