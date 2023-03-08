package guru.springframework.msscbeerservice.events;

import java.io.Serializable;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerEvent implements Serializable {
    private static final long serialVersionUID = -1L;
    private BeerDto beerDto;
}
