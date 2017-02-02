package io.muic.ooc.zork;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.javac.jvm.ByteCodes.ior;

/**
 * Created by pjoa09 on 2/1/17.
 */
public class Dialogue {

    private String House = "_______________ZZZ__Z____$ \n" +
            "______________Z____ZZ___$$$ \n" +
            "____________ZZ____ZZ___$$$$$ \n" +
            "____________Z___ZZ____$$___$$ \n" +
            "____________$$$$_____$$_____$$ \n" +
            "____________$__$____$$_______$$ \n" +
            "____________$__$___$$____#____$$ \n" +
            "__________$$$$$$$$$$____###___$$ \n" +
            "_________$ZZZZZZZ$$______#______$$ \n" +
            "________$ZZZZZZZ$$_______________$$ \n" +
            "_______$ZZZZZZZ$$_________________$$ \n" +
            "______$ZZZZZZZ$$__$$$$$$$_$$$$$$$__$$ \n" +
            "______$$_$|$_$$____$_$$$_$_$_$$$_$__$$ \n" +
            "______$$_$|$_$$____$$$$$$$_$$$$$$$___$$ \n" +
            "____$$$$$$$$$$$_____________________$$ \n" +
            "___$ZZZZZZZZZZ$$$$$$$$$$$$$$$$$$$$$$$$ \n" +
            "__$ZZZZZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZ$ \n" +
            "_$ZZZZZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZZZ$ \n" +
            "$ZZZZZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZZZZZ$ \n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \n" +
            "__$$_$__$__$___$$__$ZZZZ$___$$_$__$__$_$$ \n" +
            "__$$_$__$__$___$$__$_ZZ_$___$$_$__$__$_$$ \n" +
            "__$$ZZZZZZZZZZZ$$__$___#$___$$ZZZZZZZZZ$$ \n" +
            "__$$_#_#_#_#_#$$_ $_ZZ_$___$$#_#_#_#_$$ \n" +
            "__$$#_#_#_#_#_$$__$$$$$$___$$_#_#_#_#$$ \n" +
            "__$$$$$$$$$$$$$$##########$$$$$$$$$$$$$";

    public String getHouseDrawing() {
        return House;
    }

    public String helpMenu = "Help Menu\n" +
            "=========\n" +
            "Type \"Left or \"L\" to go left.\n" +
            "Type \"Right\" or \"R\" to go right.\n" +
            "Type \"Front\" or \"F\" to go front.\n" +
            "Type \"Back\" or \"B\" to go back.\n" +
            "Type \"Attack\" or \"A\" to attack.\n" +
            "Type \"Suicide\" or \"S\" to commit suicide.\n" +
            "Type \"Pick up\" or \"P\" to pick up the weapon.\n" +
            "Type \"Quit\" or \"Q\" to quit.";

    public String getHelpMenu() {
        return helpMenu;
    }

    public String getSuicide() {
        return suicide;
    }

    private String suicide = "It's 8:05, you're late for class.\n" +
            "\n" +
            "GAME OVER\n" +
            "---------";

    public static class introductionList extends ArrayList {

        static String line1 = "You wake up in your bed.";
        static String line2 = "The alarm failed to ring.";
        static String line3 = "You stand up and notice that the door is open.";
        static String line4 = "In the living room, you see your father laying dead in a pool of blood.";
        static String line5 = "Your mother hung by the noose of a rope to the ceiling.";
        static String line6 = "You find a note, written in ink : \"Life's a bitch. Get the best of her.\"";
        static String line7 = "You recollect that your father had been worried and your mother arguing with him about a loan shark, something about a meeting at a junction.";
        static String line8 = "Stricken with grief you venture out to find help and potentially avenge them.";
        static String line9 = "Type \"help\" for further instructions";



        public static ArrayList<String> getDialogueList() {
            ArrayList<String> dialogueList = new ArrayList<>();
            dialogueList.add(line1);
            dialogueList.add(line2);
            dialogueList.add(line3);
            dialogueList.add(line4);
            dialogueList.add(line5);
            dialogueList.add(line6);
            dialogueList.add(line7);
            dialogueList.add(line8);
            dialogueList.add(line9);
            return dialogueList;
        }
    }


}









