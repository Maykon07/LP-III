package Lista_7;
import java.time.Duration;


public class Teste_Time {
    public static void main(String[] args) {
        Time time1 = new Time(9, 0, 0); // 09:00:00
        Time time2 = new Time(10, 30, 0); // 10:30:00

        Duration diff = Time.diferenca(time1, time2);
        System.out.println("Diferença entre time1 e time2: " + diff); // Saída: PT1H30M (1 hora e 30 minutos)

        Time t1 = new Time(9, 0, 0); // Exemplo: 09:00:00

        diff = Time.diffTime(t1);
        System.out.println("Diferença entre t1 e hora atual: " + diff); // Saída: diferença de tempo
        System.out.println("09:00:00 é anterior a meio dia =>  " + Time.isAm(t1)); // Saída: true
        System.out.println("09:00:00 é posterior a meio dia =>  " + Time.isPm(t1)); // Saída: false
    }
}
