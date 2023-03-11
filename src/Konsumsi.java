public class Konsumsi <M, I>{
    private M m;
    private I i;

    public I getI() {
        return i;
    }

    public M getM() {
        return m;
    }

    public void setKonsumsi(M makanan, I minuman){
     this.m = makanan;
     this.i = minuman;
    }
}
