public class Animal { 
    // Atributos da classe
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    boolean animalComFome;
    String somAnimal; 
    
    //Método para imprimir os atributos do animal
    public void printStatus(){
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Número de patas: " +numeroDePatas);
        System.out.println("Tem rabo? " +temRabo);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Tipo de alimentação: " + tipoAlimentacao);
        System.out.println("Genero: " + genero);
        System.out.println("------------------------------------------------");
        System.out.println("O som de " + nomeAnimal + " é " + somAnimal);
        System.out.println("------------------------------------------------");
        
    }
    public void alimentarAnimal() {
        if (animalComFome == true) {
            System.out.println(nomeAnimal + " acabou de ser alimentado ");
            
            
        }
    }
    
    
    
    //Método principal main
    public static void main(String[] args){
        //Criando o primeiro animal
        Animal cachorro = new Animal();
        cachorro.nomeAnimal = "Euclides";
        cachorro.numeroDePatas = 4;
        cachorro.temRabo = true;
        cachorro.cor = "Tigrado";
        cachorro.idade = 4;
        cachorro.peso = 15;
        cachorro.tipoAlimentacao = "Ração";
        cachorro.genero = 'M';
        cachorro.animalComFome = true;
        cachorro.somAnimal = "Auuuuu";
        
         Animal gato = new Animal();
        gato.nomeAnimal = "Neve";
        gato.numeroDePatas = 4;
        gato.temRabo = true;
        gato.cor = "Branco";
        gato.idade = 5;
        gato.peso = 7;
        gato.tipoAlimentacao = "Ração";
        gato.genero = 'F';
        gato.animalComFome = true;
        gato.somAnimal = "Miauuu";
        
         Animal cavalo = new Animal();
        cavalo.nomeAnimal = "Dourado";
        cavalo.numeroDePatas = 4;
        cavalo.temRabo = true;
        cavalo.cor = "Marrom";
        cavalo.idade = 10;
        cavalo.peso = 450;
        cavalo.tipoAlimentacao = "Ração";
        cavalo.genero = 'M';
        cavalo.animalComFome = false;
        cavalo.somAnimal = "iiirrrrí";
        
        //Chamando os métodos para imprimir os atributos
        cachorro.printStatus();
        gato.printStatus();
        cavalo.printStatus();
        cachorro.alimentarAnimal();
        gato.alimentarAnimal();
        cavalo.alimentarAnimal();
    
        
    }
    
}