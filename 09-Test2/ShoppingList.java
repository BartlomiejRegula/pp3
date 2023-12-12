import java.util.ArrayList;

public class ShoppingList {
    private Product product;
    ArrayList<Product> lista = new ArrayList<>();
    public void add(Product product){
        lista.add(product);
    }

    @Override
    public String toString() {
        String x ="";
        for (int i = 0; i < lista.size();i++){
            if (i < lista.size()-1){
            x += lista.get(i).getName()+",";
            } else{
                x += lista.get(i).getName();
            }
        }
        return x;
    }
    public int total(){
        int x =0;
        for (int i = 0; i < lista.size();i++){
            x += lista.get(i).getQuantity();
        }
        return x;
    }
    public static void main(String[] args) {
        Product milk = new Product("milk", 2);
        Product apple = new Product("apple", 4);
        ShoppingList l = new ShoppingList();
        l.add(apple);
        l.add(milk);
        System.out.println(l.toString());
        System.out.println(l.total());
    }
}
