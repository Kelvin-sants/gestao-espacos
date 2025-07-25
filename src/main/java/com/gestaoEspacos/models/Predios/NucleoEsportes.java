package Predios;
import java.util.HashMap;
import java.util.Map;
import Locais.Sala;
import Usuario.Usuario;
import Locais.Quadra;
import Locais.Campo;

public class NucleoEsportes extends Local {
    private String descricao;
    private Map<String,Sala> salas;
    private Map<String,Quadra> quadras;
    private Map<String, Campo> campos;

    //metodo construtor
    public  NucleoEsportes(String nome, String descricao){
        super(nome);
        this.descricao = descricao;
        this.salas = new HashMap<>();
        this.quadras = new HashMap<>();
        this.campos = new HashMap<>();    
    }

    //setters

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }

    //getters

    @Override
    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Sala getSala(String nome){
        return salas.get(nome);
    }

    public Quadra getQuadra(String nome){
        return quadras.get(nome);
    }

    public Campo getCampo(String nome){
        return campos.get(nome);
    }

    //adicionar sala
    public boolean adicionarSala(String nome, Usuario u){
        if(u == null){
            return false;
        }
        if (salas.containsKey(nome)) {
            return false;
        }
        if(u.getStatusAdm()){
            Sala novaSala = new Sala(nome);
            salas.put(nome, novaSala);
            return true;
        }
        return false;
    }

    //adicionar quadra
    public boolean adicionarQuadra(String nome, Usuario u){
        if(u == null){
            return false;
        }
        if (quadras.containsKey(nome)) {
            return false;
        }
        if(u.getStatusAdm()){
            Quadra novaQuadra = new Quadra(nome);
            quadras.put(nome, novaQuadra);
            return true;
        }
        return false;
    }

    //adicionar campo
    public boolean adicionarCampo(String nome, Usuario u){
        if(u == null){
            return false;
        }
        if (campos.containsKey(nome)) {
            return false;
        }
        if(u.getStatusAdm()){
            Campo novoCampo = new Campo(nome);
            campos.put(nome, novoCampo);
            return true;
        }
        return false;
    }
}
