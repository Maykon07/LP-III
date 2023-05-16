package Lista_6;
import java.time.LocalTime;

public class Teste_Time {
    public static void main(String[] args) {
        // Cria um objeto Time com a hora atual
        LocalTime agora = LocalTime.now();
        Time horaAtual = new Time(agora.getHour(), agora.getMinute(), agora.getSecond());

        // Imprime a hora atual
        System.out.print("Hora atual: ");
        horaAtual.prnTime();

        // Adiciona 3600 segundos (1 hora)
        horaAtual.addTime(3600);

        // Imprime a hora atualizada
        System.out.print("Hora atualizada: ");
        horaAtual.prnTime();

        // Adiciona 30 minutos e 0 segundos 
        horaAtual.addTime(30, 0); 
        System.out.print("30 min e 0 seg a mais: ");
        horaAtual.prnTime();  
        
         // Adiciona 1 hor, 30 minutos e 0 segundos 
         horaAtual.addTime(1, 30, 0); 
         System.out.print("1 hora, 30 min e 0 seg a mais: ");
         horaAtual.prnTime(); 
    }
}
