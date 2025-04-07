// Classe que representa um cilindro geométrico com métodos para calcular volume e área
public class Cilindro {

    private double raio;
    private double altura;

    // Retorna o raio do cilindro
    public double getRaio() {
        return raio;
    }

    // Define o raio do cilindro
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Retorna a altura do cilindro
    public double getAltura() {
        return altura;
    }

    // Define a altura do cilindro
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Calcula o volume do cilindro usando a fórmula π * r² * h
    public double volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    // Calcula a área total da superfície do cilindro
    public double area() {
        return 2 * Math.PI * raio * (raio + altura);
    }
}
