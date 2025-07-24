package Agenda;
import java.time.LocalDate;

public class Reserva {
    private String nome;
    private String descricao;
    private LocalDate inicio;
    private LocalDate fim;

    //metodos construtores

    public Reserva(String nome, String descricao, LocalDate inicio, LocalDate fim){
        this.nome = nome;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Reserva(String nome, LocalDate inicio, LocalDate fim){
        this.nome = nome;
        this.descricao = null;
        this.inicio = inicio;
        this.fim = fim;
    }

    //getters

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public LocalDate getInicio(){
        return this.inicio;
    }

    public LocalDate getFim(){
        return this.fim;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setInicio(LocalDate inicio){
        this.inicio = inicio;
    }

    public void setFim(LocalDate fim){
        this.fim = fim;
    }

    // Verifica se esta reserva conflita com outro
    public boolean conflita(Reserva outro) {
        return !(this.fim.isBefore(outro.inicio) || this.inicio.isAfter(outro.fim));
    }


}   


