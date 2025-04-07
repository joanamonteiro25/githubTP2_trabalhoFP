// Programa principal para testar a classe Pessoa
public class Main {
    public static void main(String[] args) {

        // Cria uma pessoa e define seus dados
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ju");
        pessoa.setIdade(19);
        pessoa.setAltura(1.55);
        pessoa.setPeso(45);

        // Exibe os dados da pessoa e o resultado do IMC
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("IMC: " + pessoa.calcularIMC());
        System.out.println("Classificação: " + pessoa.classificarIMC());
    }
}
