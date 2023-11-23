public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int bonus;
        if (ticketPrice >= 20) {
            bonus = ticketPrice / 20;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}

