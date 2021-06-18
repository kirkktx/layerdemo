package gov.fema.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LayerController {

    @Autowired
    private LayerRepository layerRepository;

    @PostMapping("/layers/add")
    public String addLayer(@RequestParam String shortName, @RequestParam String longName) {
        Layer layer = new Layer();
        layer.setShortName(shortName);
        layer.setLongName(longName);
        layerRepository.save(layer);
        return "Added a new layer to repo!";
    }

    @GetMapping("/layers/list")
    public Iterable<Layer> getLayers() {
        return layerRepository.findAll();
    }

    @GetMapping("/layers/find/{id}")
    public Layer findLayerById(@PathVariable Integer id) {
        return layerRepository.findLayerById(id);
    }
}

