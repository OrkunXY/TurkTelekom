public class ShootingGuard extends Guard{

    private int topSurme;
    private int sans;

    public ShootingGuard(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo, int topSurme, int sans) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
        this.topSurme = 60 + getRandom().nextInt(40);;
        this.sans = 60 + getRandom().nextInt(40);;
    }


        public ShootingGuard(String ad, double boy, int formaNo) {
        super(ad, boy,formaNo);
    }
}
