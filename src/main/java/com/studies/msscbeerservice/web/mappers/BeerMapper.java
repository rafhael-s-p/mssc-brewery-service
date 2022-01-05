package com.studies.msscbeerservice.web.mappers;

import com.studies.msscbeerservice.domain.Beer;
import com.studies.msscbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

}
