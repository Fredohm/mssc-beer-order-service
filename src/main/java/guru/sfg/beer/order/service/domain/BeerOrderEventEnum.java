package guru.sfg.beer.order.service.domain;

public enum BeerOrderEventEnum {
    VALIDATION_ORDER,
    VALIDATION_PASSED,
    VALIDATION_FAILED,
    ALLOCATION_SUCCESS,
    ALLOCATION_NO_INVENTORY,
    ALLOCATION_FAILED,
    BEER_ORDER_PICKED_UP
}
