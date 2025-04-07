// Classe que representa uma pessoa com atributos físicos e métodos para calcular e classificar o IMC
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Retorna o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Retorna a idade
    public int getIdade() {
        return idade;
    }

    // Retorna a altura em metros
    public double getAltura() {
        return altura;
    }

    // Retorna o peso em kg
    public double getPeso() {
        return peso;
    }

    // Define o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define a idade se for maior que 0
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    // Define a altura se for maior que 0
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    // Define o peso se for maior que 0
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    // Calcula o IMC (Índice de Massa Corporal)
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Classifica o IMC de acordo com faixas padronizadas
    public String classificarIMC() {
        double imc = this.calcularIMC();
        if (imc < 18.5) {
            return "abaixo do peso";
        } else if (imc < 25) {
            return "peso normal";
        } else if (imc < 30) {
            return "sobrepeso";
        } else if (imc < 35) {
            return "obesidade grau 1";
        } else if (imc < 40) {
            return "obesidade grau 2";
        } else {
            return "obesidade grau 3";
        }
    }

    // Retorna uma descrição completa do objeto Pessoa
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Altura: " + this.altura + "\n" +
                "Peso: " + this.peso + "\n" +
                "IMC: " + this.calcularIMC() + "\n" +
                "Classificação: " + this.classificarIMC();
    }
}
