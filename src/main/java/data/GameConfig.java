package data;

import java.util.Arrays;
import java.util.Random;

public class GameConfig {
    private int releaseYear;

    private String gameName;
    private double price;
    private String[] characterNames;

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGameName() {
        return gameName;
    }

    public double getPrice() {
        return price;
    }

    public String[] getCharacterNames() {
        return characterNames;
    }

    @Override
    public String toString() {
        return "GameConfig{" +
                "gameName='" + gameName + '\'' +
                ", price=" + price +
                ", characterNames=" + Arrays.toString(characterNames) +
                '}';
    }
}
