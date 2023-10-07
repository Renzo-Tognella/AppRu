import java.time.LocalDate;
//Atributos do ticket: valor, codigo do ticket, e assim por diante...
public class Ticket {
    static LocalDate dataDoTicket; 
    boolean usado;
    static double valor = 3.5;
    public Ticket(boolean usado, Float valor) {
        this.usado = usado;
    }
    public static LocalDate getDataDoTicket() {
        return dataDoTicket;
    }
    public static void setDataDoTicket(LocalDate dataDoTicket) {
        Ticket.dataDoTicket = dataDoTicket;
    }
    public boolean isUsado() {
        return usado;
    }
    public void setUsado(boolean usado) {
        this.usado = usado;
    }
    
}
