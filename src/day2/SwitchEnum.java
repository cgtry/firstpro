package day2;

public class SwitchEnum {
	
	enum Choice { Choice1, Choice2, Choice3	}
	public static void main(String[] args) {
		Choice ch= Choice.Choice1;
		switch(ch) {
		case Choice1: System.out.println("selected choice1");
		break;
		case Choice2: System.out.println("selected choice2");
		break;
		case Choice3: System.out.println("selected choice3");
		break;
		}

	}

}
