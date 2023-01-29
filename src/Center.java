public class Center extends Oyuncu{

    private int topSurme;
    private int slamDunk;
    private int alleyHoop;

    public Center(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo, int topSurme, int slamDunk, int alleyHoop) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
        this.topSurme = 60 + getRandom().nextInt(40);;
        this.slamDunk = 80 + getRandom().nextInt(20);;
        this.alleyHoop = 60 + getRandom().nextInt(40);;
    }

    public Center(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
    }
    public Center(String ad, double boy, int formaNo) {
        super(ad, boy,formaNo);
    }
}
