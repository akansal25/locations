package app;

import entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RepositoryRestController
public class LocationRepositoryController {

    @Autowired
    private final LocationRepository locationRepository;

    public LocationRepositoryController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping(value = "/locations/{businessId}")
    public @ResponseBody ResponseEntity<?> getLocationbyBusinessId(@PathVariable String businessId){

        Location location = locationRepository.findByBusinessId(businessId);

        Resource<Location> resource = new Resource<>(location);

        resource.add(linkTo(methodOn(LocationRepositoryController.class).getLocationbyBusinessId(businessId)).withSelfRel());

        return ResponseEntity.ok(resource);
    }
}