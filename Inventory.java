import java.util.Scanner;

class Inventory{
	static final int MAX_PRODUCTS = 50;
	
	static int[] productIds = new int[MAX_PRODUCTS];
	static String[] productNames = new String[MAX_PRODUCTS];
	static double[] productPrices = new double[MAX_PRODUCTS];
	static int[] productQuantities = new int[MAX_PRODUCTS];
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("==== Inventory Management System ====");
			System.out.println("1. Add Product");
			System.out.println("2. View Products");
			System.out.println("3. Search Product");
			System.out.println("4. Update Quantity");
			System.out.println("5. Delete Product");
			System.out.println("6. Exit");
			
			System.out.println("Enter Choice: ");
			choice = scanner.nextInt();
			
			switch (choice){
				case 1:
				 addProduct(scanner);
				 break;
				case 2:
				 viewProducts();
				 break;
				case 3:
				 searchProduct(scanner);
				 break;
				case 4:
				 updateQuantity(scanner);
				 break;
				case 5:
				 deleteProduct(scanner);
				 break;
				case 6:
				 System.out.println("Exit...");
				 break;
				default:
					System.out.println("Invalid choice!.");
			}
			
		} while (choice != 6);
		
	}
	
	public static void addProduct(Scanner scanner){
		if (productCount >= MAX_PRODUCTS) {
			System.out.println("Inventory is full!");
			return;
		}
		
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		
		for (int i = 0; i < productCount; i++){
			if(productIds[i] == id){
				System.out.println("ID exists!");
				return;
			}
		}
		
		scanner.nextLine();
		
		System.out.print("Enter Product Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Product Price: ");
		double price = scanner.nextDouble();
		
		if (price < 0){
			System.out.println("Invalid");
			return;
		}
		
		System.out.print("Enter Product Quantity: ");
		int quantity = scanner.nextInt();
		
		if (price < 0){
			System.out.println("Invalid");
			return;
		}
		
		productIds[productCount] = id;
		productNames[productCount] = name;
		productPrices[productCount] = price;
		productQuantities[productCount] = quantity;
		productCount++;
		
		System.out.println("Product added successfully");
		
	}
	
	public static void viewProducts(){
		if(productCount == 0){
			System.out.println("No products! ");
			return;
		}
		
		System.out.println("Product List: ");
		for(int i = 0; i < productCount; i++){
			System.out.println("ID: " + productIds[i] + " Name: " + productNames[i] + " Price: " + productPrices[i] + " Quantity: " + productQuantities[i]);
		}
	}
	
	
	public static void searchProduct()
}
