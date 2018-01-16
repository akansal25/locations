package app;

import entity.Location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "locations", path = "locations")
public interface LocationRepository extends MongoRepository<Location, String> {

    /*List<Location> findByQueryParams(
            @Param("phone") String phone,                       //Find by phone number/Fax number
            @Param("phonetype") String phoneType,               //Find by phone Type
            @Param("matchtype") String matchType,               //Find by Match Type
            @Param("lat") String lat,                           //Find by latitude
            @Param("lng") String lng,                           //Find by longitude
            @Param("radius") String radius,                     //Find by Radius
            @Param("type") String type,                         //Find by type of location
            @Param("updatedtimestamp") String updatedDateTime   //Find by updated timestamp
    );*/

    @RequestMapping(path = "locations/{businessId}",method = RequestMethod.GET)
    List<Location> findByBusinessId(@Param("businessId") String businessId);         //find by business id of the location as URL parameter

}
