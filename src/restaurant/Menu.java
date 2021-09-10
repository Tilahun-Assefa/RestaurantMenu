package restaurant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String description;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastMenuUpdatedDate;

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
