package Locais;
import Agenda.Agenda;

public class Campo {
    private String nome;
    private String descricao;
    private Agenda agendaCampo;

    //metodos construtores

    public Campo(String nome){
        this.nome = nome;
        this.descricao = null;
        agendaCampo = new Agenda();
    }

    public Campo(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        agendaCampo = new Agenda();
    }


    //getters

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Agenda getAgenda(){
        return this.agendaCampo;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
