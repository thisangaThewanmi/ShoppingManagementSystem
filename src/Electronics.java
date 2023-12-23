public class Electronics extends  Product{

    private String brand;

    private String  warranty;

    public Electronics(String brand, String warranty) {
      this.  brand = brand;
      this. warranty = warranty;
    }

    public Electronics(String productId, String productName, String availabaleNo, Double price, String brand, String warranty) {
        super(productId, productName, availabaleNo, price);
        this. brand = brand;
        this. warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        warranty = warranty;
    }

    @Override
    public String toString() {
        return "01). Id              : " + this.getProductId() + '\n' +
                "02).Name            : " + this.getProductName() + '\n' +
                "03). AvailableNo      : " + this.getAvailabaleNo() + '\n' +
                "04). Price     : " + this.getPrice() + '\n' +
                "05). Brand : " + this.brand + '\n' +
                "06). Warrenty     : " + this.warranty + '\n';
    }
}
