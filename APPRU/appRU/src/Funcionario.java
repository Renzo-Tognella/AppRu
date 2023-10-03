public class Funcionario extends Pessoa{

    private String Cargo; 
    private String Registro;
    public Funcionario(String nome, String cpf, float saldo, Ticket tickets, String Cargo, String Registro) {
        super(nome, cpf, saldo, tickets);
        this.Cargo = Cargo;
        this.Registro = Registro;   
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getRegistro() {
        return Registro;
    }
    public void setRegistro(String registro) {
        Registro = registro;
    }
    

    //Nessa classe é o mesmo esquema de pessoa, atributos que os funcionarios da faculdade tem, cargo...    
    //a classe herda tudo de pessoa, ou seja, atributos basicos que todas as pessoas tem não devaram ser criadas aqui
    
}
