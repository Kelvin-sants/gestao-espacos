package Locais;

import Agenda.Agenda;

public class Auditorio {
    private String nome;
    private String descricao;
    private Agenda agendaAuditorio;

    //metodos construtores

    public Auditorio(String nome){
        this.nome = nome;
        this.descricao = null;
        agendaAuditorio = new Agenda();
    }

    public Auditorio(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        agendaAuditorio = new Agenda();
    }


    //getters

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Agenda getAgenda(){
        return this.agendaAuditorio;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
