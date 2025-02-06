package ng.com.nokt.demo_Jethro.service;

import ng.com.nokt.demo_Jethro.entities.Item;

import java.util.List;

public interface ItemService {
    Item createItem(Item item);
    Item getItemById(Long id);
    List<Item> getAllItems();
    void deleteItem(Long id);
}
