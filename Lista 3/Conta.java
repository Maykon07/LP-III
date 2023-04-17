package Lista_3.banco;

public class Conta {
    private String nome;
    private double saldo;
    private boolean contaEspecal;

    void setnome(String cliente){
        nome = cliente;
    }
    String getnome(){
        return nome;
    }
    void setsaldo(Double dinheiro){
        saldo = dinheiro;
    }
    double getsaldo(){
        return saldo;
    }
    void setnome(boolean estado){
        contaEspecal = estado;
    }
    boolean getcontaEspecal(){
        return contaEspecal;
    }
    void abreConta(String n, double deposito, boolean e){
        nome = n;
        saldo = deposito;
        contaEspecal = e;
    }
    void contaSimplis(String Nome){
        nome = Nome;
        saldo = 0.0;
        contaEspecal = false;
    }
    void deposita(double val){
        saldo += val;
    }
    void retira(double val){
        if(contaEspecal == false){
            if(val <= saldo){
                saldo -= val;
            }
        }else{
            saldo -= val;
        }
    }
    void mostrDados(){
        System.out.println("O Nome do Correntista é: " +nome);
        System.out.println("O Saldo é: " +saldo); 
        if(contaEspecal){
            System.out.println("AConta é especial"); 
        }else{
            System.out.println("A Conta é comun "); 
        }
       
    }
}
