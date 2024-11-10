// Comando para executar o programa
// javac src/dialogos/*.java -d bin && java -cp bin dialogos.Principal

package dialogos;

public class Principal {
    public static void main(String[] args) {
        Dialogo d = new Dialogo();

        d.dialogo();
    }
}
