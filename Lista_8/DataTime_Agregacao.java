package Lista_8;

public class DataTime_Agregacao {
    private Data data;
    private Time hora;
    // construtor
    public DataTime_Agregacao(Data data, Time hora){
        this.data = data;
        this.hora = hora;
    }

    public void imprimeDataTime(){
        System.out.println("Data: ");
        data.imprimirDataExtenso();
        System.out.println("Hora: ");
        hora.prnTime();
    }
    
    public boolean isEqual(DataTime_Agregacao outroObjeto){
        return this.data.equals(outroObjeto.data) && this.hora.equals(outroObjeto.hora);
    }

    public boolean isGreather(DataTime_Agregacao outroObjeto) {
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

    public boolean isAfter(DataTime_Agregacao outroObjeto) {
        if (this.data.isAfter(outroObjeto.data)) {
            return true;
        } else if (this.data.isEqual(outroObjeto.data)) {
            return this.hora.isAfter(outroObjeto.hora);
        } else {
            return false;
        }
    }
    
    public boolean isLower(DataTime_Agregacao outroObjeto) {
        return outroObjeto.isAfter(this);
    }
    
}
 