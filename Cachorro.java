public class Cachorro extends Animal{
    private String corPelo;

    public Cachorro(float peso, int idade, String corPelo) { // Construtor
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
       System.out.println("Caminhando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração...");
    }

    @Override
    public void emitirSom() {
       System.out.println("Latindo: au au...");
    }

    /* 
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanando o rabo...");
        } else  
            System.out.println("Rosnando...");
        
    }
    
    public void reagir(String frase){
        if(frase == "Vamos passear"){
            System.out.println("Abanando o rabo...");
        } else if  (frase == "Vamos tomar banho"){
            System.out.println("Rosnando...");
        } else System.out.println("Sem reação...");
    }
   */
}