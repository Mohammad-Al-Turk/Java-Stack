package task5.zoo.keeper;


public class Mammal {

	private int energyLevel;

	public Mammal() {
		this.setEnergyLevel(100);
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}

}
