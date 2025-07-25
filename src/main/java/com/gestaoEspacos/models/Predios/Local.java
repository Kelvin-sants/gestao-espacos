package Predios;

public abstract class Local {
    protected String nome;

    //metodo construtor
    public Local(String nome){
        this.nome = nome;
    }

    //getters

    abstract public void setNome(String nome);

    //setters
    
    abstract public String getNome();
}
