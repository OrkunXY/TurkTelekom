public class PointGuard extends Guard{
    private int yaraticilik;

    public PointGuard(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo, int yaraticilik) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
        this.yaraticilik = yaraticilik;
    }

    public PointGuard(String ad, double boy, int formaNo) {
        super(ad, boy,formaNo);
    }



}
