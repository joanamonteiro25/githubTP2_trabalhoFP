// Programa principal para testar a classe Cilindro
public class Main {
    public static void main(String[] args) {

        // Cria um cilindro com raio 2 e altura 3
        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2);
        cilindro.setAltura(3);

        // Segundo cilindro com valores diferentes
        Cilindro cilindro2 = new Cilindro();
        cilindro2.setRaio(3);
        cilindro2.setAltura(2);

        // Exibe volume e área dos cilindros
        System.out.println("Cilindro 1 -> volume: " + cilindro.volume());
        System.out.println("Cilindro 1 -> área: " + cilindro.area());

        System.out.println("Cilindro 2 -> volume: " + cilindro2.volume());
        System.out.println("Cilindro 2 -> área: " + cilindro2.area());
    }
}
