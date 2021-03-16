import java.util.GregorianCalendar;

public class Medium implements Ausleihe {
	private int mediumnummer;
	private String titel;
	private String isbn;
	private String verlag;
	private boolean ausgeliehen;
	private GregorianCalendar rueckgabedatum;
	
	public Medium(
			int mediumnummer,
			String titel,
			String isbn,
			String verlag,
			boolean ausgeliehen,
			GregorianCalendar rueckgabedatum) {
		this.mediumnummer = mediumnummer;
		this.titel = titel;
		this.isbn = isbn;
		this.verlag = verlag;
		this.ausgeliehen = ausgeliehen;
		this.rueckgabedatum = rueckgabedatum;
	}
	
	public GregorianCalendar getRuekgabeDatum() {
		return this.rueckgabedatum;
	}
	
	public String toString() {
		return this.toString();
	}
	
	public boolean isAusgeliehen() {
		return this.ausgeliehen;
	}
	
	public boolean ausleihen() {
		if(this.ausgeliehen) {
			return false;
		}
		
		this.rueckgabedatum = new GregorianCalendar();
		this.rueckgabedatum.add(this.rueckgabedatum.DAY_OF_MONTH, 28);
		this.ausgeliehen = true;
		
		return true;
	}
	
	public void zurueckgeben() {
		this.ausgeliehen = false;
	}
}
