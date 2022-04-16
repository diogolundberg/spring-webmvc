package webmvc.service;

import org.junit.jupiter.api.Test;
import webmvc.model.City;
import webmvc.repository.CrudRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CityServiceTest {

    private final CrudRepository repository = mock(CrudRepository.class);
    private CityService cityService = new CityService(repository);

    @Test
    void shouldReturnAllCities() {
        var cities = List.of(new City(1, "name"));
        when(repository.findAll()).thenReturn(cities);

        assertIterableEquals(cities, cityService.list());
    }
}