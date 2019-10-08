
public class SingleRowKeyboard {
	public int calculateTime(String keyboard, String word) {
		int time = 0;
		int current = 0;
		for(char c :word.toCharArray()){
			
			time+=Math.abs(keyboard.indexOf(c)-current);
			current = keyboard.indexOf(c);
		}
        return time;
    }
}
