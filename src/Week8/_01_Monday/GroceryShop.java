package Week8._01_Monday;

import java.util.Scanner;

public class GroceryShop {
    public static void main(String[] args) {
        String[] products = {"Coffee","Water","Cookies","Organic Milk"};
        double[] price = {12,1.05,5.35,4.69};
        int[] stockStatus = {3,5,4,8};
        for (String product:products) {
            System.out.println(product);
        }
        System.out.println("Make your selection and quantity:");
        Scanner scan = new Scanner(System.in);
        String selectedProduct = scan.nextLine();
        int selectedQuantity = scan.nextInt();
        int indexOfProduct = 0;
        for (int i = 0; i < products.length; i++) {
            if (selectedProduct.equalsIgnoreCase(products[i])){
                indexOfProduct = i;
            }
        }
        if (stockStatus[indexOfProduct]>=selectedQuantity){
            System.out.println("the total price is "+(price[indexOfProduct]*selectedQuantity));
            stockStatus[indexOfProduct] = stockStatus[indexOfProduct]-selectedQuantity;
        }else {
            System.out.println("we are out of stock");
        }
    }
}
