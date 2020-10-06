package stringtest;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "Tapan Kumar Parida";
		String[] words = line.split(" ");
		String reverseWord = "";
		for (int i = words.length - 1; i >= 0; i--) {

			reverseWord = reverseWord +" "+words[i];

		}
		System.out.println(reverseWord);
	}
	

}
