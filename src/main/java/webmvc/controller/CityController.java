package webmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import webmvc.model.City;
import webmvc.service.CrudService;

import java.util.List;

@RestController
class CityController {

    private CrudService<City> service;

    CityController(CrudService<City> service) {
        this.service = service;
    }

    @GetMapping("/cities")
    public List<City> getCities() {
        return service.list();
    }
}
