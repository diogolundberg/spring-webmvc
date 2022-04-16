package webmvc.service;

import org.springframework.stereotype.Service;
import webmvc.model.City;
import webmvc.repository.CrudRepository;

import java.util.List;

@Service
class CityService implements CrudService<City> {
    private final CrudRepository<City> repository;

    CityService(CrudRepository<City> courseRepository) {
        repository = courseRepository;
    }

    @Override
    public List<City> list() {
        return repository.findAll();
    }
}
