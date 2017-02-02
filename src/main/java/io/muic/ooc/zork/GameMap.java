package io.muic.ooc.zork;

/**
 * Created by gigadot on 12-Jan-17.
 */
public class GameMap {

    private final static int MAX_LENGTH = 5;
    private final static int MAX_WIDTH = 5;

    private final static char PLAYER_SYMBOL = '*';
    private final static char EMPTY_AREA_SYMBOL = '.';

    public char getPlayerSymbol() {
        return PLAYER_SYMBOL;
    }

    public char getEmptyAreaSymbol() {
        return EMPTY_AREA_SYMBOL;
    }

    public int getMaxLength() {
        return MAX_LENGTH;
    }

    public int getMaxWidth() {
        return MAX_WIDTH;
    }

    public char[][] initalizeSubUrb() {
        char[][] subUrbs = new char[MAX_LENGTH][MAX_WIDTH];
        for (int i = 0; i < getMaxLength(); i++) {
            for (int j = 0; j < getMaxWidth();j++) {
                subUrbs[i][j] = EMPTY_AREA_SYMBOL;

            }
        }
        return subUrbs;
    }


    char[][] SubUrbs = initalizeSubUrb();


}

