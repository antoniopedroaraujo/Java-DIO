package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data,String nome,String atracao){
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data,new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();
        //eventosMap.get();
        /*
        * Esses métodos pegam os keys e values, mas não mantém a relacao entre ambos
        */

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate,Evento> entry:eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+proximoEvento+" acontecerá em "+proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2020,Month.JULY,15),"Evento 1","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2020,7,7),"Evento 2","Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY,9),"Evento 3","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2030, Month.JULY,12),"Evento 4","Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2040, Month.JULY,12),"Evento 5","Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2050, Month.JULY,12),"Evento 6","Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
