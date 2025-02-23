//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro (); // variável cilindro (do tipo Cilindro) contém uma referência para o objeto cilindro
        cilindro.setRaio (2); // altera o valor nesta variável para 2 porque invoca o método set
        cilindro.setAltura (3); // altera o valor nesta variável para 3 porque invoca o método set

        Cilindro cilindro2 = new Cilindro (); // criar uma segunda variável a partir da mesma classe (Cilindro) pelo que têm os mesmos atributos (mas podem tem valores- objetos, diferentes)
        cilindro2.setRaio (3);
        cilindro2.setAltura (2);

        System.out.println("volume: " + cilindro.volume ());
        System.out.println("área: " + cilindro.area ());

        System.out.println("volume 2: " + cilindro2.volume ());
        System.out.println("área 2: " + cilindro2.area ());

    }
}