package kedi;

import java.util.*;
import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		ArrayList<Product> carts = new ArrayList<>();
	    carts.add(new Product("Pendrive",1200));
	    carts.add(new Product("HardDisk",2000));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch;
		do{
			System.out.println("1.Add item to the cart :");
			System.out.println("2.Remove item to the Cart :");
			System.out.println("3.View cart and total cost :");
			System.out.println("4.Exit");
			System.out.println("Enter any choice :");
		   
			
			 ch = sc.nextInt();
			switch(ch) {
			
			
			case 1:
				System.out.println("Enter item name :" );
				String itemName = sc.next();
	          System.out.println("Enter Product Price :");
	            double itemPrice = sc.nextDouble() ;
	           Product p1 = new Product(itemName,itemPrice);
			    carts.add(p1);
			    System.out.println("Product selected Successfully !");
			    
			    break;
			    
			case 2 :
				System.out.println("Enter the product you want to remove : :");
				 itemName =sc.next();
				boolean isFound = false;
				int i = 0;
				for(Product item:carts)
				{
					if(item.getName().equals(itemName))
					{
				        isFound = true;
						break;
					}
					i++;
					
				}
				if(isFound)
				{
					carts.remove(i);
					System.out.println(itemName + " removed from the cart!");
				}
				else 
				{
					System.out.println(itemName +" is not found in the cart " );
				}
				break;
				
			case 3 :
				System.out.println("View Cart\n=======================================================\n");
				System.out.printf("%-15s%-15s\n=======================================================\n","Product Name","Price");
				double totalCost = 0;
				for (Product item : carts)
				{
					totalCost += item.getPrice();
					System.out.printf("%-15s%-15s\n",item.getName(),item.getPrice());
			    }
			   System.out.println("Total cost :" + totalCost);
			   
			
				
			 
		   
			
			}
		
			
		
	}while(ch!=4);
		
	

	}
}