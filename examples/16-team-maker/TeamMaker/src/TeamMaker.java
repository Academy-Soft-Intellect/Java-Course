import java.util.ArrayList;
import java.util.Random;


public class TeamMaker {
	
    public static void main(String[] arguments)
    {
        Settings settings = new Settings();
        ArrayList<String> playersList = new ArrayList<String>();
        
//        playersList.add("Ivan Ivanov");//1
//        playersList.add("Peter Petrov");//2
//        playersList.add("Hristo Hristov");//3
//        playersList.add("Ivana Ivanova");//4
//        playersList.add("Petia Petrova");//5
//        playersList.add("Hristina Hristova");//6
//        playersList.add("Stefan Stefanov");//7
//        playersList.add("Atanas Atanasov");//8
//        playersList.add("Radoslav Radoslavov");//9
//        playersList.add("Kristian Kristianov");//10
//        playersList.add("Maria Marinova");//11
  
        
        playersList.add("Albena Kyoseva");
        playersList.add("Danail Zlatanov");
        //playersList.add("Nadezhda.Velkova");
        playersList.add("Paulina Takova");
        playersList.add("Ralitsa Vetova");
        //playersList.add("Spasimir Ilchev");
        playersList.add("Veronika Asenova");
        playersList.add("Vladislav Tsvetanov");

        
        settings.setPlayersList(playersList);
        settings.setNumberOfTeams(2);
        
        Random rand  = new Random();
        ArrayList<ArrayList<String>> teams = new ArrayList<ArrayList<String>>();
        int originalPlayersCount = settings.getPlayersList().size();

        for (int i = 0; i < settings.getNumberOfTeams() - 1; i++)
        {
            teams.add(new ArrayList<String>());
        }

        Information info = calculatePlayersPerTeam(originalPlayersCount, settings.getNumberOfTeams());

        while (settings.getPlayersList().size() != info.getResidue())
        {
        	int playerIdx = rand.nextInt(settings.getPlayersList().size());
            int teamIdx = rand.nextInt(teams.size());

            if (teams.get(teamIdx).size() == info.getPlayersPerTeam())
            {
                continue;
            }

            teams.get(teamIdx).add(settings.getPlayersList().get(playerIdx));
            settings.getPlayersList().remove(playerIdx);
        }

        teams.add(settings.getPlayersList());
        printTeams(teams);
    }
	
    private static Information calculatePlayersPerTeam(int originalPlayersCount, int numberOfTeams)
    {
    	int residue = 0;
    	Information info = new Information();
        int playersPerTeam = originalPlayersCount/numberOfTeams;

        while ((originalPlayersCount - ((numberOfTeams - 1) * playersPerTeam) - playersPerTeam) > 1)
        {
            playersPerTeam++;
        }

        residue = originalPlayersCount - (numberOfTeams - 1) * playersPerTeam;

        while (playersPerTeam - residue > 1)
        {
            residue++;
        }
        info.setResidue(residue);
        info.setPlayersPerTeam(playersPerTeam);
        return info;
    }
	
    public static void printTeams(ArrayList<ArrayList<String>> teams)
    {
        for (int i = 0; i < teams.size(); i++)
        {
            System.out.println("Team: "+(i + 1));
            for (int j = 0; j < teams.get(i).size(); j++)
            {
            	System.out.println("\t" + teams.get(i).get(j));
            }
        }
    }
}
