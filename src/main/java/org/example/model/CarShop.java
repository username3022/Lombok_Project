package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CarShop extends Car{
    private int price;
    private String color;
    private boolean kidsSeat;


}
