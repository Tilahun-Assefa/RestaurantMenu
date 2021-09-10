package restaurant;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private int menuItemID;
    private String description;
    private double price;
    private String category;
    private boolean isMenuItemNew;

    public int getMenuItemID() {
        return menuItemID;
    }
    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isMenuItemNew() {
        return isMenuItemNew;
    }
    public void setMenuItemNew(boolean menuItemNew) {
        isMenuItemNew = menuItemNew;
    }
}
