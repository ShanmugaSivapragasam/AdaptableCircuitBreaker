package com.shan.acb.contract;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class Item {

    Long id;
    String description;
    Long maxAvailable;
    Long currentAvailable;



}
