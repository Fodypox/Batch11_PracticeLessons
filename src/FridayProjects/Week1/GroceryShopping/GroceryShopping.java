package FridayProjects.Week1.GroceryShopping;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] products = {"MacBook","IPhone","AirPods","IPod"};
        double [] price = {1400,1000,400,1100};
        int [] stockStatus = {2,10,30,7};
        for (String product:products) {
            System.out.println(product);
        }
        double totalPrice = 0;
        while (true){
            System.out.println("Select a product to buy and quantity:");
            String selectedProduct = sc.nextLine();
            int selectedQuantity = sc.nextInt();
            int indexOfProduct = -1;
            for (int i = 0; i < products.length; i++) {
                if (selectedProduct.equals(products[i])){
                    indexOfProduct = i;
                }
            }

            if (stockStatus[indexOfProduct]>=selectedQuantity){
                totalPrice = totalPrice+price[indexOfProduct]*selectedQuantity;
                System.out.println("Total price is "+totalPrice);
                stockStatus[indexOfProduct] = stockStatus[indexOfProduct]-selectedQuantity;
            }else {
                System.out.println("Insufficient stock, remaining stock is: "+stockStatus[indexOfProduct]);
            }
            String shopAgain;
            System.out.println("Would you like to shop again? Yes/No");
            shopAgain = sc.nextLine();
            if (shopAgain.equalsIgnoreCase("no")){
                break;
            }else {
                continue;
            }


        }
        System.out.println("Total price is "+totalPrice);
    }
}
