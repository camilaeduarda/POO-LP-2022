package banco;
    //---atributos---//
public class ContaCorrente {
    private String nome;
    private double saldo;
    private int conta;
    private int agencia;
    private double limite;


    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
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
             System.out.println("Saldo = R$" + this.saldo);
             return "Deposito efetuado!";
         }
         return "Deposito nao efetuado!";
     }

     public String sacar (int valor) {
         if (valor > 0 && valor <= this.saldo + this.limite){
             this.saldo -= valor;
             System.out.println("Saldo = R$" + this.saldo);
             return "Saque efetuado, retire seu dinheiro!";
         }
         return "Erro ao efetuar saque, tente novamente!";
     }
}
