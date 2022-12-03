package singletonpattern.Task4;

public class MainGoogle {
	public static void main(String[] args) {
		GoogleHeadQuarters g1 = GoogleHeadQuarters.getGoogle();
		GoogleHeadQuarters g2 = GoogleHeadQuarters.getGoogle();
		GoogleHeadQuarters g3 = GoogleHeadQuarters.getGoogle();
		GoogleHeadQuarters g4 = GoogleHeadQuarters.getGoogle();
		GoogleHeadQuarters g5 = GoogleHeadQuarters.getGoogle();
		GoogleHeadQuarters g6 = GoogleHeadQuarters.getGoogle();

		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.out.println(g3.hashCode());
		System.out.println(g4.hashCode());
		System.out.println(g5.hashCode());
		System.out.println(g6.hashCode());

	}

}
