package singletonpattern.Task5;

public class MainGoogle {

	public static void main(String[] args) {

		GoogleHeadQuarter2 g1 = GoogleHeadQuarter2.getGoogle();
		GoogleHeadQuarter2 g2 = GoogleHeadQuarter2.getGoogle();
		GoogleHeadQuarter2 g3 = GoogleHeadQuarter2.getGoogle();
		GoogleHeadQuarter2 g4 = GoogleHeadQuarter2.getGoogle();
		GoogleHeadQuarter2 g5 = GoogleHeadQuarter2.getGoogle();
		GoogleHeadQuarter2 g6 = GoogleHeadQuarter2.getGoogle();

		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.out.println(g3.hashCode());
		System.out.println(g4.hashCode());
		System.out.println(g5.hashCode());
		System.out.println(g6.hashCode());
	}

}
