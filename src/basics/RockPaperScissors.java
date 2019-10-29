package basics;

import java.util.HashMap;

public class RockPaperScissors {

	public static void main(String[] args) {

		HashMap<Integer, String> rps = new HashMap<Integer, String>();

		rps.put(0, "rock");
		rps.put(1, "paper");
		rps.put(2, "scissor");

		String val1 = rps.get(getRandom());
		String val2 = rps.get(getRandom());

		System.out.println(getResult(val1, val2));

	}

	/**
	 * Returns a random number between 0-2
	 * 
	 * @return int
	 */
	public static int getRandom() {
		int rand = (int) (Math.random() * (3 - 0)) + 0;
		return rand;
	}

	/**
	 * This method will determine who wins, rock, paper, or scissor
	 * 
	 * @param val1
	 * @param val2
	 * @return String winner or draw
	 */
	public static String getResult(String val1, String val2) {

		String winner = "";

		if (val1 == val2) {
			winner = "rerun";
		} else if (val1 == "rock" && val2 == "paper") {
			winner = val2 + " wins.";
		} else if (val1 == "rock" && val2 == "scissor") {
			winner = val1 + " wins.";
		} else if (val1 == "paper" && val2 == "rock") {
			winner = val1 + " wins.";
		} else if (val1 == "paper" && val2 == "scissor") {
			winner = val2 + " wins.";
		} else if (val1 == "scissor" && val2 == "rock") {
			winner = val2 + " wins.";
		} else if (val1 == "scissor" && val2 == "paper") {
			winner = val2 + " wins.";
		}

		return "User1 = " + val1 + "\nUser2 = " + val2 + "\n" + winner;

	}

}