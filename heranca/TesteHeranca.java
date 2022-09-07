package poo.heranca;

public class TesteHeranca {
    
    public static void main(String[] args) {
        Caes malu = new Caes();
        malu.setNome("Malu");
        malu.setIdade(2);
        malu.setRaca("Shitzu");
        
        Dono mathews = new Dono();

        mathews.setNome("Mathews");
        mathews.setEndereco("Rua PL, 564");
        mathews.setAnimal(malu);

        mathews.getAnimal().emitirSom();
        mathews.alimentarAnimal(malu);
        mathews.andar();

        Funcionario henrique = new Funcionario();
        henrique.setMatricula(123456);
        henrique.toString();
    }
}
