package io.muic.ooc.zork;

import java.util.Scanner;

/**
 * Created by gigadot on 12-Jan-17.
 */
public class ZorkGame {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        Dialogue dialogue = new Dialogue();
        System.out.println(dialogue.getHouse());
        System.out.println(dialogue.getLine1());
        while (!quit) {
            System.out.print(dialogue.getLine2());
            String name = scanner.nextLine();
            quit = name.equals("quit");
            if (!quit) {
                System.out.println("Zork: " + name);
            }
        }
    }
}
