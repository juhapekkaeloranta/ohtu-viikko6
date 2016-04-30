package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

//        Matcher m = new And( new HasAtLeast(10, "goals"),
//                             new HasAtLeast(10, "assists"),
//                             new PlaysIn("PHI")
//        );
//        Matcher m = new Or(new PlaysIn("EDM"),
//            new PlaysIn("PHI")
//        );
        QueryBuilder query = new QueryBuilder();
//        
//        Matcher m = query.playsIn("NYR")
//                     .hasAtLeast(10, "goals")
//                     .hasFewerThan(25, "assists").build();
//

        Matcher m1 = query.playsIn("PHI").build();

        Matcher m2 = query.playsIn("EDM").build();

        Matcher m = query.oneOf(m1, m2).build();
        
        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
        
    }
}
