package Agenda;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<LocalDate, AgendaDia> dias;

    //metodo construtor
    public Agenda(){
        dias = new HashMap<>();
    }

    //tenta adicionar um compromisso a um determinado dia
    public boolean adicionarCompromisso(LocalDate data, Compromisso c){
        AgendaDia dia = dias.getOrDefault(data, new AgendaDia());
        boolean status = dia.adicionarCompromisso(c);
        dias.put(data, dia);
        return status;
    }

    //retorna a agenda de um dia especificado
    public AgendaDia getAgendaDia(LocalDate data){
        AgendaDia dia = dias.get(data);
        if(dia == null){
            dia = new AgendaDia();
            dias.put(data, dia);
        }
        return dia;
    }
}
