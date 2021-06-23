package gov.fema.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// can't get access to the LayerDto class within the jar ...
//import org.openapitools.model.LayerDto;

// ... so just copied source code here
import gov.fema.geo.model.*;

@RestController
public class LayerController {

    @Autowired
    private LayerRepository layerRepository;

    //org.openapitools.model
    @RequestMapping(value="/api/layers/add",method = RequestMethod.POST)
    public String addLayer(@RequestBody LayerDto dtoLayer) {
        Layer entityLayer = new Layer();
        CopyToEntity(dtoLayer,entityLayer);
        layerRepository.save(entityLayer);
        return "Added a new layer to database id = " + entityLayer.getId();
    }

    @RequestMapping(value="/api/layers/update/{id}",method = RequestMethod.PUT)
    public String updateLayer(@PathVariable Integer id, @RequestBody LayerDto dtoLayer) {
        //https://www.baeldung.com/spring-data-crud-repository-save#updateInstance
        //todo: make sure dto.id already exists in table
        Layer entityLayer = new Layer();
        CopyToEntity(dtoLayer,entityLayer);
        layerRepository.save(entityLayer);
        return "layer updated = " + entityLayer.getId();
    }

//    @RequestMapping(value="/api/layers/add2",method = RequestMethod.POST)
//    public String addLayer2(@RequestBody DtoLayer dtoLayer) {
//        Layer layer = new Layer();
////        layer.setShortName(dtoLayer.getShortName());
////        layer.setLongName(dtoLayer.getLongName());
//        layerRepository.save(layer);
//        return "Added a new layer to repo!";
//    }
//    @PostMapping("/api/layers/add3")
//    public String addLayer3(@RequestParam String shortName, String longName) {
//        Layer layer = new Layer();
//        layer.setShortName(shortName);
//        layer.setLongName(longName);
//        layerRepository.save(layer);
//        return "Added a new layer to repo!";
//    }

    @GetMapping("/api/layers/list")
    public Iterable<Layer> getLayers() {
        //todo: convert to dto (similar to Linq?)
        return layerRepository.findAll();
    }

    @GetMapping("/api/layers/find/{id}")
    public Layer findLayerById(@PathVariable Long id) {
        return layerRepository.findLayerById(id);
    }

    @DeleteMapping("/api/layers/delete/{id}")
    public String deleteLayer(@PathVariable Long id) {
        layerRepository.deleteById(id);
        return "layer deleted";
    }

    private void CopyToEntity(LayerDto dto, Layer entity)
    {
        //.. and so on
        entity.setShortName(dto.getShortName());
        entity.setLongName(dto.getLongName());
        entity.setDescription(dto.getDescription());
        //todo: copy all the other dto properties to the layer entity
    }
}

