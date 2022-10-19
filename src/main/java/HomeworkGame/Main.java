package HomeworkGame;

import java.io.File;

public class Main {

    public static void main(String[] args) {
//        String file = "Games.txt";
//        NewFileGame createFile = new NewFileGame();
//        createFile.createFile(file);
//        createFile.writeToFile("Games", "SOCCER");

        Game game= new Game();
        game.writeOfPlayersPerTeam(Game.gameType.SOCCER);
        game.writeOfPlayersPerTeam(Game.gameType.HOCKEY);
        game.writeOfPlayersPerTeam(Game.gameType.RUGBY);
    }
}

