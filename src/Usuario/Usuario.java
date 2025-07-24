package Usuario;

public class Usuario{
    private String nome;
    private boolean isAdm;

    //metodo construtor
    public Usuario(String nome){
        this.nome = nome;
        this.isAdm = false;
    }

    //getters
    
    public String getNome(){
        return this.nome;
    }

    public boolean getStatusAdm(){
        return this.isAdm;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setStatusAdm(boolean status){
        this.isAdm = status;
    }
}