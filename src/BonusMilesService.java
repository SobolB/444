public class BonusMilesService {
    public int calculate(boolean counts, int count, int summ1, int min) {
        int summ2 = summ1 + count;
        int bonus = count / 100;
        int percent = counts ? bonus : summ2;
        int mill1 = percent + summ2;
        if (summ2 > min) {
        }
        else
        {
            mill1 = summ2;
        }
        return mill1;
    }
}
