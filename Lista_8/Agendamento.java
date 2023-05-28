package Lista_8;

public class Agendamento {
    private Data data;
    private Time hora;
    private Contato contato;

    public Agendamento(Data data, Time hora, Contato contato) {
        this.data = data;
        this.hora = hora;
        this.contato = contato;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void imprimirAgendamento() {
        System.out.println("Data: " + data.getDia()+ ":" +data.getMes()+ ":" +data.getAno());
        System.out.println("Hora: " + hora.getTime());
        System.out.println("Contato:");
        contato.imprimirContato();
        System.out.println();
    }

    public boolean verificarAgendamento(Data data, Time hora) {
        return this.data.equals(data) && this.hora.equals(hora);
    }
}
