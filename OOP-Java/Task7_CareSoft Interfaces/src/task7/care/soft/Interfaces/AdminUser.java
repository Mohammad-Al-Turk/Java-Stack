package task7.care.soft.Interfaces;

import java.util.ArrayList;

public class AdminUser implements HIPAACompliantAdmin,HIPAACompliantUser{
	private int pin;
	private Integer idAuth;
	private ArrayList<String> reportSecurityIncidents;
	
	public AdminUser() {}
	
	public AdminUser( Integer id) {
		this.idAuth =id;
		this.reportSecurityIncidents = new ArrayList<String>();
	}
	
	
	
	
	@Override
	public boolean setAssignPIN(int pin) {
		if (String.valueOf(pin).length() == 6) {
            this.pin = pin;
            return true;
        }
        return false;
	}
	
	
	@Override
	public boolean setaccessAuthorized(Integer id) {
		if (!this.idAuth.equals(id)) {
            this.authIncident("Unauthorized access attempt by ID: " + id);
            return false;
        }
        return true;
    }
	
	
	
	
	@Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.reportSecurityIncidents;
    }

    private void authIncident(String message) {
        this.reportSecurityIncidents.add(message);
    }
	
	
}
	