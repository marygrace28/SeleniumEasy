package TestNG;

import org.testng.annotations.Test;

public class GroupingExample {
      @Test(groups= {"Apple"})
      public static void Apple() {
	 System.out.println("This is first test case in Apple");
}
      @Test(groups= {"Apple"})
      public static void Apple1() {
	 System.out.println("This is second test case in Apple");
}
      
      @Test(groups= {"Vivo"})
      public static void Vivo() {
      System.out.println("This is first test case in Vivo");
	
}
      @Test(groups= {"Vivo"})
      public static void Vivo1() {
      System.out.println("This is second test case in Vivo");
	
}
      @Test(groups= {"Samsung"})
      public static void Samsung() {
      System.out.println("This is first test case in Samsung");
	
}
      @Test(groups= {"Samsung"})
      public static void Samsung1() {
      System.out.println("This is second test case in Samsung");
	
}

      @Test(groups= {"OnePlus"})
      public static void OnePlus() {
      System.out.println("This is first test case in Oneplus");
	
}
      @Test(groups= {"OnePlus"})
      public static void OnePlus1() {
      System.out.println("This is second test case in Oneplus");
	
}
      
      @Test(groups= {"Moto"})
      public static void Moto() {
      System.out.println("This is first test case in moto");
	
}
      @Test(groups= {"Moto"})
      public static void Moto1() {
      System.out.println("This is second test case in moto");
	
}
}
