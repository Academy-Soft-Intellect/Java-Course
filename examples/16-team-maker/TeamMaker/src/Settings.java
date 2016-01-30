import java.util.ArrayList;

public class Settings
{
	private ArrayList<String> playersList;

    private int numberOfTeams;

    public ArrayList<String> getPlayersList() {
		return playersList;
	}

	public void setPlayersList(ArrayList<String> _playersList) {
		this.playersList = _playersList;
	}

	public int getNumberOfTeams() {
		return numberOfTeams;
	}

	public void setNumberOfTeams(int _numberOfTeams) {
		this.numberOfTeams = _numberOfTeams;
	}
}