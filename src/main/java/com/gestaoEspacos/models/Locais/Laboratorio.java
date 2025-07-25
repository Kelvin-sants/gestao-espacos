package Locais;
import Agenda.Agenda;

public class Laboratorio {
    private String nome;
    private String descricao;
    private Agenda agendaLaboratorio;

    //metodos construtores

    public Laboratorio(String nome){
        this.nome = nome;
        this.descricao = null;
        agendaLaboratorio = new Agenda();
    }

    public Laboratorio(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        agendaLaboratorio = new Agenda();
    }


    //getters

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Agenda getAgenda(){
        return this.agendaLaboratorio;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
