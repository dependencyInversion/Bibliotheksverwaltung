import java.util.GregorianCalendar;

public abstract class Buch extends Medium {
	private int anzahlSeiten;
	private String author;
	
	public Buch(
			int mediumnummer,
			String titel,
			String isbn,
			String verlag,
			boolean ausgeliehen,
			GregorianCalendar rueckgabedatum,
			int anzahlSeiten,
			String author) {
		
		super(mediumnummer,
			  titel,
			  isbn,
			  verlag,
			  ausgeliehen,
			  rueckgabedatum);
		
		this.anzahlSeiten = anzahlSeiten;
		this.author = author;
	}
	
	public String toString() {
		return this.toString();
	}
}
