package guru.springframework.msscbeerservice.services.inventory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import guru.springframework.msscbeerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Disabled
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @Test
    void getOnhandInventory() {
        Integer qty = beerInventoryService.getOnhandInventory(UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08"));
        assertTrue(qty > 0);
        System.out.println("---> qty on hand: " + qty);
    }
}