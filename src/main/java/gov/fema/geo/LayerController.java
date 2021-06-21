package gov.fema.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.openapitools.model.LayerDto;

@RestController
public class LayerController {

    @Autowired
    private LayerRepository layerRepository;

    //org.openapitools.model
    @RequestMapping(value="/api/layers/add2",method = RequestMethod.POST)
    public String addLayer2(@RequestBody DtoLayer dtoLayer) {
        Layer layer = new Layer();
//        layer.setShortName(dtoLayer.getShortName());
//        layer.setLongName(dtoLayer.getLongName());
        layerRepository.save(layer);
        return "Added a new layer to repo!";
    }
    @PostMapping("/api/layers/add")
    public String addLayer(@RequestParam String shortName, String longName) {
        Layer layer = new Layer();
        layer.setShortName(shortName);
        layer.setLongName(longName);
        layerRepository.save(layer);
        return "Added a new layer to repo!";
    }

    @GetMapping("/api/layers/list")
    public Iterable<Layer> getLayers() {
        return layerRepository.findAll();
    }

    @GetMapping("/api/layers/find/{id}")
    public Layer findLayerById(@PathVariable Integer id) {
        return layerRepository.findLayerById(id);
    }
}

