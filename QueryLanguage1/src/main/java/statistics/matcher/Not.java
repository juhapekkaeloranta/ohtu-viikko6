package statistics.matcher;

import statistics.Player;

/**
 *
 * @author juhapekm
 */
public class Not implements Matcher {

    private Matcher matcher;

    public Not(Matcher matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matches(Player p) {
        if (matcher.matches(p)) {
            return false;
        } else {
            return true;
        }
    }
}
