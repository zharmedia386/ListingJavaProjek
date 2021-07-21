package Soal_B;

import java.io.FileReader;
import java.io.FileNotFoundException; 
import java.lang.reflect.Type;
import java.util.List; 
import com.google.gson.Gson; 
import com.google.gson.reflect.TypeToken;

public class mainDriver {
	public static void main(String args[]) throws FileNotFoundException{
	int i = 0;
	int j = 0;
	Gson gson = new Gson();
	Type listType = new TypeToken<List<Product>>(){}.getType();
	
	List<Product> listBarang = gson.fromJson(new FileReader("C:\\Users\\Baterai\\eclipse-workspace\\ETS\\Soal_B.json "), listType); 
	System.out.println("ProductName               | Quantity | Weight | Destination | ServicePackage              | Service Value | Total");
	    for(Product item: listBarang){
	        System.out.printf("%-25s | %-8d | %-6d | %-11s | %-27s | %-13d | %d \n",
	                item.getProductName(),
	                item.getQuantity(),
	                item.getWeight(),
	                item.getCity().getDestination(),
	                item.getServicePackage().getService(),
	                item.getServicePackage().getValue(),
	                item.getQuantity() * item.getPriceItem() + item.getServicePackage().getValue());
	    }

	}
}