public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Método para inicializar a data com os valores passados como parâmetros
    public void inicializarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método para verificar se a data é válida
    public boolean verificarData() {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }
        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }
        return true;
    }

    // Métodos para acessar e alterar os valores dos atributos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para imprimir a data no formato dd/mm/yyyy
    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }

    // Método para imprimir a data no formato "16 de outubro de 2022"
    public void imprimirDataExtenso() {
        String[] meses = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        System.out.printf("%d de %s de %d\n", dia, meses[mes], ano);
    }
}