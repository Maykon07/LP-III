package Lista_5;
import java.time.LocalTime;

public class Time {
    private int hora;
    private int min;
    private int seg;
    //CONSTRUTOR    
    public Time(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time(){
        setTime(0,0,0);
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMin() {
        return min;
    }
    
    public int getSeg() {
        return seg;
    }
    //boolean isAm(): retorna verdadeiro se a hora for anterior a 12:00 e falso caso contrário
    public boolean isAm(){
        if((this.hora < 12)){
            return true;
        }else{
            return false;
        }
    }
    
    
    public void addSeconds(int secs) {
        // Cria um objeto LocalTime com a hora atual
        LocalTime horaAtual = LocalTime.of(hora, min, seg);
    
        // Adiciona os segundos passados como parâmetro
        LocalTime horaNova = horaAtual.plusSeconds(secs);
    
        // Verifica se a nova hora é do dia seguinte
        boolean horaDoDiaSeguinte = horaNova.isBefore(horaAtual);
    
        // Atualiza os valores dos atributos hora, min e seg
        this.hora = horaNova.getHour();
        this.min = horaNova.getMinute();
        this.seg = horaNova.getSecond();
    
        // Se a nova hora for do dia seguinte, adiciona um dia ao atributo hora
        if (horaDoDiaSeguinte) {
            this.hora += 24;
        }
    }
    
   
    private boolean validateTime(int hora, int min, int seg){
        return validateHour(hora) && 
               validateMinOrSec(min) && 
               validateMinOrSec(seg);
    }

    private boolean validateHour(int hora){
        if((hora>=0) && (hora<25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int param){
        if((param>=0) && (param<61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg){
        if (validateTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        }
        else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public String getTime(){
        String res = this.hora + ":" + this.min + ":" + this.seg;
        return res;
    }

    public void prnTime(){
        System.out.println(getTime());
    }
}
