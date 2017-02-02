package io.muic.ooc.zork;

import java.awt.event.ComponentAdapter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gigadot on 12-Jan-17.
 */
public class ZorkGame {
    public static void start() {

        Dialogue dialogue = new Dialogue();
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        Command command = new Command();
        ArrayList<String> introList = Dialogue.introductionList.getDialogueList();



        System.out.println(dialogue.getHouseDrawing());

        for (int ind = 0; ind < introList.size(); ind++) {
            System.out.println(introList.get(ind));
            scanner.nextLine();
        }
        while (!command.quit) {
            System.out.print("> ");
            String input = scanner.nextLine();


            command.left = parser(input,"left","l");
            command.right = parser(input, "right","r");
            command.front = parser(input, "front","f");
            command.back = parser(input, "back", "b");
            command.attack = parser(input, "attack", "a");
            command.suicide = parser(input, "suicide", "s");
            command.pickup = parser(input, "pick up", "p");
            command.quit = parser(input, "quit", "q");
            command.help = parser(input, "help", "h");

            player.setSuburbStartLocation();
            if (!command.quit) {

                if (command.help) {
                    System.out.print(dialogue.getHelpMenu());
                    command.help = false;
                }
                if (command.suicide){
                    player.commitSuicide();
                    command.quit = true;
                }

                if (command.left){
                    System.out.println(player.getLocation().get(0)+ " " + player.getLocation().get(1));
                    player.shiftLeftOne();
                    System.out.println(player.getLocation().get(0)+ " " + player.getLocation().get(1));
                }


            }
        }
    }


    public static boolean parser(String input,String variant1, String variant2) {
        return input.toLowerCase().equals(variant1) || input.toLowerCase().equals(variant2);
    }

}