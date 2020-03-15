package com.shan.acb.controller;


import com.shan.acb.contract.Item;
import com.shan.acb.contract.ItemList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/inventory")
public class InventoryController {

    @GetMapping("/items")
    public ResponseEntity<ItemList> etAvailableItems(){

        ItemList itemList = new ItemList();
        Item item1 = new Item(1L, "one", 100L, 3L);
        Item item2 = new Item(2L, "two", 100L, 5L);
        Item item3 = new Item(3L, "three", 100L, 4L);
        itemList.getItems().add(item1);
        itemList.getItems().add(item2);
        itemList.getItems().add(item3);

        return  new ResponseEntity<>(itemList, HttpStatus.OK);

    }
}
