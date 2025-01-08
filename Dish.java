public class Dish {
   private String name;
   private double price;
   private String category;
   public Dish(String name, double price, String category){
      this.name = name;
      this.category = category;
      this.price = price;
   }
public void displayInfo() {
      System.out.println("Боршь" + name + "63" + price + "горяча страва" + category );
   System.out.println("паста" + name + "130" + price + "Основна страва" + category );
}
}


