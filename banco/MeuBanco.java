package banco;

public class MeuBanco {

    public static void main (String[]args) {
        ContaCorrente conta_camila = new ContaCorrente(0, 500);
        conta_camila.setNome("Camila");
        conta_camila.setAgencia(123);
        conta_camila.setConta(456);

        conta_camila.depositar(100.00);
        conta_camila.depositar(50.25);

        conta_camila.sacar(1000);
        
    }

}
