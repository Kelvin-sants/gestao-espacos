package Agenda;
import java.util.ArrayList;
import java.util.List;

public class AgendaDia {
    private List<Compromisso> compromissosDia;

    //metodo construtor
    public AgendaDia(){
        compromissosDia = new ArrayList<>();
    }


    public boolean adicionarCompromisso(Compromisso novoCompromisso){
        for(Compromisso atual: compromissosDia){
            if(novoCompromisso.conflita(atual)){
                return false;
            }
        }
        compromissosDia.add(novoCompromisso);
        return true;
    }

    public List<Compromisso> getCompromissos(){
        return this.compromissosDia;
    }

    public boolean removerCompromisso(Compromisso compromisso){
        return compromissosDia.remove(compromisso);
    }  
}