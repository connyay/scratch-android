package com.scratch.android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MeResult {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String modified;
    @Expose
    private String created;
    @Expose
    private String email;
    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private String gender;
    @Expose
    private String waitlistId;
    @SerializedName("__v")
    @Expose
    private Integer V;
    @Expose
    private List<String> tags = new ArrayList<String>();
    @Expose
    private List<Collection> collections = new ArrayList<Collection>();
    @Expose
    private List<Object> requests = new ArrayList<Object>();
    @Expose
    private Subscription subscription;
    @Expose
    private Boolean settingPushScratch;
    @Expose
    private Boolean settingPushShoppers;
    @Expose
    private Boolean settingEmailScratch;
    @Expose
    private Boolean settingEmailShoppers;
    @Expose
    private List<Object> orders = new ArrayList<Object>();
    @Expose
    private Boolean isScratchbot;
    @Expose
    private List<Object> giftlist = new ArrayList<Object>();
    @Expose
    private List<Object> devices = new ArrayList<Object>();
    @Expose
    private List<Object> creditCards = new ArrayList<Object>();
    @Expose
    private List<Object> addresses = new ArrayList<Object>();
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
     * @return The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * @param modified The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * @return The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return The waitlistId
     */
    public String getWaitlistId() {
        return waitlistId;
    }

    /**
     * @param waitlistId The waitlistId
     */
    public void setWaitlistId(String waitlistId) {
        this.waitlistId = waitlistId;
    }

    /**
     * @return The V
     */
    public Integer getV() {
        return V;
    }

    /**
     * @param V The __v
     */
    public void setV(Integer V) {
        this.V = V;
    }

    /**
     * @return The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return The collections
     */
    public List<Collection> getCollections() {
        return collections;
    }

    /**
     * @param collections The collections
     */
    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    /**
     * @return The requests
     */
    public List<Object> getRequests() {
        return requests;
    }

    /**
     * @param requests The requests
     */
    public void setRequests(List<Object> requests) {
        this.requests = requests;
    }

    /**
     * @return The subscription
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * @param subscription The subscription
     */
    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * @return The settingPushScratch
     */
    public Boolean getSettingPushScratch() {
        return settingPushScratch;
    }

    /**
     * @param settingPushScratch The settingPushScratch
     */
    public void setSettingPushScratch(Boolean settingPushScratch) {
        this.settingPushScratch = settingPushScratch;
    }

    /**
     * @return The settingPushShoppers
     */
    public Boolean getSettingPushShoppers() {
        return settingPushShoppers;
    }

    /**
     * @param settingPushShoppers The settingPushShoppers
     */
    public void setSettingPushShoppers(Boolean settingPushShoppers) {
        this.settingPushShoppers = settingPushShoppers;
    }

    /**
     * @return The settingEmailScratch
     */
    public Boolean getSettingEmailScratch() {
        return settingEmailScratch;
    }

    /**
     * @param settingEmailScratch The settingEmailScratch
     */
    public void setSettingEmailScratch(Boolean settingEmailScratch) {
        this.settingEmailScratch = settingEmailScratch;
    }

    /**
     * @return The settingEmailShoppers
     */
    public Boolean getSettingEmailShoppers() {
        return settingEmailShoppers;
    }

    /**
     * @param settingEmailShoppers The settingEmailShoppers
     */
    public void setSettingEmailShoppers(Boolean settingEmailShoppers) {
        this.settingEmailShoppers = settingEmailShoppers;
    }

    /**
     * @return The orders
     */
    public List<Object> getOrders() {
        return orders;
    }

    /**
     * @param orders The orders
     */
    public void setOrders(List<Object> orders) {
        this.orders = orders;
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
     * @return The giftlist
     */
    public List<Object> getGiftlist() {
        return giftlist;
    }

    /**
     * @param giftlist The giftlist
     */
    public void setGiftlist(List<Object> giftlist) {
        this.giftlist = giftlist;
    }

    /**
     * @return The devices
     */
    public List<Object> getDevices() {
        return devices;
    }

    /**
     * @param devices The devices
     */
    public void setDevices(List<Object> devices) {
        this.devices = devices;
    }

    /**
     * @return The creditCards
     */
    public List<Object> getCreditCards() {
        return creditCards;
    }

    /**
     * @param creditCards The creditCards
     */
    public void setCreditCards(List<Object> creditCards) {
        this.creditCards = creditCards;
    }

    /**
     * @return The addresses
     */
    public List<Object> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses The addresses
     */
    public void setAddresses(List<Object> addresses) {
        this.addresses = addresses;
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
