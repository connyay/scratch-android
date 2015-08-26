package com.scratch.android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Product {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String brand;
    @Expose
    private String name;
    @Expose
    private String positioning;
    @Expose
    private Double price;
    @Expose
    private String returnPolicy;
    @Expose
    private String url;
    @Expose
    private String fbid;
    @SerializedName("__v")
    @Expose
    private Integer V;
    @Expose
    private String created;
    @Expose
    private String modified;
    @Expose
    private Double shippingPrice;
    @Expose
    private List<String> tags = new ArrayList<String>();
    @Expose
    private List<String> photos = new ArrayList<String>();

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
     * @return The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand The brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The positioning
     */
    public String getPositioning() {
        return positioning;
    }

    /**
     * @param positioning The positioning
     */
    public void setPositioning(String positioning) {
        this.positioning = positioning;
    }

    /**
     * @return The price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return The returnPolicy
     */
    public String getReturnPolicy() {
        return returnPolicy;
    }

    /**
     * @param returnPolicy The returnPolicy
     */
    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The fbid
     */
    public String getFbid() {
        return fbid;
    }

    /**
     * @param fbid The fbid
     */
    public void setFbid(String fbid) {
        this.fbid = fbid;
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
     * @return The shippingPrice
     */
    public Double getShippingPrice() {
        return shippingPrice;
    }

    /**
     * @param shippingPrice The shippingPrice
     */
    public void setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
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
     * @return The photos
     */
    public List<String> getPhotos() {
        return photos;
    }

    /**
     * @param photos The photos
     */
    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

}
