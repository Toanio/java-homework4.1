public class BonusMilesService {
    public int calculate(int costTicket)
    {
        int oneBonus = 20;
        int personalBonus = costTicket / oneBonus;
        return personalBonus;

    }
}
