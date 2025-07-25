package Locais;
import Agenda.Agenda;

public class SalaReuniao {
    private String nome;
    private String descricao;
    private Agenda agendaSalaReuniao;

    //metodos construtores

    public SalaReuniao(String nome){
        this.nome = nome;
        this.descricao = null;
        agendaSalaReuniao = new Agenda();
    }

    public SalaReuniao(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        agendaSalaReuniao = new Agenda();
    }


    //getters

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Agenda getAgenda(){
        return this.agendaSalaReuniao;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
