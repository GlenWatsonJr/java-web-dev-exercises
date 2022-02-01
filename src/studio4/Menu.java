package studio4;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private final ArrayList<MenuItem> items = new ArrayList<MenuItem>();
    private Date updateDate;

    Menu(){
        this.updateDate = new Date();
    }

    public ArrayList<MenuItem> getMenu(){
        return this.items;
    }

    public void addMenuItem(MenuItem item){
        this.items.add(item);
        this.updateDate = new Date();
    }

    public void removeMenuItem(MenuItem item){
        this.items.remove(item);
    }

    public Date getUpdateDate(){
        return updateDate;
    }




}
