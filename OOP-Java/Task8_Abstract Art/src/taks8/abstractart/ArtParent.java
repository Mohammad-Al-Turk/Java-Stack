package taks8.abstractart;

abstract class ArtParent {
String title;
String author;
String description;

public ArtParent(String title,String author,String description) {
	this.title=title;
	this.author=author;
	this.description=description;	
}

abstract void viewArt();

}
