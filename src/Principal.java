import java.util.Scanner;
import java.util.Locale;
public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Stock stock = new Stock();

        int option;
        do {
            System.out.println("============INVENTORY=SYSTEM============");
            System.out.println("1 - REGISTER PRODUCT");
            System.out.println("2 - LIST PRODUCTS");
            System.out.println("3 - ADD STOCK");
            System.out.println("4 - REMOVE STOCK");
            System.out.println("5 - EXIT");
            System.out.print(":");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("name: ");
                    String name = input.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = input.nextInt();

                    System.out.print("Price: ");
                    float price = input.nextFloat();

                    try {
                        Produto produto = new Produto(name, quantity, price);
                        stock.addProduct(produto);
                        System.out.println("Registered product successfully!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;

                case 2:
                    stock.listProducts();
                    break;

                case 3:
                    System.out.print("Product ID: ");
                    int id = input.nextInt();

                    Produto addproduct = stock.searchProduct(id);

                    if (addproduct != null) {
                        System.out.println("amount to add? ");
                        int quantadd = input.nextInt();
                        addproduct.addStock(quantadd);
                        System.out.println("Quantity added ");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 4:
                    System.out.println("Product ID: ");
                    int idrem = input.nextInt();

                    Produto removeproduct = stock.searchProduct(idrem);

                    if (removeproduct != null) {
                        System.out.println("Amount to be removed? ");
                        int quantremove = input.nextInt();

                        if (removeproduct.removeStock(quantremove)) {
                            System.out.println("Stock removed");
                        } else {
                            System.out.println("Quantity invalid");
                        }
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (option != 5);
        input.close();
    }
}
