package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.BeerOrderLine;
import guru.sfg.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {


    @Mapping(target = "price", ignore = true)
    @Mapping(target = "beerStyle", ignore = true)
    @Mapping(target = "beerName", ignore = true)
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);


    @Mapping(target = "quantityAllocated", ignore = true)
    @Mapping(target = "beerOrder", ignore = true)
    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
