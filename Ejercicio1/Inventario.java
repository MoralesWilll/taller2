import java.util.ArrayList;

public class Inventario {

    private ArrayList<ProductoEspecifico> inventory = new ArrayList<>();

    public void show(){
        for (Producto p: inventory) {
            System.out.println(p);
        }
    }

    public void addProduct(ProductoEspecifico a){
        inventory.add(a);
    }

    public void removeById(int id){
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId() == id){
                inventory.remove(i);
            }
        }
        
    }

    public void searchByName(String name){
        boolean found = false;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(name)){
                found = true;
            }
        }    
        if (found){
            System.out.println("Product found");
        }else{
                System.out.println("Product not found");
        }
    }

    public void searchByCategory(String category){
        boolean found = false;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getCategory().equals(category)){
                found = true;
            }
        }
        if (found){
            System.out.println("Product found");
        }else{
            System.out.println("Product not found");
        }

    }

}