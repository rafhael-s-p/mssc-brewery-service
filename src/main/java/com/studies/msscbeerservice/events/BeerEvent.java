package com.studies.msscbeerservice.events;

import com.studies.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 1056127389124106352L;

    private final BeerDto beerDto;

}
