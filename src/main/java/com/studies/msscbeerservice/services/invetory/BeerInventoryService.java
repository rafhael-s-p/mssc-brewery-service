package com.studies.msscbeerservice.services.invetory;

import java.util.UUID;

public interface BeerInventoryService {

    Integer getOnhandInventory(UUID beerId);

}
