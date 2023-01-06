public class MyOwnAutoShop {
  
 public static void main(String[] args) {
 Sedan mySedan = new Sedan(160, 20000, "Red", 10);
 Ford myFord1 = new Ford (156,4452.0,"Black",2005, 10);
 Ford myFord2 = new Ford (155,5000.0,"Pink",1998, 5);
Car myCar = new Car (555, 56856.0, "Red"); 
 System.out.println("MySedan Price  "+ mySedan.getSalePrice());
 System.out.println("MyFord1 Price "+ myFord1.getSalePrice());
 System.out.println("MyFord2 Price  "+ myFord2.getSalePrice());
 System.out.println("MyCar Price  "+ myCar.getSalePrice());
 }

    
}
