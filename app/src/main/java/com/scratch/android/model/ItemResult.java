package com.scratch.android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class ItemResult {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String modified;
    @Expose
    private String created;
    @SerializedName("_sender")
    @Expose
    private com.scratch.android.model.Sender sender;
    @SerializedName("_collection")
    @Expose
    private String Collection;
    @Expose
    private String type;
    @Expose
    private Product product;
    @Expose
    private Double shippingPrice;
    @Expose
    private Boolean draft;
    @SerializedName("__v")
    @Expose
    private Integer V;
    @Expose
    private Boolean saved;
    @Expose
    private Boolean rejected;
    @Expose
    private List<Object> children = new ArrayList<Object>();
    @Expose
    private String message;
    @SerializedName("_parent")
    @Expose
    private String Parent;

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
     * @return The Sender
     */
    public com.scratch.android.model.Sender getSender() {
        return sender;
    }

    /**
     * @param Sender The _sender
     */
    public void setSender(com.scratch.android.model.Sender Sender) {
        this.sender = Sender;
    }

    /**
     * @return The Collection
     */
    public String getCollection() {
        return Collection;
    }

    /**
     * @param Collection The _collection
     */
    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product The product
     */
    public void setProduct(Product product) {
        this.product = product;
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
     * @return The draft
     */
    public Boolean getDraft() {
        return draft;
    }

    /**
     * @param draft The draft
     */
    public void setDraft(Boolean draft) {
        this.draft = draft;
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
     * @return The saved
     */
    public Boolean getSaved() {
        return saved;
    }

    /**
     * @param saved The saved
     */
    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    /**
     * @return The rejected
     */
    public Boolean getRejected() {
        return rejected;
    }

    /**
     * @param rejected The rejected
     */
    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    /**
     * @return The children
     */
    public List<Object> getChildren() {
        return children;
    }

    /**
     * @param children The children
     */
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return The Parent
     */
    public String getParent() {
        return Parent;
    }

    /**
     * @param Parent The _parent
     */
    public void setParent(String Parent) {
        this.Parent = Parent;
    }

}
