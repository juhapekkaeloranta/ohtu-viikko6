package statistics.matcher;

/**
 *
 * @author juhapekm
 */
public class QueryBuilder {
    Matcher matcher;

    public QueryBuilder() {
        this.matcher = emptyMatcher();
    }
    
    public Matcher emptyMatcher() {
        return new HasAtLeast(0, "goals"); //"empty" matcher
    }
    
    public QueryBuilder playsIn(String team) {
        this.matcher = new And(this.matcher, new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int count, String ofWhat) {
        this.matcher = new And(this.matcher,new HasFewerThan(count, ofWhat));
        return this;
    }
    
    public QueryBuilder hasAtLeast(int count, String ofWhat) {
        this.matcher = new And(this.matcher, new HasAtLeast(count, ofWhat));
        return this;
    }
    
    public QueryBuilder oneOf(Matcher m1, Matcher m2) {
        this.matcher = new Or(m1, m2);
        return this;
    }
    
    public Matcher build() {
        Matcher m = this.matcher;
        this.matcher = emptyMatcher();
        return m;
    }
}
