package rotation;

public class rotationString {

	public static boolean isrotation(String ch,String ch1) {
		
		
		return (ch.length()==ch1.length()) && ((ch+ch1).indexOf(ch1)!=-1);
		
	}
	
public static void main(String[] args) {
	//abcdabcd
	//cdab
	
	String ch="abcd";
	
	String ch1="cdab";
	
	if (isrotation(ch, ch1)) {
		System.out.println("rotation is present");
	}
	else {
		System.out.println("rotation not found");
	}

}
}


