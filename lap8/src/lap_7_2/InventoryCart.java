package lap_7_2;
public class InventoryCart {
	private Product[] products;
	 private int count = 0;
	 
	 public InventoryCart(int list) {
	 products = new Product[list];
	 }
	 public void add(Product product) {
	 for(int i=0;i<count;i++) {
	 if(product.getName() == products[i].getName()) {
	 products[i].setCount(products[i].getCount()+1);
	 products[i].setPrice(products[i].getPrice()+product.getPrice());
	 return;
	 }
	 }
	 products[count++] = product;
	 }
	 public Product getProduct(int num){
	 return products[num];
	 }
	 public Product[] getAllProduct() {
	 Product[] allP = new Product[count];
	 int i = 0;
	 while(i<count) {
	 allP[i] = products[i];
	 i++;
	 }
	 return allP;
	 
	 }
}
