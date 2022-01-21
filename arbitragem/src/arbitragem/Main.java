package arbitragem;

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

        Var var01 =  new Var();
        var01.setName("Igor Beneveluto");
        var01.setCategory("VAR-FIFA");
        var01.setFederation("MG");
        var01.setOccupation("Referee");


        Match match01 = new Match();
        match01.setDate("21-01-2022");
        match01.setDescription("Man Football");
        match01.setTitle("Competition");
        match01.setTeamHome(vasco);
        match01.setTeamAway(flamengo);
        match01.setStadium("Maracana");

        Training training01= new Training();
        training01.setTitle("Homologation");
        training01.setDescription("Homologation FPF");
        training01.setDate("18-01-2022");
        training01.setWorkLoad(22);


        Happening round01 = new Happening();
        round01.setEventType("Match");
        round01.getSubjects().add(match01);

        Happening evento02 = new Happening();
        evento02.setEventType("Trainning");
        evento02.getSubjects().add(training01);
        evento02.getSubjects().add(match01);



        var01.addHappening(round01);
        System.out.println(var01);
        System.out.println("---------------");
        var01.develop();
        System.out.println(var01.calcTotalXp());
        System.out.println(var01.getMatchDone());




//
//        EventCalendar event02 = new Training();
//        event02.setTitle("TRAINING PROGRAM");


//
//        PitchReferee pitch01=new PitchReferee();
//        pitch01.setName("Jose Claudio");
//        pitch01.setPosition("MAIN REFEREE");
//
//        Supervisor super01 =  new Supervisor();
//        super01.setName("Alicio Pena Junior");
//        super01.setPosition("Director");
//
//
//        Team team01 = new Team();
//        team01.setName("Vasco da Gama");
//        team01.setLeague("First Division");
//        team01.setState("Rio de Janeiro");
//
//        Team team02=new Team();
//        team02.setName("Flamengo");
//        team02.setLeague("First Division");
//        team02.setState("Rio de Janeiro");
//
//
//        Match match01 = new Match();
//        match01.setDescription("Copa do Brasil");
//        match01.setTeamHome(team01);
//        match01.setTeamAway(team02);
//        match01.setStadium("Maracana");
//        match01.setDate("16-Janeiro-2022");
//        match01.setPlace("Rio de Janeiro");
//
//        Happening event01 = new Happening();
//
//
//        System.out.println(match01);
//
//
//
//
//        event02.setDescription("Homologation FPF");
//        event02.setPlace("Aguas de Lindoia");
//        event02.setDate("22-January-2022");
//        event02.setTime("16hs");
//        event02.setTitle("HOMOLOGATION");
//
//
//        var01.setPosition("AVAR");





//        Var jose =  new Var("Jose Claudio Rocha Filho","VAR-FIFA");
//        Var rodrigo =  new Var("Rodrigo Dalonso Ferreira","VAR-FIFA");
//        Var guarizo =  new Var("Rodrigo Guarizo Ferreira do Amaral","VAR-FIFA");
//        Var nunes =  new Var("Rodrigo Nunes de Sa","VAR-FIFA");
//        Var reway=  new Var("Wagner Reway","VAR-FIFA");

//        Supervisor adriano = new Supervisor("Adriano de Carvalho ","SUPERVISOR");
//        Supervisor afonso = new Supervisor("Afonso Vitor de Oliveira","SUPERVISOR");
//        Supervisor alicio = new Supervisor("Alicio Pena Junior","SUPERVISOR");
//        Supervisor almir = new Supervisor("Almir Alves de Mello","SUPERVISOR");
//        Supervisor anaPaula = new Supervisor("Ana Paula da Silva Oliveira","SUPERVISOR");
//        Supervisor anderson = new Supervisor("Anderson Carlos Gonçalves","SUPERVISOR");
//
//
//        PitchReferee selma = new PitchReferee("Selma Rodrigues Medeiros ","MAIN REFEREE");
//        PitchReferee marcelo = new PitchReferee("Marcelo de Lima Henrique ","ASSIST REFEREE");
//        PitchReferee leandro = new PitchReferee("Leandro Pedro Vuaden","ASSIST REFEREE");
//        PitchReferee andre = new PitchReferee("Andre Luiz de Freitas Castro","4TH REFEREE");
//        PitchReferee dewson = new PitchReferee("Dewson Fernando Freitas da Silva","MAIN REFEREE");
//        PitchReferee elmo = new PitchReferee("Elmo Alves Resende Cunha","ASSIST REFEREE");
//        PitchReferee heber = new PitchReferee("Heber Roberto Lopes","ASSIST REFEREE");
//        PitchReferee ricardo = new PitchReferee("Ricardo Marques Ribeiro","4TH REFEREE");
//
//
//        Teams vasco = new Teams("Vasco da Gama","Rio de Janeiro","First Division");
//        Teams americaMg = new Teams("America MG","Minas Gerais","First Division");
//        Teams athletico = new Teams("Athetico PR","Parana","First Division");
//        Teams atleticoGO = new Teams("Atletico GO","Goias","First Division");
//        Teams atleticoMG = new Teams("Atletico MG","Minas Gerais","First Division");
//        Teams avai = new Teams("Avai","Santa Catarina","First Division");
//        Teams botafogo = new Teams("Botafogo","Rio de Janeiro","First Division");
//        Teams ceara = new Teams("Ceara","Fortaleza","First Division");
//        Teams corinthians = new Teams("Corinthians","Sao Paulo","First Division");
//        Teams coritiba = new Teams("Coritiba","Parana","First Division");
//        Teams cuiaba = new Teams("Cuiaba","Cuiaba","First Division");
//        Teams flamengo = new Teams("Flamengo","Rio de Janeiro","First Division");
//        Teams fluminense = new Teams("Fluminense","Rio de Janeiro","First Division");
//        Teams fortaleza = new Teams("Fortaleza","Fortaleza","First Division");
//        Teams goias = new Teams("Goias","Goias","First Division");
//        Teams juventude = new Teams("Juventude","Rio Grande do Sul","First Division");
//        Teams internacional = new Teams("Internacional","Rio Grande do Sul","First Division");
//        Teams palmeiras = new Teams("Palmeiras","Sao Paulo","First Division");
//        Teams santos = new Teams("Santos","Sao Paulo","First Division");
//        Teams saoPaulo = new Teams("Sao Paulo","Sao Paulo","First Division");

//
//        TrainingProgram homologationFPF = new TrainingProgram("Homologation FPF","Homologation January","2022-01-12","12hs","Oscar inn");
//        TrainingProgram homologationFERJ = new TrainingProgram("Homologation FERJ","Homologation June","2022-06-21","08hs","Oscar inn");
//        TrainingProgram homologationCBF = new TrainingProgram("Homologation CBF","Homologation July","2022-07-08","16hs","Oscar inn");
//
//
//        Match flaXflu1 = new Match("FlaxFlu","Copa do Brasil","12-01-2022","22hs","Rio de Janeiro");
//        Match botafogoxsantos = new Match("BotafogoxSantos","Copa do Brasil","18-01-2022","22hs","Rio de Janeiro");
//        Match avaixpalmeiras = new Match("AvaixPalmeiras","Copa do Brasil","21-01-2022","22hs","Santa Catarina");
//        Match juventudexinter = new Match("JuventudexInter","Copa do Brasil","26-01-2022","22hs","Caxias do Sul");
//        Match athleticoxamerica = new Match("AthleticoxAmerica","Copa do Brasil","04-02-2022","22hs","Belo Horizonte");
//        Match saopauloxatleticomg = new Match("SaoPauloAtleticoMG","Copa do Brasil","12-02-2022","22hs","Sao Paulo");
//
//
//        flaXflu1.setStadium("Maracana");
//        flaXflu1.setTeamAway(fluminense);
//        flaXflu1.setTeamHome(flamengo);



    }
}
