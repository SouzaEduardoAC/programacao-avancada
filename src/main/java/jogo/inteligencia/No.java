package jogo.inteligencia;

import javax.swing.*;

public abstract class No {
    protected String valor;
    protected No respostaNegativa;
    protected No respostaPositiva;

    public String getValor(){
        return valor;
    }

    public No getRespostaNegativa(){
        return respostaNegativa;
    }

    public No getRespostaPositiva(){
        return respostaPositiva;
    }

    public boolean fazerPergunta(){
        return JOptionPane.showConfirmDialog(null, pergunta(), "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public void setRespostaNegativa(No resposta){
        this.respostaNegativa = resposta;
    }

    public void setRespostaPositiva(No resposta){
        this.respostaPositiva = resposta;
    }

    protected abstract String pergunta();
}
