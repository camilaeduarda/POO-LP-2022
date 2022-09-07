package poo.heranca;

public class Gatos extends AnimalTerrestre{


    public Gatos(){
        super();
    }


    @Override
    //Polimorfismo, sobrescrita do método emitirSom da superclass
    public void emitirSom() {
        System.out.println("O gato " + this.nome + " diz Meowwwwww");
        
    }
    
}
