package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.services.inventory.BeerInventoryService;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;


public class BeerMapperDecorator implements BeerMapper {

    private BeerInventoryService beerInventoryService;
    private BeerMapper beerMapper;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService service) {
        this.beerInventoryService = service;
    }

    @Autowired
    public void setBeerMapper(BeerMapper beerMapper) {
        this.beerMapper = beerMapper;
    }

    @Override
    public BeerDto beerToBeerDto(final Beer beer) {
        BeerDto dto = beerMapper.beerToBeerDto(beer);
        return dto;
    }

    @Override
    public BeerDto beerToBeerDtoWithInventory(final Beer beer) {
        System.out.println("-------------------->>>> Mapping decorator set qty: ");
        BeerDto dto = beerMapper.beerToBeerDto(beer);
        dto.setQuantityOnHand(beerInventoryService.getOnhandInventory(beer.getId()));
        return dto;
    }

    @Override
    public Beer beerDtoToBeer(final BeerDto dto) {
        return beerMapper.beerDtoToBeer(dto);
    }
}
