//Get Metodu
import java.util.*;

public class test {
   public static void main(String[] args) {
      
    ArrayList<String> renkler = new ArrayList<String>(5);

    // Listeye eleman eklemek için add() metodunu kullandım
    renkler.add("Beyaz");
    renkler.add("Siyah");
    renkler.add("Kırmızı");
    renkler.add("Turkuaz");
	  renkler.add("Sarı");
	    
	// ArrayList'teki renkleri yazdırıyorum
    for (int i = 0; i < 5; i++)
      {
         System.out.println(renkler.get(i).toString());
      }
  }
}