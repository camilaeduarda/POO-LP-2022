package banco;
    //---atributos---//
public class ContaPoupanca {
    private String nome;
    private double saldo;
    private int conta;
    private int agencia;


    public ContaPoupanca(double saldo_inicial) {
        this.saldo = saldo_inicial;
    }

    //---getterse setters---//

    public String getNome () {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
     public double getSaldo() {
         return this.saldo;
     }

     public int getConta() {
         return this.conta;
     }

     public void setConta(int conta) {
         this.conta = conta;
     }

     public int getAgencia() {
         return this.agencia;
     }

     public void setAgencia(int agencia) {
         this.agencia = agencia;
     }

     public String depositar (double valor) {
         if (valor > 0) {
             this.saldo +=valor;
             return "Deposito efetuado!";
         }
         return "Deposito nao efetuado!";
     }

     public String sacar (double valor) {
         if (valor > 0 && valor <= saldo){
             this.saldo -= valor;
             return "Saque efetuado, retire seu dinheiro!";
         }
         return "Erro ao efetuar saque, tente novamente!";
     }
}
