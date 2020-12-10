package HarryPotter;

public class MainBookComicetc {

	 public static void main(String[] args) {
	       
	        // Declare and create Product array of size 5
	        Product[] pa = new Product[4];
	       
	        // Create object instances
	       
	        pa[0] = new Book(34, "Sun press", 1992);
	        pa[1] = new Book(15, "Korea press", 1986);
	        pa[2] = new ChildrensBook(15,"PW Press", 1987, 8);
	        pa[3] = new ComicBook(14, "PW press", 1924, "Batman");
	       
	        // Compute total regular price and total
	        // sale price.
	        double totalRegularPrice = 0;
	        double totalSalePrice = 0;
	       
	        for (int i=0; i<pa.length; i++){
	           
	            // Call a method of the super class to get
	            // the regular price.
	            totalRegularPrice += pa[i].getRegularPrice();
	           
	            // Since the sale price is computed differently
	            // depending on the product type, overriding
	            // method of the object instance of the sub-class
	            // gets invoked.  This is runtime polymorphic
	            // behavior.
	            totalSalePrice += pa[i].computeSalePrice();
	           
	            System.out.println("Item number " + (i+1) +
	                    ": Type = " + pa[i].getClass().getName() +
	                    ", Regular price = " + pa[i].getRegularPrice() +
	                    ", Sale price = " + pa[i].computeSalePrice());
	        }
	        System.out.println("totalRegularPrice = " + totalRegularPrice);
	        System.out.println("totalSalePrice = " + totalSalePrice);
	    }
	   
	}