package Lista_5;
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
        horaAtual.addSeconds(3600);

        // Imprime a hora atualizada
        System.out.print("Hora atualizada: ");
        horaAtual.prnTime();
    }
}
