import java.util.List;
import java.util.stream.Stream;


public class JavaPractice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 long d= Stream.of("Abhilas", "Bhindura", "Animgos", "papalo").filter(s->s.startsWith("A")).count();
		 System.out.println(d);

	}

}
