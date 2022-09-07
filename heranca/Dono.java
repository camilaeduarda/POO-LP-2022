package poo.heranca;

public class Dono extends Pessoa {

    private int qtoAnimais = 0;
    private AnimalTerrestre animal;

    public AnimalTerrestre getAnimal() {
        return this.animal;
    }

    public void setAnimal(AnimalTerrestre animal) {
        this.animal = animal;
    }

    public int getQtoAnimais() {
        return this.qtoAnimais;
    }

    public void setQtoAnimais(int qtoAnimais) {
        this.qtoAnimais = qtoAnimais;
    }

    // Construtor da classe
    public Dono() {
        super(); // Chama o construtor da superclasse
    }

   /* public void alimentarAnimal(AnimalTerrestre animal){

    } */

    public void alimentarAnimal(Caes animal){
        System.out.println("Estou alimentando o cao chamado " + animal.getNome());
    }
    public void alimentarAnimal(Gatos animal){
        System.out.println("Estou alimentando o gato chamado " + animal.getNome());
    }

    @Override 
    public void andar() {
        this.passos += 2;
        System.out.println("Estou correndo");
    }
}
