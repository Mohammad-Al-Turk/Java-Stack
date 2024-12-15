package task7.care.soft.Interfaces;

public class Physician implements HIPAACompliantUser{
	
	private int pin;
	private Integer physicianID;
	
	
	public Physician() {}
	public Physician(Integer id) {
		this.physicianID=id;
	}
	
	@Override
	public boolean setAssignPIN(int pin) {
		if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
            return true;
        }
        return false;
	}
	
	
	@Override
	public boolean setaccessAuthorized(Integer id) {
		return this.physicianID.equals(id);
	}
	
	
}
