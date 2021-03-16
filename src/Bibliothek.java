import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;


public class Bibliothek {
	private static final Bibliothek bibliothek = new Bibliothek();
	private Vector vc;
	
	private Bibliothek() {
		vc = new Vector();
	}
	
	public Bibliothek getBibliothek() { return this.bibliothek; }
	
	public void addMedium(Medium m) {
		this.vc.addElement(m);
	}
	
	public void removeMedium(Medium m) {
		this.vc.removeElement(m);
	}
	
	public void showAll() {
		this.vc.toString();
	}
	
	public void safeToFile() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("Medien.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(vc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void loadFromFile() {
		
	}
}
