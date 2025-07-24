package Locais;
import Agenda.Agenda;

public class Quadra {
    private String nome;
    private String descricao;
    private Agenda agendaQuadra;

    //metodos construtores

    public Quadra(String nome){
        this.nome = nome;
        this.descricao = null;
        agendaQuadra = new Agenda();
    }

    public Quadra(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        agendaQuadra = new Agenda();
    }


    //getters

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Agenda getAgenda(){
        return this.agendaQuadra;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
