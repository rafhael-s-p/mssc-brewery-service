package com.studies.msscbeerservice.service.invetory;

import java.util.UUID;

public interface BeerInventoryService {

    Integer getOnhandInventory(UUID beerId);

}
