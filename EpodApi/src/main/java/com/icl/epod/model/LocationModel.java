package com.icl.epod.model;

/**
 * @author Vijendra.y
 *
 */
public class LocationModel {
	private Integer locationId;
	private String locationName;
	private LocationType locationType;
	private String locationNotes;
	private Boolean isSTILocation;
	private String locationContactName;
	private String locationContactPhone;
	private String locationContactEmail;
	private Boolean isDeliveryLocation;
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public LocationType getLocationType() {
		return locationType;
	}
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	public String getLocationNotes() {
		return locationNotes;
	}
	public void setLocationNotes(String locationNotes) {
		this.locationNotes = locationNotes;
	}
	public Boolean getIsSTILocation() {
		return isSTILocation;
	}
	public void setIsSTILocation(Boolean isSTILocation) {
		this.isSTILocation = isSTILocation;
	}
	public String getLocationContactName() {
		return locationContactName;
	}
	public void setLocationContactName(String locationContactName) {
		this.locationContactName = locationContactName;
	}
	public String getLocationContactPhone() {
		return locationContactPhone;
	}
	public void setLocationContactPhone(String locationContactPhone) {
		this.locationContactPhone = locationContactPhone;
	}
	public String getLocationContactEmail() {
		return locationContactEmail;
	}
	public void setLocationContactEmail(String locationContactEmail) {
		this.locationContactEmail = locationContactEmail;
	}
	public Boolean getIsDeliveryLocation() {
		return isDeliveryLocation;
	}
	public void setIsDeliveryLocation(Boolean isDeliveryLocation) {
		this.isDeliveryLocation = isDeliveryLocation;
	}
}
