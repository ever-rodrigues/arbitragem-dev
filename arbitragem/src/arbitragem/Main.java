package arbitragem;

public class Main {
    public static void main(String[] args) {

        Referee referee01 =  new Referee("Igor Junio Benevenuto de Oliveira","VAR-FIFA");
        Referee referee02 =  new Referee("Jose Claudio Rocha Filho","VAR-FIFA");
        Referee referee03 =  new Referee("Rodrigo Dalonso Ferreira","VAR-FIFA");
        Referee referee04 =  new Referee("Rodrigo Guarizo Ferreira do Amaral","VAR-FIFA");
        Referee referee05 =  new Referee("Rodrigo Nunes de Sa","VAR-FIFA");
        Referee referee06=  new Referee("Wagner Reway","VAR-FIFA");

        Supervisor supervisor01 = new Supervisor("Adriano de Carvalho ","SUPERVISOR");
        Supervisor supervisor02 = new Supervisor("Afonso Vitor de Oliveira","SUPERVISOR");
        Supervisor supervisor03 = new Supervisor("Alicio Pena Junior","SUPERVISOR");
        Supervisor supervisor04 = new Supervisor("Almir Alves de Mello","SUPERVISOR");
        Supervisor supervisor05 = new Supervisor("Ana Paula da Silva Oliveira","SUPERVISOR");
        Supervisor supervisor06 = new Supervisor("Anderson Carlos Gonçalves","SUPERVISOR");


        PitchReferee picthReferee01 = new PitchReferee("","MAIN REFEREE");
        PitchReferee picthReferee02 = new PitchReferee("","ASSIST REFEREE");
        PitchReferee picthReferee03 = new PitchReferee("","ASSIST REFEREE");
        PitchReferee picthReferee04 = new PitchReferee("","4TH REFEREE");
        PitchReferee picthReferee05 = new PitchReferee("","MAIN REFEREE");
        PitchReferee picthReferee06 = new PitchReferee("","ASSIST REFEREE");
        PitchReferee picthReferee07 = new PitchReferee("","ASSIST REFEREE");
        PitchReferee picthReferee08 = new PitchReferee("","4TH REFEREE");







        Match vascoxsaopaulo= new Match();
        vascoxsaopaulo.setAway("Vasco da Gama");
        vascoxsaopaulo.setHome("Sao Paulo");
        vascoxsaopaulo.setStadium("Sao Januario");

    }
}
