public class Car {
    private String licenseNum;
    private boolean hadAccident;
    private int price;

    public Car(String licenseNum, boolean hadAccident, int price) {
        this.licenseNum = licenseNum;
        this.hadAccident = hadAccident;
        this.price = price;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public void setHadAccident(boolean hadAccident) {
        this.hadAccident = hadAccident;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLicenseNum() {
        return licenseNum;
    }
    
    public boolean hadAccident() {
        return hadAccident;
    }

    public int getPrice() {
        return price;
    }

    public boolean range(int min, int max) {
        return price >= min && price <= max;
    }
}
