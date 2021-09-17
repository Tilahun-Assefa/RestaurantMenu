package restaurant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {
    private String description;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastMenuUpdatedDate;

    public Menu(String description) {
        this.description = description;
    }

    public void addMenuItem(MenuItem newMenuItem){
        if(!this.menuItems.contains(newMenuItem)){
            menuItems.add(newMenuItem);
            lastMenuUpdatedDate = Calendar.getInstance().getTime();
        }else {
            System.out.println("The items is already added");
        }

    }
    public void removeMenuItem(MenuItem deleteMenuItem){
        menuItems.remove(deleteMenuItem);
        lastMenuUpdatedDate = Calendar.getInstance().getTime();

    }
    public boolean isMenuItemNew(MenuItem menuItem){
        return menuItem.isMenuItemNew();
    }

    public void printSingleMenuItem(MenuItem menuItem){
        System.out.println(menuItem.toString());
    }

    public void printAllMenuItems(){
        for (MenuItem item: menuItems){
            System.out.println(item.toString());
        }
    }
    @Override
    public String toString() {
        return description + " updated its menu on " + lastMenuUpdatedDate ;
    }

    public boolean compareMenuItems(MenuItem item1, MenuItem item2){
        return item1.equals(item2);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastMenuUpdatedDate() {
        return lastMenuUpdatedDate;
    }
    public void setLastMenuUpdatedDate(Date lastMenuUpdatedDate) {
        this.lastMenuUpdatedDate = lastMenuUpdatedDate;
    }


}
