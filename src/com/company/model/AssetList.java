package com.company.model;

//import date datatype from java.util library
import java.util.Date;

public class AssetList {
    //set private variables for setting and getting information to send to the database
    private int id;
    private String assetName;
    private String model;
    private String manufacturer;
    private String ipAddress;
    private String macAddress;
    private String assetLocation;
    private Date purchaseDate;
    private String warrantyInfo;
    private String notes;

    public AssetList() {
        id = 0;
        assetName = "";
        model = "";
        manufacturer = "";
        ipAddress = "";
        macAddress = "";
        assetLocation = "";
        purchaseDate = null;
        warrantyInfo = "";
        notes = "";
    }

    public AssetList(int id, String assetName, String model, String manufacturer, String ipAddress, String macAddress, String assetLocation, Date purchaseDate, String warrantyInfo, String notes) {
        this.id = id;
        this.assetName = assetName;
        this.model = model;
        this.manufacturer = manufacturer;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.assetLocation = assetLocation;
        this.purchaseDate = purchaseDate;
        this.warrantyInfo = warrantyInfo;
        this.notes = notes;
    }

    //Setters and getters for asset information to be stored
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
    public String getAssetName() {
        return assetName;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
    public String getMacAddress() {
        return macAddress;
    }
    public void setAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
    }
    public String getAssetLocation() {
        return assetLocation;
    }
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public Date getPurchaseDate() {
        return purchaseDate;
    }
    public void setWarrantyInfo(String warrantyInfo) {
        this.warrantyInfo = warrantyInfo;
    }
    public String getWarrantyInfo() {
        return warrantyInfo;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getNotes() {
        return notes;
    }
}
