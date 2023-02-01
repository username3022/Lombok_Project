package org.example.model;


import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CarShop {
    private int price;
    private String color;
    private boolean kidsSeat;


}
