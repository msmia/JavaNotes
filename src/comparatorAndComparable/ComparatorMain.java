package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {

		List<Player> bb = new ArrayList<Player>();
		
		PlayerNameComp pnc = new PlayerNameComp();
		PlayerRankingComp prc = new PlayerRankingComp();
		
		Player p1 = new Player(1, "a", 31);
		Player p2 = new Player(2, "c", 20);
		Player p3 = new Player(3, "e", 40);
		Player p4 = new Player(6, "f", 35);
		Player p5 = new Player(5, "d", 40);
		Player p6 = new Player(4, "b", 50);
		
		bb.add(p1);
		bb.add(p2);
		bb.add(p3);
		bb.add(p4);
		bb.add(p5);
		bb.add(p6);
		
		for (int i=0;i<bb.size();i++) {
			System.out.println(bb.get(i).getName());
		}
		

		Collections.sort(bb, pnc);
		System.out.println("===");


		for (int i=0;i<bb.size();i++) {
			System.out.println(bb.get(i).getName());
		}
		
		Collections.sort(bb, prc);
		System.out.println("===");
		
		for (int i=0;i<bb.size();i++) {
			System.out.println(bb.get(i).getName());
		}
		
	}

}
