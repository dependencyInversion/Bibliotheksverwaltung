import java.util.GregorianCalendar;


public class DVD extends Medium {
	private int laufzeit;
	
	public DVD(
			int mediumnummer,
			String titel,
			String isbn,
			String verlag,
			boolean ausgeliehen,
			GregorianCalendar rueckgabedatum,
			int laufzeit) {
		super(
				mediumnummer,
				titel,
				isbn,
				verlag,
				ausgeliehen,
				rueckgabedatum);
		this.laufzeit = laufzeit;
	}
	
	public String toString() {
		return this.toString();
	}
}
