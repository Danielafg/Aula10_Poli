public abstract class Animal {
    //Atributos de Animal
    protected float peso;
    protected int idade;
    
    public Animal(float peso, int idade) {    //Construtor
        this.peso = peso;
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // métodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}