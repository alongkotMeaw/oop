package lap13_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemRead {

    private String name;
    private double price;
    private int quantity;
    private double total;

    public ItemRead(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity; // คำนวณ total
    }

    public double getTotal() {
        return total;
    }

    public String toString() {
        return name + "  " + price + "$  " + quantity + "   " + total;
    }

    public static void main(String[] args) {
        List<ItemRead> newItemList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\item.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String itemName = parts[0];
                double itemPrice = Double.parseDouble(parts[1]);
                int itemQuantity = Integer.parseInt(parts[2]);
                newItemList.add(new ItemRead(itemName, itemPrice, itemQuantity));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("load Menu file error");
        }

        double totalAtCart = 0;
       
        for (ItemRead n : newItemList) {
            totalAtCart += n.getTotal();
            System.out.println("item name " + n.name);
        }
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
       
        for (ItemRead r : newItemList) {
            if(r.name.equals(choice)) 
            	System.out.println(r.toString());
        }
        
    }
}
