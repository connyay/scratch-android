package com.scratch.android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Sender {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String firstName;
    @Expose
    private Boolean isShopper;
    @Expose
    private String lastName;
    @Expose
    private String image;
    @Expose
    private Boolean isScratchbot;
    @Expose
    private String currentWelcomeMessage;
    @Expose
    private String fullName;

    /**
     * @return The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The isShopper
     */
    public Boolean getIsShopper() {
        return isShopper;
    }

    /**
     * @param isShopper The isShopper
     */
    public void setIsShopper(Boolean isShopper) {
        this.isShopper = isShopper;
    }

    /**
     * @return The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return The isScratchbot
     */
    public Boolean getIsScratchbot() {
        return isScratchbot;
    }

    /**
     * @param isScratchbot The isScratchbot
     */
    public void setIsScratchbot(Boolean isScratchbot) {
        this.isScratchbot = isScratchbot;
    }

    /**
     * @return The currentWelcomeMessage
     */
    public String getCurrentWelcomeMessage() {
        return currentWelcomeMessage;
    }

    /**
     * @param currentWelcomeMessage The currentWelcomeMessage
     */
    public void setCurrentWelcomeMessage(String currentWelcomeMessage) {
        this.currentWelcomeMessage = currentWelcomeMessage;
    }

    /**
     * @return The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName The fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
