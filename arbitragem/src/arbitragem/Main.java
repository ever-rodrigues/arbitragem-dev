package arbitragem;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Team vasco = new Team("Vasco da Gama","Rio de Janeiro","First Division");
        Team americaMg = new Team("America MG","Minas Gerais","First Division");
        Team athletico = new Team("Athetico PR","Parana","First Division");
        Team atleticoGO = new Team("Atletico GO","Goias","First Division");
        Team atleticoMG = new Team("Atletico MG","Minas Gerais","First Division");
        Team avai = new Team("Avai","Santa Catarina","First Division");
        Team botafogo = new Team("Botafogo","Rio de Janeiro","First Division");
        Team ceara = new Team("Ceara","Fortaleza","First Division");
        Team corinthians = new Team("Corinthians","Sao Paulo","First Division");
        Team coritiba = new Team("Coritiba","Parana","First Division");
        Team cuiaba = new Team("Cuiaba","Cuiaba","First Division");
        Team flamengo = new Team("Flamengo","Rio de Janeiro","First Division");
        Team fluminense = new Team("Fluminense","Rio de Janeiro","First Division");
        Team fortaleza = new Team("Fortaleza","Fortaleza","First Division");
        Team goias = new Team("Goias","Goias","First Division");
        Team juventude = new Team("Juventude","Rio Grande do Sul","First Division");
        Team internacional = new Team("Internacional","Rio Grande do Sul","First Division");
        Team palmeiras = new Team("Palmeiras","Sao Paulo","First Division");
        Team santos = new Team("Santos","Sao Paulo","First Division");
        Team saoPaulo = new Team("Sao Paulo","Sao Paulo","First Division");


        //VARS
        Var igorbeneveluto =  new Var();
        igorbeneveluto.setName("Igor Beneveluto");
        igorbeneveluto.setCategory("VAR-FIFA");
        igorbeneveluto.setFederation("MG");
        igorbeneveluto.setOccupation("VAR");

        Var joseClaudio =  new Var();
        joseClaudio.setName("Jose Claudio");
        joseClaudio.setCategory("VAR-FIFA");
        joseClaudio.setFederation("SP");
        joseClaudio.setOccupation("AVAR");

        Var rodrigoDalonso =  new Var();
        rodrigoDalonso.setName("Rodrigo Dalonso");
        rodrigoDalonso.setCategory("VAR-FIFA");
        rodrigoDalonso.setFederation("SC");
        rodrigoDalonso.setOccupation("VAR");

        Var gurarizo =  new Var();
        gurarizo.setName("Rodrigo Guarizo");
        gurarizo.setCategory("VAR-FIFA");
        gurarizo.setFederation("SP");
        gurarizo.setOccupation("VAR");


        Var reway =  new Var();
        reway.setName("Wagner Reway");
        reway.setCategory("VAR-FIFA");
        reway.setFederation("PB");
        reway.setOccupation("VAR");



        Supervisor adriano = new Supervisor();
        adriano.setName("Adriano de Carvalho");
        adriano.setCategory("Inspector");
        adriano.setFederation("TO");
        adriano.setOccupation("Supervisor");


        Supervisor corona = new Supervisor();
        corona.setName("Ednilson Corona");
        corona.setCategory("Inspector");
        corona.setFederation("SP");
        corona.setOccupation("Supervisor");


        Match match01 = new Match();
        match01.setDate("21-01-2022");
        match01.setDescription("Man Football");
        match01.setTitle("Competition");
        match01.setTeamHome(vasco);
        match01.setTeamAway(flamengo);
        match01.setStadium("Maracana");

        Match match02 = new Match();
        match02.setDate("21-01-2022");
        match02.setDescription("Man Football");
        match02.setTitle("Competition");
        match02.setTeamHome(juventude);
        match02.setTeamAway(americaMg);
        match02.setStadium("Alfredo Jaconi");

        Match match03 = new Match();
        match03.setDate("21-01-2022");
        match03.setDescription("Man Football");
        match03.setTitle("Competition");
        match03.setTeamHome(corinthians);
        match03.setTeamAway(ceara);
        match03.setStadium("Arena Corinthians");

        Match match04 = new Match();
        match04.setDate("21-01-2022");
        match04.setDescription("Man Football");
        match04.setTitle("Competition");
        match04.setTeamHome(atleticoGO);
        match04.setTeamAway(coritiba);
        match04.setStadium("Arena Goias");

        Training training01 = new Training();
        training01.setTitle("Homologation");
        training01.setDescription("Homologation FERJ");
        training01.setDate("15-02-2022");
        training01.setWorkLoad(48);

        Training training02 = new Training();
        training02.setTitle("Homologation");
        training02.setDescription("Homologation CBF");
        training02.setDate("22-12-2022");
        training02.setWorkLoad(96);

        Training training03 = new Training();
        training03.setTitle("Homologation");
        training03.setDescription("Homologation CBF");
        training03.setDate("12-01-2023");
        training03.setWorkLoad(124);

        Training training04 = new Training();
        training04.setTitle("Homologation");
        training04.setDescription("Homologation FERJ");
        training04.setDate("27-03-2023");
        training04.setWorkLoad(146);


        Happening job01 = new Happening();
        job01.setEventType("Match");
        job01.getSubjects().add(match01);

        Happening job02 = new Happening();
        job02.setEventType("Match");
        job02.getSubjects().add(match02);

        Happening job03 = new Happening();
        job03.setEventType("Match");
        job03.getSubjects().add(match03);

        Happening job04 = new Happening();
        job04.setEventType("Match");
        job04.getSubjects().add(match04);



        Happening tr01 = new Happening();
        tr01.setEventType("training");
        tr01.getSubjects().add(training01);

        Happening tr02 = new Happening();
        tr02.setEventType("Training");
        tr02.getSubjects().add(training02);

        Happening tr03 = new Happening();
        tr03.setEventType("Training");
        tr03.getSubjects().add(training03);

        Happening tr04 = new Happening();
        tr04.setEventType("Training");
        tr04.getSubjects().add(training04);




        reway.addHappening(job01);
        reway.addHappening(job02);
        igorbeneveluto.addHappening(job03);
        igorbeneveluto.addHappening(job04);
        rodrigoDalonso.addHappening(job02);
        rodrigoDalonso.addHappening(job04);
        gurarizo.addHappening(job01);
        joseClaudio.addHappening(job03);


        reway.addHappening(tr04);
        reway.addHappening(tr01);

        igorbeneveluto.addHappening(tr01);
        igorbeneveluto.addHappening(tr02);

        rodrigoDalonso.addHappening(tr04);
        gurarizo.addHappening(tr01);
        gurarizo.addHappening(tr02);

        joseClaudio.addHappening(tr01);
        joseClaudio.addHappening(tr04);

        joseClaudio.eventsToDo();
        joseClaudio.eventsDone();

        adriano.addHappening(job01);
        adriano.addHappening(job02);
        adriano.addHappening(job03);
        adriano.addHappening(job04);


        corona.addHappening(tr01);
        corona.addHappening(tr02);
        corona.addHappening(tr03);
        corona.addHappening(tr04);

        corona.eventsToDo();
        corona.eventsDone();


        adriano.eventsToDo();
        adriano.eventsDone();


        Set<Var> varSet = new HashSet<>();
        varSet.add(rodrigoDalonso);
        varSet.add(gurarizo);
        varSet.add(reway);
        varSet.add(igorbeneveluto);
        varSet.add(joseClaudio);

        for (Var var:varSet
             ) {
            System.out.println(var);
        }
        Set<Supervisor> superSet = new HashSet<>();
        superSet.add(adriano);
        superSet.add(corona);

        System.out.println("-------------------");
        job01.setVarList(varSet);
        job01.setSupervisorList(superSet);
        for (Supervisor supervisor:superSet
             ) {
            System.out.println(supervisor);
        }
        System.out.println(job01);





    }
}
