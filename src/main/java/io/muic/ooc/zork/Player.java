package io.muic.ooc.zork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gigadot on 12-Jan-17.
 */
public class Player {

    private Dialogue dialogue = new Dialogue();
    private GameMap gamemap = new GameMap();
    char[][] subUrbs = gamemap.initalizeSubUrb();

    private static int health = 100;

    public static int getHealth() {
        return health;
    }

    public void commitSuicide(){
        health = 0;
        System.out.println(dialogue.getSuicide());
    }


    public void setSuburbStartLocation(){
        subUrbs[1][1] = 'P';
    }

    public Map<Character, Integer> getLocation(){
        Map<Character,Integer>  coordinates= new HashMap<Character,Integer>();
        for (int i=0; i < gamemap.getMaxWidth();i++){
            for (int j=0; j < gamemap.getMaxLength();j++){
                if (subUrbs[i][j] == 'P'){
                    coordinates.put('i',i);
                    coordinates.put('j',j);

                }
            }
        }
        return coordinates;
    }

    public void displayMap() {
        for (int i = 0; i < gamemap.getMaxWidth(); i++) {
            for (int j = 0; j < gamemap.getMaxLength(); j++) {
                System.out.print(subUrbs[i][j]);
            }
            System.out.println();
        }
    }

    public void shiftLeftOne(){
        try {
            System.out.println("-------------");
            System.out.println(getLocation().keySet());
            System.out.println(getLocation().values());
            System.out.println("-------------");

            subUrbs[getLocation().get('i')][getLocation().get('j')] = '*';
            subUrbs[getLocation().get('i')+1][getLocation().get('j')] = 'P';
            displayMap();
        }
        catch (IndexOutOfBoundsException iobe){
            displayMap();
            iobe.printStackTrace();
        }


    }

    public void shiftRightOne(){

    }

    public void shiftDownOne(){

    }

    public void shiftUpOne(){

    }




    private static ArrayList<String> Inventory = new ArrayList<>(); // gonna make this into item later

    public static ArrayList<String> getInventory() {
        return Inventory;
    }

    public static void addItemToInventory(String Item){
        Inventory.add(Item);
    }

    public static void removeItemFromInventory(String Item){
        int indexOfItem =Inventory.indexOf(Item);
        Inventory.remove(indexOfItem);
    }

    private static boolean checkIfInventoryIsEmpty(){
        return Inventory.isEmpty();
    }

    public static void displayInventory(){
        boolean inventoryIsEmpty = checkIfInventoryIsEmpty();
        if (inventoryIsEmpty){
            System.out.println("You have nothing in your inventory.");
        }
        else{
            for (int i = 0; i <= Inventory.size(); i++){
                System.out.println(Inventory.get(i));
            }
        }

    }
}
