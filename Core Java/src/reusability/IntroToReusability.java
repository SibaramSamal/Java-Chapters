package reusability;
class Sony{
	
	int level = 80;
	void playMusic() {
		System.out.println("Playing HD audio level: "+level);
	}
}
class Boat{
	//Let we want to use sony music system in boat products, we have to achieve - " Boat has Sony's music  system "
	//if we want to use Sony class properties, we have to access them through it's object in this class.
	Sony obj = new Sony(); // this total line is "Association"
	// Sony obj; <- this line is "aggregation"
	// obj = new Sony(); <- this line is composition
	
	Boat(){
		obj.playMusic();
	}
}
public class IntroToReusability {

	public static void main(String[] args) {
		Boat b = new Boat();
	}
}
