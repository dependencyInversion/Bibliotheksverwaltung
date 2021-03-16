import java.util.GregorianCalendar;

public interface Ausleihe {
	public GregorianCalendar getRuekgabeDatum();
	public boolean isAusgeliehen();
	public boolean ausleihen();
	public void zurueckgeben();
}
