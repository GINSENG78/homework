package HomeworkGame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static HomeworkGame.Game.gameType.*;

public class Game {
    enum gameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeOfPlayersPerTeam(gameType game) {

        try {
            switch (game) {
                case SOCCER:
                    createFile(game);
                    writeToFile(game,"11");

                    break;
                case HOCKEY:
                    createFile(game);
                    writeToFile(game, "6");
                    break;
                case RUGBY:
                    createFile(game);
                    writeToFile(game,"15");
                    break;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



                public static void createFile(gameType fileName) {
                    File file = new File(String.valueOf(fileName));

                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                public static void writeToFile(gameType filename, String text) {
                    FileWriter fileWriter = null;
                    try {
                        fileWriter = new FileWriter(String.valueOf(filename));
                        fileWriter.write(text);
                        fileWriter.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }



