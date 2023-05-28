package Lista_8;

import java.time.LocalDate;

public class Teste_Agendamento {
    public static void main(String[] args) {
       
        Contato contato = new Contato("John Doe", "john@example.com", "123456789", LocalDate.of(1990, 5, 10));

        
        Data data = new Data(2023, 5, 30);

       
        Time hora = new Time(10, 30);
        
        Agendamento agendamento = new Agendamento(data, hora, contato);
     
        agendamento.imprimirAgendamento();

    }
}
