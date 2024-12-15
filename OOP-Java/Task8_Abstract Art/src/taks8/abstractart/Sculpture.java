package taks8.abstractart;

public class Sculpture extends ArtParent {

	String material;

	public Sculpture(String title, String author, String description,String material) {
		super(title, author, description);
		this.material=material;		
	}

	 @Override
	    void viewArt() {
	        System.out.println("Sculpture Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Description: " + description);
	        System.out.println("Material: " + material);
	        System.out.println("-----------------------------------");
	    }

}
