public class Pivot extends Oyuncu{

    private int rebound;
    private int slamDunk;

    public Pivot(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo, int rebound, int slamDunk) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
        this.rebound = 40 + getRandom().nextInt(40);
        this.slamDunk = 20 + getRandom().nextInt(40);
    }


    public Pivot(String ad, double boy, int formaNo) {
        super(ad, boy,formaNo);
    }
}
