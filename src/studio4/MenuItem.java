package studio4;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private String itemCategory;
    private boolean isNew = true;

    MenuItem(String name, String desc, Double price, String category){
        this.itemName = name;
        this.itemDesc = desc;
        this.itemPrice = price;
        this.itemCategory = category;
    }

    public String getName(){
        return this.itemName;
    }

    public String getDesc(){
        return this.itemDesc;
    }

    public void setDesc(String desc){
        this.itemDesc = desc;
    }

    public String getCategory(){
        return this.itemCategory;
    }

    public void setCategory(String category){
        this.itemCategory = category;
    }

    public Double getPrice(){
        return this.itemPrice;
    }

    public void setPrice(Double price){
        this.itemPrice = price;
    }

    public boolean getNew(){
        return this.isNew;
    }

    public void setNew(boolean isNew){
        this.isNew = isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return itemName.equals(menuItem.itemName) && itemDesc.equals(menuItem.itemDesc) && itemPrice.equals(menuItem.itemPrice) && itemCategory.equals(menuItem.itemCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemDesc, itemPrice, itemCategory);
    }
}
