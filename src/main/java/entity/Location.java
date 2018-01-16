package entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "locations")
public class Location {


    @Id
    private String _id;
    private String geocodeTs;
    private String updatedBy;
    private Address address;
    private String createdBy;
    private AtmDetail atmDetail;
    private String name;
    private String businessId;
    private String createdDateTime;
    private String type;
    private String status;
    private String updatedDateTime;
    private Geolocation geolocation;


    public String getGeocodeTs() {
        return this.geocodeTs;
    }

    public void setGeocodeTs(String geocodeTs) {
        this.geocodeTs = geocodeTs;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public AtmDetail getAtmDetail() {
        return this.atmDetail;
    }

    public void setAtmDetail(AtmDetail atmDetail) {
        this.atmDetail = atmDetail;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getCreatedDateTime() {
        return this.createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedDateTime() {
        return this.updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Geolocation getGeolocation() {
        return this.geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
