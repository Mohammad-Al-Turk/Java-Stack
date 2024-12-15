package taks8.abstractart;

public class Painting extends ArtParent{

	String paintType;
	
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	
	

	@Override
	void viewArt() {
		System.out.println("Painting Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Paint Type: " + paintType);
        System.out.println("-----------------------------------");	
		
	}

}
