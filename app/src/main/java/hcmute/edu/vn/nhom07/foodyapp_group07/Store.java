package hcmute.edu.vn.nhom07.foodyapp_group07;

import java.io.Serializable;

public class Store implements Serializable {
    private String storeName;
    private String storeImg;
    private double storeRate;
    private int storeReviews;
    private String storeAddress;
    private double storeDistance;
    private boolean isDeal;

    public Store(String storeName, String storeImg, double storeRate, int storeReviews, String storeAddress, double storeDistance, boolean isDeal) {
        this.storeName = storeName;
        this.storeImg = storeImg;
        this.storeRate = storeRate;
        this.storeReviews = storeReviews;
        this.storeAddress = storeAddress;
        this.storeDistance = storeDistance;
        this.isDeal = isDeal;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreImg() {
        return storeImg;
    }

    public void setStoreImg(String storeImg) {
        this.storeImg = storeImg;
    }

    public double getStoreRate() {
        return storeRate;
    }

    public void setStoreRate(float storeRate) {
        this.storeRate = storeRate;
    }

    public int getStoreReviews() {
        return storeReviews;
    }

    public void setStoreReviews(int storeReviews) {
        this.storeReviews = storeReviews;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public double getStoreDistance() {
        return storeDistance;
    }

    public void setStoreDistance(double storeDistance) {
        this.storeDistance = storeDistance;
    }

    public boolean isDeal() {
        return isDeal;
    }

    public void setDeal(boolean deal) {
        isDeal = deal;
    }
}