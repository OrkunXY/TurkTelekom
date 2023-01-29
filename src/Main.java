public class Main {
    public static void main(String[] args)
    {
    Team team1=new Team("Turk Telekom");
        System.out.println(team1.getTakimIsmi());
        for (Oyuncu item:team1.getOyuncuList()){
            System.out.println(item);
        }

    }


}