package com.tutorsdude.Encapsulation.object;

public class Mobile {

   private byte mobileCharging;
   private byte noOfSimSlots;
   private byte cameraQualityInMp;
   private byte noOfButtons;
   private byte ram;
   private byte androidVersion;

   private short weight;
   private short internalStorage;
   private short manufacturingYear;

   private int mobileNumber;
   private int price;
   private int manufacturingPerYear;
   private int noOfDistributers;
   private int rechargePlan;


   private String mobileCompany;
   private String brand;
   private String processor;
   private String ownerName;
   private String manufacturingLocation;
   private String color;
   private String batteryCapacity;

   private float osVersion;
   private float sellingRatio;
   private float profitRatio;

   private boolean processorIsGood;
   private boolean cameraQualityIsWorst;
   private boolean mobilePriceIsHigh;
   private boolean itsChineesCompany;

   private char series;
   private char usbType;

    // getters

    public byte getMobileCharging(){
        return mobileCharging;
    }
    public byte getNoOfSimSlots(){
        return  noOfSimSlots;
    }
    public byte getCameraQualityInMp(){
        return cameraQualityInMp;
    }
    public byte getNoOfButtons(){
        return  noOfButtons;
    }
    public byte getRam(){
        return ram;
    }
    public byte getAndroidVersion(){
        return androidVersion;
    }

    public short getWeight(){
        return weight;
    }
    public short getInternalStorage(){
        return internalStorage;
    }
    public short getManufacturingYear(){
        return manufacturingYear;
    }

    public int getMobileNumber(){
        return mobileNumber;
    }
    public int getPrice(){
        return price;
    }
    public int getManufacturingPerYear(){
        return manufacturingPerYear;
    }
    public int getNoOfDistributers(){
        return noOfDistributers;
    }
    public int getRechargePlan(){
        return rechargePlan;
    }

    public String getMobileCompany(){
        return mobileCompany;
    }
    public String getBrand(){
        return brand;
    }
    public String getProcessor(){
        return processor;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public String getColor(){
        return color;
    }
    public String getManufacturingLocation(){
        return manufacturingLocation;
    }
    public String getBatteryCapacity(){
        return  batteryCapacity;
    }

    public float getOsVersion(){
        return osVersion;
    }
    public float getSellingRatio(){
        return sellingRatio;
    }
    public float getProfitRatio(){
        return profitRatio;
    }

    public boolean getProcessorIsGood(){
        return processorIsGood;
    }
    public boolean getMobilePriceIsHigh(){
        return mobilePriceIsHigh;
    }
    public boolean getCameraQualityIsWorst(){
        return cameraQualityIsWorst;
    }
    public boolean getItsChineesCompany() {
        return itsChineesCompany;
    }

    public char getSeries(){
        return series;
    }
    public char getUsbType() {
        return usbType;
    }


    // setters

    public void setMobileCharging(byte mobileCharging){
        this.mobileCharging = mobileCharging;
    }
    public void setNoOfSimSlots(byte noOfSimSlots){
        this.noOfSimSlots = noOfSimSlots;
    }
    public void setCameraQualityInMp(byte cameraQualityInMp){
        this.cameraQualityInMp = cameraQualityInMp;
    }
    public void setNoOfButtons(byte noOfButtons){
        this.noOfButtons = noOfButtons;
    }
    public void setAndroidVersion(byte androidVersion) {
        this.androidVersion = androidVersion;
    }
    public void setRam(byte ram){
        this.ram = ram;
    }

    public void setWeight(short weight){
        this.weight = weight;
    }
    public void setInternalStorage(short internalStorage){
        this.internalStorage = internalStorage;
    }
    public void setManufacturingYear(short manufacturingYear){
        this.manufacturingYear = manufacturingYear;
    }

    public void setMobileNumber(int mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setManufacturingPerYear( int manufacturingPerYear){
        this.manufacturingPerYear = manufacturingPerYear;
    }
    public void setNoOfDistributers(int noOfDistributers){
        this.noOfDistributers = noOfDistributers;
    }
    public void setRechargePlan(int rechargePlan){
        this.rechargePlan = rechargePlan;
    }

    public void setMobileCompany(String mobileCompany) {
        this.mobileCompany = mobileCompany;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setManufacturingLocation(String manufacturingLocation){
        this.manufacturingLocation = manufacturingLocation;
    }

    public void setMobilePriceIsHigh(boolean mobilePriceIsHigh) {
        this.mobilePriceIsHigh = mobilePriceIsHigh;
    }
    public void setCameraQualityIsWorst(boolean cameraQualityIsWorst) {
        this.cameraQualityIsWorst = cameraQualityIsWorst;
    }
    public void setItsChineesCompany(boolean itsChineesCompany) {
        this.itsChineesCompany = itsChineesCompany;
    }
    public void setProcessorIsGood(boolean processorIsGood) {
        this.processorIsGood = processorIsGood;
    }

    public void setOsVersion(float osVersion) {
        this.osVersion = osVersion;
    }
    public void setProfitRatio(float profitRatio) {
        this.profitRatio = profitRatio;
    }
    public void setSellingRatio(float sellingRatio) {
        this.sellingRatio = sellingRatio;
    }

    public void setSeries(char series) {
        this.series = series;
    }

    public void setUsbType(char usbType) {
        this.usbType = usbType;
    }
}
