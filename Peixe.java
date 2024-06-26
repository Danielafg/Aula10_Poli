public class Peixe extends Animal{
    private String corEscama;

    public Peixe(float peso, int idade, String corEscama) {
        super(peso, idade);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corPelo) {
        this.corEscama = corPelo;
    }

    @Override
    public void locomover() {
       System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhoca...");
    }

    @Override
    public void emitirSom() {
       System.out.println("Fazendo ruídos aquáticos...");
    }   

    public void soltandoBolhas(){
        System.out.println("Soltando bolhas...");
    }
}