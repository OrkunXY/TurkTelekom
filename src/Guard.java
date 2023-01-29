public class Guard extends Oyuncu{
    private int dogruluk;
    private int dribbling;
    private int pas;
    private int ucluk;

    public Guard(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
    }

    public Guard(String ad, double boy, int ziplama, int sut, int dayaniklilik, int formaNo, int dogruluk, int dribbling, int pas, int ucluk) {
        super(ad, boy, ziplama, sut, dayaniklilik, formaNo);
        this.dogruluk = 60 + getRandom().nextInt(40);
        this.dribbling = 60 + getRandom().nextInt(40);
        this.pas = 60 + getRandom().nextInt(40);
        this.ucluk = 60 + getRandom().nextInt(40);
    }

    public Guard(String ad, double boy, int formaNo) {
        super(ad, boy,formaNo);
    }
}

