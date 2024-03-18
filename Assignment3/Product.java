package Assignment3;

import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
    
        try {
            Product product = new Product(1, "Mobile", "Electronics", 1100.99);

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("product.ser"));
            out.writeObject(product);
            out.close();
            System.out.println("Product object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("product.ser"));
            Product deserializedProduct = (Product) in.readObject();
            in.close();

            System.out.println("\nDeserialized Product Details:");
            deserializedProduct.printDetails();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
