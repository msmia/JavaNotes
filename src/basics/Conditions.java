package basics;

public class Conditions {

	public static void main(String[] args) {

		/*
		 * find 10 random numbers between 1 to 30 if the number is between 1 to 12, boy
		 * if the number is between 13 to 18, teen if the number is greater than 18,
		 * adult else you don't fit any category
		 */

		int min = 1;
		int max = 30;
		int range = max - min + 1;
		int rand = 0;

		for (int i = 0; i < 10; i++) {
			rand = (int) (Math.random() * range) + min;
			if (rand >= 1 && rand <= 12) {
				System.out.println("age: " + rand + ". You're a boy.");
			} else if (rand >= 13 && rand <= 18) {
				System.out.println("age: " + rand + ". You're a teen.");
			} else if (rand >= 19 && rand <= 30) {
				System.out.println("age: " + rand + ". You're an adult.");
			} else {
				System.out.println("age: " + rand + ". You don't fit any category.");
			}
		}

	}
}
