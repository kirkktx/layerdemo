package gov.fema.geo;

import org.springframework.data.repository.CrudRepository;

public interface LayerRepository extends CrudRepository<Layer, Integer> {

    Layer findLayerById(Integer id);
}

