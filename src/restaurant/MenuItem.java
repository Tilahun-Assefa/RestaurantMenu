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
    public MenuItem(int menuItemID, String description, double price, String category, boolean isNew) {
        this.menuItemID = menuItemID;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isMenuItemNew = isNew;
    }

    public MenuItem(int menuItemID, String description, double price) {
        this(menuItemID, description, price, "main", true);
    }

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

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemID=" + menuItemID +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", menuNewStatus=" + isMenuItemNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return menuItemID == menuItem.menuItemID && description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItemID, description, category);
    }
}
