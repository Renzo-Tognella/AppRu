import java.util.ArrayList;

public class Pessoa {
    //Essa classe é a responsavel por todos os atributos e methodos que os usuarios usaram para poder efetuar uso de tickets
    //Por saldo, ver suas refeições que seria uma lista de tickets, e assim por diante
    private String nome,cpf;
    private ArrayList<Ticket> tickets;
    private float saldo;

    public Pessoa(String nome, String cpf, float saldo, Ticket tickets){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.tickets = new ArrayList<>();
    }

    public int getTickets() {
        return tickets.size();
    }   
    public void setTickets(Ticket ticket) {
        tickets.add(ticket);
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
}
