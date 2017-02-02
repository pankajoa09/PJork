package io.muic.ooc.zork;

/**
 * Created by gigadot on 12-Jan-17.
 */
public class GameMap {

    private final static int MAX_LENGTH = 5;
    private final static int MAX_WIDTH = 5;

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
                System.out.println(i+j);
                subUrbs[i][j] = '*';

            }
        }
        return subUrbs;
    }


    char[][] SubUrbs = initalizeSubUrb();


}

