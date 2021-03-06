package com.studies.brewery.model.events;

import com.studies.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 1056127389124106352L;

    private BeerDto beerDto;

}
