package com.scratch.android.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Collection implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String image;
    @Expose
    private String description;
    @Expose
    private String title;
    @Expose
    private String fbid;
    @Expose
    private String status;
    @SerializedName("__v")
    @Expose
    private Integer V;
    @Expose
    private String created;
    @Expose
    private List<String> tags = new ArrayList<String>();
    @Expose
    private List<String> items = new ArrayList<String>();
    @SerializedName("_shopper")
    @Expose
    private com.scratch.android.model.Shopper shopper;

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
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
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
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return The items
     */
    public List<String> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<String> items) {
        this.items = items;
    }

    /**
     * @return The Shopper
     */
    public com.scratch.android.model.Shopper getShopper() {
        return shopper;
    }

    /**
     * @param Shopper The _shopper
     */
    public void setShopper(com.scratch.android.model.Shopper Shopper) {
        this.shopper = Shopper;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    public Collection() {

    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Collection createFromParcel(Parcel in) {
            return new Collection(in);
        }

        public Collection[] newArray(int size) {
            return new Collection[size];
        }
    };

    private Collection(Parcel in) {
        Id = in.readString();
        image = in.readString();
        description = in.readString();
        title = in.readString();
        fbid = in.readString();
        status = in.readString();
        V = in.readInt();
        created = in.readString();
        tags = in.readArrayList(String.class.getClassLoader());
        items = in.readArrayList(String.class.getClassLoader());
        shopper = in.readParcelable(Shopper.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Id);
        dest.writeString(image);
        dest.writeString(description);
        dest.writeString(title);
        dest.writeString(fbid);
        dest.writeString(status);
        dest.writeInt(V);
        dest.writeString(created);
        dest.writeList(tags);
        dest.writeList(items);
        dest.writeParcelable(shopper, flags);
    }
}
