package com.helena.organiserbackend.model;

public class Attendee {
    //base this on the google EventAttendee class
    private String email;
    private String displayName;
    private String comment;
    private Integer additionalGuests;
    private Boolean optional; // in microsoft's model this is the opposite and is called required
    private Boolean organiser;
    private Boolean resource;
    private String responseStatus;
    private Boolean self;

    public Attendee(String email, String displayName, String comment, Integer additionalGuests, Boolean optional, Boolean organiser, Boolean resource, String responseStatus, Boolean self) {
        this.email = email;
        this.displayName = displayName;
        this.comment = comment;
        this.additionalGuests = additionalGuests;
        this.optional = optional;
        this.organiser = organiser;
        this.resource = resource;
        this.responseStatus = responseStatus;
        this.self = self;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getAdditionalGuests() {
        return additionalGuests;
    }

    public void setAdditionalGuests(Integer additionalGuests) {
        this.additionalGuests = additionalGuests;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Boolean getOrganiser() {
        return organiser;
    }

    public void setOrganiser(Boolean organiser) {
        this.organiser = organiser;
    }

    public Boolean getResource() {
        return resource;
    }

    public void setResource(Boolean resource) {
        this.resource = resource;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Boolean getSelf() {
        return self;
    }

    public void setSelf(Boolean self) {
        this.self = self;
    }
}
