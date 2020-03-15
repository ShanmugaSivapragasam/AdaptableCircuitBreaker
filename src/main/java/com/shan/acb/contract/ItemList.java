package com.shan.acb.contract;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class ItemList {

    List<Item> items;

    public ItemList(){
        items = new ArrayList<>();
    }


}
