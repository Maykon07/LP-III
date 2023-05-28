package Lista_8;

public class DataTime {
    private Data data;
    private Time hora;
    // construtor
    public DataTime(int dia, int mes, int ano, int hora, int min, int seg){
        this.data = new Data(dia, mes, ano);
        this.hora = new Time(hora, min, seg);
    }

    public void imprimeDataTime(){
        System.out.println("Data: ");
        data.imprimirDataExtenso();
        System.out.println("Hora: ");
        hora.prnTime();
    }
    
    public boolean isEqual(DataTime outroObjeto){
        return this.data.equals(outroObjeto.data) && this.hora.equals(outroObjeto.hora);
    }

    public boolean isGreather(DataTime outroObjeto) {
        // Compare the dates
        if (this.data.isAfter(outroObjeto.data)) {
            return true;
        } else if (this.data.isBefore(outroObjeto.data)) {
            return false;
        } else {
            // Dates are equal, compare the times
            return this.hora.isAfter(outroObjeto.hora);
        }
    }

    public boolean isAfter(DataTime outroObjeto) {
        if (this.data.isAfter(outroObjeto.data)) {
            return true;
        } else if (this.data.isEqual(outroObjeto.data)) {
            return this.hora.isAfter(outroObjeto.hora);
        } else {
            return false;
        }
    }
    
    public boolean isLower(DataTime outroObjeto) {
        return outroObjeto.isAfter(this);
    }
    
}
 