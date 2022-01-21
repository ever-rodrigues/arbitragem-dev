package arbitragem;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Referee igot =  new Referee("Igor Junio Benevenuto de Oliveira","VAR-FIFA");
        Referee jose =  new Referee("Jose Claudio Rocha Filho","VAR-FIFA");
        Referee rodrigo =  new Referee("Rodrigo Dalonso Ferreira","VAR-FIFA");
        Referee guarizo =  new Referee("Rodrigo Guarizo Ferreira do Amaral","VAR-FIFA");
        Referee nunes =  new Referee("Rodrigo Nunes de Sa","VAR-FIFA");
        Referee reway=  new Referee("Wagner Reway","VAR-FIFA");

        Supervisor adriano = new Supervisor("Adriano de Carvalho ","SUPERVISOR");
        Supervisor afonso = new Supervisor("Afonso Vitor de Oliveira","SUPERVISOR");
        Supervisor alicio = new Supervisor("Alicio Pena Junior","SUPERVISOR");
        Supervisor almir = new Supervisor("Almir Alves de Mello","SUPERVISOR");
        Supervisor anaPaula = new Supervisor("Ana Paula da Silva Oliveira","SUPERVISOR");
        Supervisor anderson = new Supervisor("Anderson Carlos Gonçalves","SUPERVISOR");


        PitchReferee selma = new PitchReferee("Selma Rodrigues Medeiros ","MAIN REFEREE");
        PitchReferee marcelo = new PitchReferee("Marcelo de Lima Henrique ","ASSIST REFEREE");
        PitchReferee leandro = new PitchReferee("Leandro Pedro Vuaden","ASSIST REFEREE");
        PitchReferee andre = new PitchReferee("Andre Luiz de Freitas Castro","4TH REFEREE");
        PitchReferee dewson = new PitchReferee("Dewson Fernando Freitas da Silva","MAIN REFEREE");
        PitchReferee elmo = new PitchReferee("Elmo Alves Resende Cunha","ASSIST REFEREE");
        PitchReferee heber = new PitchReferee("Heber Roberto Lopes","ASSIST REFEREE");
        PitchReferee ricardo = new PitchReferee("Ricardo Marques Ribeiro","4TH REFEREE");


        Teams vasco = new Teams("Vasco da Gama","Rio de Janeiro","First Division");
        Teams americaMg = new Teams("America MG","Minas Gerais","First Division");
        Teams athletico = new Teams("Athetico PR","Parana","First Division");
        Teams atleticoGO = new Teams("Atletico GO","Goias","First Division");
        Teams atleticoMG = new Teams("Atletico MG","Minas Gerais","First Division");
        Teams avai = new Teams("Avai","Santa Catarina","First Division");
        Teams botafogo = new Teams("Botafogo","Rio de Janeiro","First Division");
        Teams ceara = new Teams("Ceara","Fortaleza","First Division");
        Teams corinthians = new Teams("Corinthians","Sao Paulo","First Division");
        Teams coritiba = new Teams("Coritiba","Parana","First Division");
        Teams cuiaba = new Teams("Cuiaba","Cuiaba","First Division");
        Teams flamengo = new Teams("Flamengo","Rio de Janeiro","First Division");
        Teams fluminense = new Teams("Fluminense","Rio de Janeiro","First Division");
        Teams fortaleza = new Teams("Fortaleza","Fortaleza","First Division");
        Teams goias = new Teams("Goias","Goias","First Division");
        Teams juventude = new Teams("Juventude","Rio Grande do Sul","First Division");
        Teams internacional = new Teams("Internacional","Rio Grande do Sul","First Division");
        Teams palmeiras = new Teams("Palmeiras","Sao Paulo","First Division");
        Teams santos = new Teams("Santos","Sao Paulo","First Division");
        Teams saoPaulo = new Teams("Sao Paulo","Sao Paulo","First Division");


        TrainingProgram homologationFPF = new TrainingProgram("Homologation FPF","Homologation January","2022-01-12","12hs","Oscar inn");
        TrainingProgram homologationFERJ = new TrainingProgram("Homologation FERJ","Homologation June","2022-06-21","08hs","Oscar inn");
        TrainingProgram homologationCBF = new TrainingProgram("Homologation CBF","Homologation July","2022-07-08","16hs","Oscar inn");





    }
}
