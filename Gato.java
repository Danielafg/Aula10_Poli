public class Gato extends Animal{
    private String corPelo;

    public Gato(float peso, int idade, String corPelo) {
        super(peso, idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
       System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Bebendo leite...");
    }

    @Override
    public void emitirSom() {
       System.out.println("Miando: miau miau...");
    }   
}