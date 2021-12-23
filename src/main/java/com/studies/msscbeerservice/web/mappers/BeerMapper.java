package com.studies.msscbeerservice.web.mappers;

import com.studies.msscbeerservice.domain.Beer;
import com.studies.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);

}
