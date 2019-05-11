package racingcar.domain.rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranks {
    private final List<Rank> ranks;

    public Ranks() {
        this.ranks = new ArrayList<>();
    }

    public void add(Rank rank) {
        this.ranks.add(rank);
    }

    public List<Rank> getResults() {
        return Collections.unmodifiableList(ranks);
    }

    public List<String> findWinners() {
        int lastStep = ranks.size() - 1;
        return ranks.get(lastStep).findWinners();
    }
}
