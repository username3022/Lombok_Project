package org.example.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Car  {
    private String brand;
    private String model;
    private String engineVolume;

}


