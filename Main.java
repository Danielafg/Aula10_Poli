public class Main {
    public static void main(String[] args) throws Exception {
        //Animal novoAnimal = new Animal(10.5f, 2);
            
        Cachorro c = new Cachorro(10.5f, 2, "Marrom"); 
        System.out.println(" ------  Cachorro  ------ ");
        c.locomover();  // Caminhando
        c.alimentar(); // Comendo ração
        c.emitirSom(); // Latindo 
        //c.reagir(true);
        //c.reagir("Vamos tomar banho");

        Gato g = new Gato(7.5f,5,"amarelo");
        System.out.println("------ Gato -------");
        g.locomover();  // Correndo
        g.alimentar();  // Bebendo leite
        g.emitirSom(); // Miando
        
    
        Peixe p = new Peixe(7.5f, 5, "azul");
        System.out.println("------ Peixe ------- ");
        p.locomover();  // Nadando
        p.alimentar();  // Comendo minhoca
        p.emitirSom();  // Ruídos aquáticos
        p.soltandoBolhas();  // soltando bolhas  
    }
}
