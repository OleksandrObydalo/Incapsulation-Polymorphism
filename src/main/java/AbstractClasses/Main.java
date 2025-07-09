package AbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Book(1, "book",100.0, "BookFactory", "Henry Brian" ));
        products.add(new Book(2, "book2",100.0, "BookFactory", "Henry Brian" ));
        products.add(new Television(3, "TV",100.0, "Samsung", 75.0 ));
        products.add(new Television(4, "TV2",100.0, "Xiaomi", 80.0 ));

        for(Product p: products){
            p.info();
        }


    }
}
