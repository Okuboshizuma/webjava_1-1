package jp.co.systena.tigerscave.shoppingcart.application.model;

public class Item {

 public int itemId;
 public String name;
 public int price;

  Item(int itemid, String name, int price){
    this.itemId =itemid;
    this.name = name;
    this.price = price;
  }


}
