package com.scratch.android.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Shopper implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String firstName;
    @Expose
    private Boolean isShopper;
    @Expose
    private String image;
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


    @Override
    public int describeContents() {
        return 0;
    }

    public Shopper() {

    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Shopper createFromParcel(Parcel in) {
            return new Shopper(in);
        }

        public Shopper[] newArray(int size) {
            return new Shopper[size];
        }
    };

    private Shopper(Parcel in) {
        Id = in.readString();
        firstName = in.readString();
        isShopper = in.readByte() != 0;
        image = in.readString();
        currentWelcomeMessage = in.readString();
        fullName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Id);
        dest.writeString(firstName);
        dest.writeByte((byte) (isShopper ? 1 : 0));
        dest.writeString(image);
        dest.writeString(currentWelcomeMessage);
        dest.writeString(fullName);
    }


}
