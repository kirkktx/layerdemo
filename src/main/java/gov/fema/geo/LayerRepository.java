package gov.fema.geo;

import org.springframework.data.repository.CrudRepository;

public interface LayerRepository extends CrudRepository<Layer, Long> {

    Layer findLayerById(Long id);
    //https://www.baeldung.com/spring-data-crud-repository-save#updateInstance
    // not needed? void updateLayer(Layer layer);
}

