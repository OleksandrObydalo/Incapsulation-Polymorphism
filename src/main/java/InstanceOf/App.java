package InstanceOf;

import AbstractClasses.Book;
import AbstractClasses.Product;
import AbstractClasses.Television;

public class App {
    public static void main(String[] args) {
        Product product = new Television(1, "S60Qled", 3500, "Simon", 60);

        if (product instanceof Book) {
            System.out.println("It is a book. Author: " + ((Book) product).getAuthor());
        } else if (product instanceof Television) {
            System.out.println("It is a TV. Screen Diagonal: " + ((Television) product).getScreenDiagonal());
        }
    }
}

