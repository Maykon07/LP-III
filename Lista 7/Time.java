package Lista_7;
import java.time.LocalTime;
import java.time.Duration;

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
        this(0,0,0);
    }
    public Time(int hora){
        this(hora,0,0);
    }
    public Time(int hora, int min){
        this(hora,min,0);
    }
    public Time(Time time) {
        this.hora = time.getHora();
        this.min = time.getMin();
        this.seg = time.getSeg();
    }
//=====================================================================
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
    
    public void addTime(int s) {
        addSeconds(s);
    }
    
    public void addTime(int m, int s) {
        int totalSeconds = (m * 60) + s;
        addSeconds(totalSeconds);
    }
    
    public void addTime(int h, int m, int s) {
        int totalSeconds = (h * 3600) + (m * 60) + s;
        addSeconds(totalSeconds);
    }
    
    public void addTime(Time obj) {
        int totalSeconds = (obj.getHora() * 3600) + (obj.getMin() * 60) + obj.getSeg();
        addSeconds(totalSeconds);
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

    public static Duration diferenca(Time time1, Time time2) {
        LocalTime localTime1 = LocalTime.of(time1.getHora(), time1.getMin(), time1.getSeg());
        LocalTime localTime2 = LocalTime.of(time2.getHora(), time2.getMin(), time2.getSeg());
        return Duration.between(localTime1, localTime2);
    }

    public static Duration diffTime(Time t1) {
        LocalTime currentTime = LocalTime.now();
        LocalTime t1Time = LocalTime.of(t1.getHora(), t1.getMin(), t1.getSeg());
        return Duration.between(t1Time, currentTime);
    }

    public static boolean isAm(Time t){
        return (t.hora < 12);
    }

    public static boolean isPm(Time t){
        return (t.hora > 12);
    }
}
