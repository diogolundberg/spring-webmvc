package webmvc.service;

import java.util.List;

public interface CrudService<T> {
    List<T> list();
}
