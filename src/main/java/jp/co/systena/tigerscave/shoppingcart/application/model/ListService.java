package jp.co.systena.tigerscave.shoppingcart.application.model;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class ListService {

  //Item(商品番号, 商品名, 価格)
  Item item1 = new Item(1, "イス", 100);
  Item item2 = new Item(2, "机", 200);
  Item item3 = new Item(3, "ソファ", 300);

public ArrayList<Item> getItemList() {
  ArrayList<Item> itemList = new ArrayList<Item>();
  itemList.add(item1);
  itemList.add(item2);
  itemList.add(item3);
  return itemList;
}
}
