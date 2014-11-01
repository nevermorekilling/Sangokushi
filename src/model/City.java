/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.GameParameters;
import controller.Neighbour;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.buildings.Building;

/**
 *
 * @author RuN
 * 
 * Description: This class is a model for City. 
 *                      Each City has:
 *                       - 1 to 8 neighboring cities.
 *                       - A list of Characters;
 *                       - A number of Population
 *                       - A number of Soldiers
 *                       - It's own food and gold income.
 */
public class City
{
    private String cityName;
    
    private final List<Character> characterList;        // belongs to play and city
    private final List<Character> undiscoveredList;     // undiscovered character
    private final Rectangle rectangle;
    private final int[] neighbours;
    private final Neighbour[] newNeighbours;
    private final Building[] slots;
    private final int[] equipments;                          // refer to game parameters.
    protected int soldierIncome;
    private boolean frontline;
    private int goldIncome;
    private int foodIncome;
    private int population;
    private int soldiers;
    public int x, y;                                    // city location on GamePanel, x-coordinate and y-coordinate
    
    public City(String cityName){
        equipments = new int[4];
        neighbours = new int[8];
        newNeighbours = new Neighbour[8];
        slots = new Building[8];
        
        rectangle = new Rectangle(0, 0, 25, 25);
        characterList = new ArrayList<>(10);
        undiscoveredList = new ArrayList<>(10);
        
        this.cityName = cityName;
        soldiers = 15000;
        population = 10;

        initArrays();
    }
    
    private void initArrays(){
        Arrays.fill(equipments, 0);
        Arrays.fill(neighbours, 0);
        Arrays.fill(equipments, 0);
        Arrays.fill(slots, null);
    }
    
    public void updateIncomes(Building building) {
        goldIncome = goldIncome + building.getGoldIncome();
        foodIncome = foodIncome + building.getFoodIncome();
        setSoldierIncome(getSoldierIncome() + building.getSoldierIncome());
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public int getSoldiers(){
        return soldiers;
    }

    public void setSoldiers(int soldiers){
        this.soldiers = soldiers;
    }

    public int getGoldIncome(){
        return goldIncome;
    }

    public void setGoldIncome(int goldIncome){
        this.goldIncome = goldIncome;
    }

    public int getFoodIncome(){
        return foodIncome;
    }

    public void setFoodIncome(int foodIncome){
        this.foodIncome = foodIncome;
    }
    
    public List<Character> getCharacterList(){
        return characterList;
    }
    
    public List<Character> getUndiscoveredList(){
        return undiscoveredList;
    }
    
    public int getCharNumber(){
        return characterList.size();
    }
    
    public Character get(int index){
        return characterList.get(index);
    }
    
    public Character get(String name){
        for (Character tempChar : characterList) {
            if (tempChar.getName().equals(name)) {
                return tempChar;
            }
        }
        return null;
    }
    
    public int getNeighbour(int index){
        return neighbours[index - 1];
    }
    
    public void setNewNeighbours(Neighbour n, Neighbour s, Neighbour w, Neighbour e, Neighbour nw, Neighbour ne, Neighbour sw, Neighbour se) {
        newNeighbours[0] = n;
        newNeighbours[1] = s;
        newNeighbours[2] = w;
        newNeighbours[3] = e;
        newNeighbours[4] = nw;
        newNeighbours[5] = ne;
        newNeighbours[6] = sw;
        newNeighbours[7] = se;
    }
    
    public void setNeighbours(int north, int south, int west, int east, int northWest, int northEast, int southWest, int southEast) {
        setNeighbours(north, south, west, east);
        neighbours[4] = northWest;
        neighbours[5] = northEast;
        neighbours[6] = southWest;
        neighbours[7] = southEast;
    }
    
    public void setNeighbours(int north, int south, int west, int east) {
        neighbours[0] = north;
        neighbours[1] = south;
        neighbours[2] = west;
        neighbours[3] = east;
        neighbours[4] = GameParameters.CITY_EMPTY;
        neighbours[5] = GameParameters.CITY_EMPTY;
        neighbours[6] = GameParameters.CITY_EMPTY;
        neighbours[7] = GameParameters.CITY_EMPTY;
    }
    
    public void updateUnits(int unitType, int number){
        equipments[unitType - 1] = number;     //adjust for array index
    }
    
    public int getUnits(int unitType){
        return equipments[unitType - 1];         //adjust for array index
    }

    public boolean isFrontline(){
        return frontline;
    }

    public void setFrontline(boolean frontline){
        this.frontline = frontline;
    }
    
    /**
     * Add a character to this city
     * @param inChar a Character to be added
     */
    public void add(Character inChar){
        characterList.add(inChar);
    }
    
    // Add an Undiscovered character to this city
    public void addU(Character inChar){
        undiscoveredList.add(inChar);
    }
    
    public void setMapCoordinate(int x, int y){
        rectangle.setLocation(x, y);
        this.x = x;
        this.y = y;
    }
    
    public Rectangle getRect(){
        return rectangle;
    }
    
    public Building[] getSlots() {
        return slots;
    }
    
    public Building getSlot(int index) {
        return slots[index];
    }
    
    public void setSlotData (int index, Building data) {
        slots[index] = data;
    }
    
    public void setSlotData(Building[] slots) {
        System.arraycopy(slots, 0, this.slots, 0, slots.length);
    }

    public int getSoldierIncome() {
        return soldierIncome;
    }

    public void setSoldierIncome(int soldierIncome) {
        this.soldierIncome = soldierIncome;
    }
    
    public City[] getNeighbours() {
        City[] neighbourList = new City[8];
        Database db = Database.getInstance();
        
        for (int i = 0; i < neighbours.length; i++) {
            if (neighbours[i] == GameParameters.CITY_EMPTY) {
                neighbourList[i] = null;
            } else {
                neighbourList[i] = db.getCity(neighbours[i]);
            }
        }
        
        return neighbourList;
    }
    
    public Force getOwner() {
        Database db = Database.getInstance();
        
        for (Force force: db.getForceList()){
            if (force.getCityList().contains(this)) {
                return force;
            }
        }
        return null;
    }
}
