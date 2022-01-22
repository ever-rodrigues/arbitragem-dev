package arbitragem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//TEAMS
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

//REFERESS
        PitchReferee pitchAndre = new PitchReferee();
        pitchAndre.setName("Andre Luis");
        pitchAndre.setCategory("MASTER");
        pitchAndre.setFederation("GO");
        pitchAndre.setOccupation("Master Referee");


        PitchReferee refereePitchDewson = new PitchReferee();
        refereePitchDewson.setName("Dewson Fernando Freitas da Silva");
        refereePitchDewson.setCategory("MASTER");
        refereePitchDewson.setFederation("PA");
        refereePitchDewson.setOccupation("Assist Referee");

        PitchReferee refereePitchElmo = new PitchReferee();
        refereePitchElmo.setName("Elmo Alves Resende Cunha");
        refereePitchElmo.setCategory("MASTER");
        refereePitchElmo.setFederation("GO");
        refereePitchElmo.setOccupation("Assist Referee");

        PitchReferee refereePitchHeber = new PitchReferee();
        refereePitchHeber.setName("Heber Roberto Lopes");
        refereePitchHeber.setCategory("MASTER");
        refereePitchHeber.setFederation("SC");
        refereePitchHeber.setOccupation("4Th Referee");

        //VARS
        Var varIgorBeneveluto =  new Var();
        varIgorBeneveluto.setName("Igor Beneveluto");
        varIgorBeneveluto.setCategory("VAR-FIFA");
        varIgorBeneveluto.setFederation("MG");
        varIgorBeneveluto.setOccupation("VAR");

        Var varJoseClaudio =  new Var();
        varJoseClaudio.setName("Jose Claudio");
        varJoseClaudio.setCategory("VAR-FIFA");
        varJoseClaudio.setFederation("SP");
        varJoseClaudio.setOccupation("AVAR");

        Var varRodrigoDalonso =  new Var();
        varRodrigoDalonso.setName("Rodrigo Dalonso");
        varRodrigoDalonso.setCategory("VAR-FIFA");
        varRodrigoDalonso.setFederation("SC");
        varRodrigoDalonso.setOccupation("VAR");

        Var varGuarizo =  new Var();
        varGuarizo.setName("Rodrigo Guarizo");
        varGuarizo.setCategory("VAR-FIFA");
        varGuarizo.setFederation("SP");
        varGuarizo.setOccupation("VAR");


        Var varReway =  new Var();
        varReway.setName("Wagner Reway");
        varReway.setCategory("VAR-FIFA");
        varReway.setFederation("PB");
        varReway.setOccupation("AVAR");



        Supervisor superAdriano = new Supervisor();
        superAdriano.setName("Adriano de Carvalho");
        superAdriano.setCategory("Inspector");
        superAdriano.setFederation("TO");
        superAdriano.setOccupation("Supervisor");


        Supervisor superCorona = new Supervisor();
        superCorona.setName("Ednilson Corona");
        superCorona.setCategory("Inspector");
        superCorona.setFederation("SP");
        superCorona.setOccupation("Supervisor");


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


        Set<Var> varTeam01 = new HashSet<>();
        varTeam01.add(varRodrigoDalonso);
        varTeam01.add(varGuarizo);

        Set<Supervisor> superTeam01 = new LinkedHashSet<>();
        superTeam01.add(superAdriano);

        Set<PitchReferee> refereePitchTeam01=new HashSet<>();
        refereePitchTeam01.add(refereePitchHeber);
        refereePitchTeam01.add(refereePitchDewson);
        refereePitchTeam01.add(pitchAndre);
        refereePitchTeam01.add(refereePitchHeber);

        Set<PitchReferee> refereePitchTeam02=new HashSet<>();
        refereePitchTeam02.add(refereePitchHeber);
        refereePitchTeam02.add(refereePitchDewson);
        refereePitchTeam02.add(pitchAndre);
        refereePitchTeam02.add(refereePitchHeber);


        EventSchedule event01 = new EventSchedule();
        event01.setEventType("Match");
        event01.getSubjects().add(match01);
        event01.setEventTime(16);
        event01.setVarList(varTeam01);
        event01.setPitchRefereeList(refereePitchTeam01);
        event01.setSupervisorList(superTeam01);

//        System.out.println(event01);

        EventSchedule event02 = new EventSchedule();
        event02.setEventType("Match");
        event02.getSubjects().add(match02);

        EventSchedule event03 = new EventSchedule();
        event03.setEventType("Match");
        event03.getSubjects().add(match03);

        EventSchedule event04 = new EventSchedule();
        event04.setEventType("Match");
        event04.getSubjects().add(match04);



        EventSchedule eventoTraining01 = new EventSchedule();
        eventoTraining01.setEventType("training");
        eventoTraining01.getSubjects().add(training01);

        EventSchedule eventTraining02 = new EventSchedule();
        eventTraining02.setEventType("Training");
        eventTraining02.getSubjects().add(training02);

        EventSchedule eventTraining03 = new EventSchedule();
        eventTraining03.setEventType("Training");
        eventTraining03.getSubjects().add(training03);

        EventSchedule eventTraining04 = new EventSchedule();
        eventTraining04.setEventType("Training");
        eventTraining04.getSubjects().add(training04);




        varReway.addEventSchedule(event01);
        varReway.addEventSchedule(event02);
        varIgorBeneveluto.addEventSchedule(event02);
        varIgorBeneveluto.addEventSchedule(event04);
        varRodrigoDalonso.addEventSchedule(event02);
        varRodrigoDalonso.addEventSchedule(event04);
        varGuarizo.addEventSchedule(event01);
        varJoseClaudio.addEventSchedule(event02);


        varReway.addEventSchedule(eventTraining04);
        varReway.addEventSchedule(eventoTraining01);

        varIgorBeneveluto.addEventSchedule(eventoTraining01);
        varIgorBeneveluto.addEventSchedule(eventTraining02);

        varRodrigoDalonso.addEventSchedule(eventTraining04);
        varGuarizo.addEventSchedule(eventoTraining01);
        varGuarizo.addEventSchedule(eventTraining02);

        varJoseClaudio.addEventSchedule(eventoTraining01);
        varJoseClaudio.addEventSchedule(eventTraining04);

        varJoseClaudio.eventsToDo();
        varJoseClaudio.eventsDone();

        superAdriano.addHappening(event02);
        superAdriano.addHappening(event02);
        superAdriano.addHappening(event04);


        superCorona.addHappening(eventoTraining01);
        superCorona.addHappening(eventTraining02);
        superCorona.addHappening(eventTraining03);
        superCorona.addHappening(eventTraining04);

        superCorona.eventsToDo();
        superCorona.eventsDone();


        superAdriano.eventsToDo();
        superAdriano.eventsDone();





        System.out.println(event01);
        event02.setPitchRefereeList(refereePitchTeam02);
        System.out.println("---------------------");
        System.out.println(event02);





    }
}
