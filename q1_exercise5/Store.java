package q1_exercise5;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
        this.name = name;
        this.itemList = new ArrayList<>();
        storeList.add(this);
  }
  
  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        if(index < itemList.size()){
            earnings += itemList.get(index).getCost();
            System.out.println(itemList.get(index).getName() + " has been sold for " + itemList.get(index).getCost());
            System.out.println("---------");
            itemList.remove(index);
        }else{
            System.out.println("There are only " + itemList.size() + " items in " + getName());
            System.out.println("---------");
        }
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }  
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
        boolean found = false;
        int index = 0;
        for(Item i : itemList){
            if(i.getName().equalsIgnoreCase(name)){
                found = true;
                index = itemList.indexOf(i);
                break;
            }
        }
        
        if(found){
            earnings += itemList.get(index).getCost();
            System.out.println(itemList.get(index).getName() + " has been sold for " + itemList.get(index).getCost());
            System.out.println("---------");
            itemList.remove(index);
        }else{
            System.out.println("Sorry, this item is not in " + getName());
            System.out.println("---------");
        }
        
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
        if(itemList.contains(i)){
            earnings += i.getCost();
            System.out.println(i.getName() + " has been sold for " + i.getCost());
            System.out.println("---------");
            itemList.remove(i);
        }else{
            System.out.println("Sorry, this item is not in " + getName());
            System.out.println("---------");
        }
    
    
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
        itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
        System.out.println("Items in " + getName() + " with type " + type + ":");
        for(Item i : itemList){
            if(i.getType().equalsIgnoreCase(type)){
                System.out.println(i.getName());
            }
        }
        System.out.println("---------");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
        System.out.println("Items in " + getName() + " with cost lower than or equal to " + maxCost + ":");
        for(Item i : itemList){
            if(i.getCost() <= maxCost){
                System.out.println(i.getName());
            }
        }
        System.out.println("---------");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
        System.out.println("Items in " + getName() + " with cost higher than or equal to " + minCost + ":");
        for(Item i : itemList){
            if(i.getCost() >= minCost){
                System.out.println(i.getName());
            }
        }
        System.out.println("---------");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
        for(Store s : storeList){
            System.out.println("Store Name: " + s.getName());
            System.out.println("Store Earnings: " + s.getEarnings());
            System.out.println("---------");
        }
  }
}
