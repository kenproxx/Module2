package AbstractClass.QuanLyXe;

public class QuanLyOto implements QuanLy<Oto> {
    private Oto[] danhSachOto = new Oto[5];
    private int size = 0;

    @Override
    public void them(String name, Oto oto) {
        danhSachOto[size] = oto;
        size++;

    }

    @Override
    public void sua(String name, Oto oto) {
        danhSachOto[timKiem(name)] = oto;

    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (danhSachOto[i].getTen() == name) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {

    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSachOto[i]);
        }
        System.out.println("-------------------------------");

    }
}

class ChayThu {
    public static void main(String[] args) {
        Oto oto1 = new Oto("honda", "white", "civic", 350, 5);
        Oto oto2 = new Oto("toyota", "white", "fortuner", 500, 7);
        Oto oto3 = new Oto("mazda", "white", "mazda3", 700, 7);
        QuanLyOto qlot = new QuanLyOto();
        qlot.them("civic", oto1);
        qlot.them("fortuner", oto2);
        qlot.hienThi();
        System.out.println(qlot.timKiem("civic"));
        qlot.sua("civic", oto3);
        qlot.hienThi();
    }
}
