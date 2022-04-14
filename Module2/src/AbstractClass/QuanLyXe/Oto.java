package AbstractClass.QuanLyXe;

public class Oto extends PhuongTien {
    private int soChoNgoi;

    public Oto() {

    }

    public Oto(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public Oto(String hang, String mau, String ten, int gia, int soChoNgoi) {
        super(hang, mau, ten, gia);
        this.soChoNgoi = soChoNgoi;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String toString() {
        return "ten: " + getTen()  + ", mau: " + getMau() +
                ", hang: " + getHang() + ", so cho ngoi: " + getSoChoNgoi() +
                ", gia: " + getGia();
    }


}
