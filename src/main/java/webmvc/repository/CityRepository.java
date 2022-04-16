package webmvc.repository;

import org.springframework.stereotype.Repository;
import webmvc.model.City;

import java.util.List;

@Repository
class CityRepository implements CrudRepository<City> {

    @Override
    public List<City> findAll() {
        return List.of(new City(1, "City name"));
    }
}
