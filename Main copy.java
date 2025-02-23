//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Pessoa pessoa = new Pessoa ();
     pessoa.setNome ("Ju");
     pessoa.setIdade(19);
     pessoa.setAltura(1.55);
     pessoa.setPeso(45);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("IMC: " + pessoa.calcularIMC());
        System.out.println("Classificação: " + pessoa.classificarIMC());

    }
}