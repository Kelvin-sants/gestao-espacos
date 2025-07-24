package Locais;
import Agenda.Agenda;

public class Sala {
    private String nome;
    private String descricao;
    private Agenda agendaSala;

    //metodos construtores

    public Sala(String nome){
        this.nome = nome;
        this.descricao = null;
        agendaSala = new Agenda();
    }

    public Sala(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        agendaSala = new Agenda();
    }


    //getters

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Agenda getAgenda(){
        return this.agendaSala;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
