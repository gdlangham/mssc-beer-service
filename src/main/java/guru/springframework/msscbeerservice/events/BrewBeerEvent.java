package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{
    public BrewBeerEvent(final BeerDto beerDto) {
        super(beerDto);
    }
}
