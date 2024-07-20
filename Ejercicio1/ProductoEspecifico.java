public class ProductoEspecifico extends Producto {

    private String category;
    private String brand;

    public ProductoEspecifico(int id, String name, Double price, String category, String brand){
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoEspecifico{");
        sb.append("id=").append(getId());
        sb.append(", name=").append(getName());
        sb.append(", price=").append(getPrice());
        sb.append("category=").append(category);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }



}