package Predios;
import java.util.HashMap;
import java.util.Map;
import Locais.Sala;
import Locais.Laboratorio;
import Locais.Auditorio;
import Locais.SalaReuniao;
import Usuario.Usuario;

public class Predio extends Local{
    private String descricao;
    private Map<String,Sala> salas;
    private Map<String,Laboratorio> laboratorios;
    private Map<String,Auditorio> auditorios;
    private Map<String,SalaReuniao> salasDeReuniao;   
    
    public Predio(String nome, String descricao){
        super(nome);
        this.descricao = descricao;
        this.salas = new HashMap<>();
        this.laboratorios = new HashMap<>();
        this.auditorios = new HashMap<>();
        this.salasDeReuniao = new HashMap<>();
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

    public Laboratorio getLaboratorio(String nome){
        return laboratorios.get(nome);
    }

    public Auditorio getAuditorio(String nome){
        return auditorios.get(nome);
    }

    public SalaReuniao getSalaReuniao(String nome){
        return salasDeReuniao.get(nome);
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

    //adicionar laboratorio
    public boolean adicionarLaboratorio(String nome, Usuario u){
        if(u == null){
            return false;
        }
        if (laboratorios.containsKey(nome)) {
            return false;
        }
        if(u.getStatusAdm()){
            Laboratorio novoLaboratorio = new Laboratorio(nome);
            laboratorios.put(nome, novoLaboratorio);
            return true;
        }
        return false;
    }

    //adicionar auditorio
    public boolean adicionarAuditorio(String nome, Usuario u){
        if(u == null){
            return false;
        }

        if (auditorios.containsKey(nome)) {
            return false;
        }
        if(u.getStatusAdm()){
            Auditorio novoAuditorio = new Auditorio(nome);
            auditorios.put(nome, novoAuditorio);
            return true;
        }
        return false;
    }

    //adicionar sala de reuniao
    public boolean adicionarSalaDeReuniao(String nome, Usuario u){
        if(u == null){
            return false;
        }
        if (salasDeReuniao.containsKey(nome)) {
            return false;
        }
        if(u.getStatusAdm()){
            SalaReuniao novaSalaReuniao = new SalaReuniao(nome);
            salasDeReuniao.put(nome, novaSalaReuniao);
            return true;
        }
        return false;
    }
}
