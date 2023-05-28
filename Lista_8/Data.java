package Lista_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor da classe
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

     // Construtor da classe sem parâmetros (1/1/1970)
     public Data() {
        this(1, 1, 1970);
    }

    // Construtor da classe que recebe um objeto Data como parâmetro
    public Data(Data data) {
        this(data.getDia(), data.getMes(), data.getAno());
    }

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

    // Retorna verdadeiro se a data passada por parâmetro é anterior à data do objeto
    public boolean isPrevious(Data outraData) {
        if (outraData.ano < this.ano) {
            return true;
        } else if (outraData.ano == this.ano && outraData.mes < this.mes) {
            return true;
        } else if (outraData.ano == this.ano && outraData.mes == this.mes && outraData.dia < this.dia) {
            return true;
        }
        return false;
    }
    
    public int howManyDays(Data outraData) {
        Calendar atual = Calendar.getInstance();
        atual.set(this.ano, this.mes - 1, this.dia); // Note que o mês começa em 0 no objeto Calendar
        Calendar outra = Calendar.getInstance();
        outra.set(outraData.getAno(), outraData.getMes() - 1, outraData.getDia());
        long diferenca = outra.getTimeInMillis() - atual.getTimeInMillis();
        int dias = (int) (diferenca / 86400000);
        if (outra.before(atual)) {
            dias *= -1;
        }
        return dias;
    }

   
    public int howManyDays(int dia, int mes, int ano) {
        Data outraData = new Data(dia, mes, ano);
        return this.howManyDays(outraData);
    }

    // Lista 7 =========================================================================================
    public static int howManyDaysUntilEndYear(Data d) {
        int year = d.getAno();
        int month = d.getMes();
        int day = d.getDia();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        int daysInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        int daysUntilEndOfYear = daysInYear - calendar.get(Calendar.DAY_OF_YEAR);

        return daysUntilEndOfYear;
    }

    public static int howManyDaysUntilNextMonth(Data d) {
        int year = d.getAno();
        int month = d.getMes();
        int day = d.getDia();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        long differenceInMillis = calendar.getTimeInMillis() - System.currentTimeMillis();
        int daysUntilNextMonth = (int) (differenceInMillis / (24 * 60 * 60 * 1000));

        return daysUntilNextMonth;
    }

    public static boolean isBisexto(Data d) {
        int year = d.getAno();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    public static String dayOfWeek(Data d) {
        int year = d.getAno();
        int month = d.getMes();
        int day = d.getDia();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        Date date = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");

        return dateFormat.format(date);
    }

    public static String dayToPrintShort(Data d) {
        int year = d.getAno();
        int month = d.getMes();
        int day = d.getDia();

        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static String dayToPrintLong(Data d) {
        int year = d.getAno();
        int month = d.getMes();
        int day = d.getDia();

        String[] meses = {
            "", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
            "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        return String.format("%d de %s de %d", day, meses[month], year);
    }

    public boolean isAfter(Data outraData) {
        if (this.ano > outraData.ano) {
            return true;
        } else if (this.ano < outraData.ano) {
            return false;
        } else {
            // Years are equal, compare months
            if (this.mes > outraData.mes) {
                return true;
            } else if (this.mes < outraData.mes) {
                return false;
            } else {
                // Months are equal, compare days
                return this.dia > outraData.dia;
            }
        }
    }

    public boolean isEqual(Data outraData) {
        return this.dia == outraData.dia && this.mes == outraData.mes && this.ano == outraData.ano;
    }
    
    public boolean isBefore(Data outraData) {
        if (this.ano < outraData.ano) {
            return true;
        } else if (this.ano > outraData.ano) {
            return false;
        } else {
            // Years are equal, compare months
            if (this.mes < outraData.mes) {
                return true;
            } else if (this.mes > outraData.mes) {
                return false;
            } else {
                // Months are equal, compare days
                return this.dia < outraData.dia;
            }
        }
    }

    public String getData() {
        return null;
    }

}
