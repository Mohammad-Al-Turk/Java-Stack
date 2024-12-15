package task7.care.soft.Interfaces;

public class CareSoftTest {
    public static void main(String[] args) {
        // Test Physician
        Physician physician = new Physician(1234);
        System.out.println("Physician Assign PIN: " + physician.setAssignPIN(1234)); // true
        System.out.println("Physician Access Authorized: " + physician.setaccessAuthorized(1234)); // true
        System.out.println("Physician Access Unauthorized: " + physician.setaccessAuthorized(5678)); // false
        System.out.println("---------------------------------");
        // Test AdminUser
        AdminUser admin = new AdminUser(9876);
        System.out.println("Admin Assign PIN: " + admin.setAssignPIN(123456)); // true
        System.out.println("Admin Access Authorized: " + admin.setaccessAuthorized(9876)); // true
        System.out.println("Admin Access Unauthorized: " + admin.setaccessAuthorized(1234)); // false
        System.out.println("---------------------------------");
        // Report Security Incidents
        System.out.println("Security Incidents: " + admin.reportSecurityIncidents());
    }
}