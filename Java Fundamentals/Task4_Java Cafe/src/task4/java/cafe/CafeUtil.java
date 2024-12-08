package task4.java.cafe;
import java.util.ArrayList;

import java.util.Scanner;

public class CafeUtil {
	
	public int getStreakGoal() {
		int count = 0;
		for(int i = 10; i>0; i--) {
			count+=i;
		}
		return count;
	}
	/////////////////////////////////////////////////////////////
	public int getStreakGoal(int num) {
		int count = 0;
		for(int i = num; i>0; i--) {
			count+=i;
		}
		return count;
	}
	////////////////////////////////////////////////////////////
	public double getOrderTotal(double[] prices) {
		double total = 0;
		for(double i :prices ) {
			total+=i;
		}
		return total;
	}
//////////////////////////////////////////////////////////////////////

public void displayMenu(ArrayList<String> menuItems) {
	for (int i = 0; i < menuItems.size(); i++) {
        System.out.println(i+1 + " " + menuItems.get(i));
    }
		}
///////////////////////////////////////////////////////////////////////

public void addCustomer(ArrayList<String> customers) {

	    Scanner scanner = new Scanner(System.in); // إنشاء كائن Scanner
	    System.out.println("Enter your name please:");
	    String username = scanner.nextLine(); // قراءة الإدخال من المستخدم
	    System.out.println("Hello, " + username + "!");
	    int i = (Integer)customers.size()+1;
	    System.out.println("There are " + i+ " people in front of you.");
	    customers.add(username); // إضافة المستخدم إلى القائمة
	    System.out.println(customers);

}

}