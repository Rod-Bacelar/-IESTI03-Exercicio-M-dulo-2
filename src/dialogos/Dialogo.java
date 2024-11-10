// Comando para executar o programa
// javac src/dialogos/*.java -d bin && java -cp bin dialogos.Principal


package dialogos;

import javax.swing.JOptionPane;

public class Dialogo {

    private void entradaNome() {
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?","Entrada", JOptionPane.QUESTION_MESSAGE);
        System.out.println(nome);
    }

    public void dialogo() {
        entradaNome();
    }

}
