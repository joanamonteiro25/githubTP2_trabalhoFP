public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }
     public double calcularIMC () {
        return peso/ (altura * altura);
    }

    public String classificarIMC () {
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

   public String toString () { // permite obter uma representação String do estado do objeto- pessoa
     return  "Nome: " + this.nome + "\n" +
             "Idade: " + this.idade + "\n" +
             "Altura: " + this.altura + "\n" +
             "Peso: " + this.peso + "\n" +
             "IMC: " + this.calcularIMC() + "\n" +
             "Classificação: " + this.classificarIMC();
   }
}


