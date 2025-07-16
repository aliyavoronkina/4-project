public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPerRub = 20; // 1 миля за каждые 20 рублей
        int miles = ticketPrice / milesPerRub; // целочисленное деление
        return miles;
    }
}