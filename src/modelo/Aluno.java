package modelo;

import java.util.LinkedList;

public class Aluno extends Pessoa{
    //Atributos


    //construtor
    public Aluno(String nome, long numero){
        super(nome,numero);
    }

    //Metodos
    @Override
    public void associar(Aula aula) {
        aula.adicionar(this);
    }

    @Override
    protected void desassociar(Aula aula) {
        aula.remover(this);
    }

    @Override
    protected void escreverSumario(Aula aula) {
        //assinar o sumario
        assinarSumario(aula);
    }
}
