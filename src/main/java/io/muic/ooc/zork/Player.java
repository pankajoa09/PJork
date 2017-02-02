package io.muic.ooc.zork;

import java.util.ArrayList;

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

    public ArrayList<Integer> getLocation(){
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        for (int i=0; i < gamemap.getMaxWidth();i++){
            for (int j=0; j < gamemap.getMaxLength();j++){
                if (subUrbs[i][j] == 'P'){

                    coordinates.add(i);
                    coordinates.add(j);

                }
            }
        }
        return coordinates;
    }


    public void shiftLeftOne(){
        try {
            subUrbs[getLocation().get(0)][getLocation().get(1)] = 'X';
            subUrbs[getLocation().get(0) + 1][getLocation().get(1)] = 'P';
        }
        catch (IndexOutOfBoundsException iobe){
            System.out.println()
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
