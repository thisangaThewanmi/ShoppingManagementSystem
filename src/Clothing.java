public class Clothing extends Product{

    private  String size;

    private String colour;

    public Clothing(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    public Clothing(String productId, String productName, String availabaleNo, Double price, String size, String colour) {
        super(productId, productName, availabaleNo, price);
        this.size = size;
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}


