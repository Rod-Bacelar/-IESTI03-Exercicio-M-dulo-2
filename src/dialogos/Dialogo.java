package dialogos;

import javax.swing.JOptionPane;

public class Dialogo {

    private void entradaNome() {
        int resposta;
        String nome;
        String[] opcoes = {"Sim", "Não", "Cancelar"};
        
        // Tela 1: Digitar o Nome
        nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?","Entrada", JOptionPane.QUESTION_MESSAGE);
        
        // Tela 2: Resposta ao nome digitado
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", seja bem vindo ao módulo de interfaces gráficas no Java!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

        // Tela 3: Pergunta se gosta de Programar
        resposta = JOptionPane.showOptionDialog(null, nome + "! Você gosta de programar?", "Selecionar uma Opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        // Respostas para pergunta anterior
        switch (resposta) {
            case 0:
                JOptionPane.showMessageDialog(null, "Então estude bem o Java Swing. Ele pode abrir várias portas para você", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 1:
                JOptionPane.showMessageDialog(null, "Que pena. Mas com as janelas você vai gostar", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                break;
        }
    }

    private void lembrete() {
        int resposta;
        String[] opcoes = {"Sim - Objeto é legal", "Não - Objeto é sofrimento", "Talvez - Quero aprender"};

        // Tela 4: Lembrete que Java Swing é tudo Objeto
        resposta = JOptionPane.showOptionDialog(null, "Lembrete, aqui no Java Swing tudo é objeto. Você gosta disto?", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

        switch (resposta) {
            case 0:
                JOptionPane.showMessageDialog(null, "Ótimo, todos os componentes são objetos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 1:
                JOptionPane.showMessageDialog(null, "Não se preocupe. Agora você irá aprender a importância dos objetos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Sim você aprenderá", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                break;
        }
    }

    public void dialogo() {
        entradaNome();
        lembrete();
    }

}
