package AbstractClass.QuanLyXe;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay>{
    private XeMay[] danhSach = new XeMay[5];
    private XeMay[] danhsach2;
    private int size = 0;
    @Override
    public void them(String name, XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }



    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;


    }

    @Override
    public void xoa(String name) {
        danhsach2 = new XeMay[size-1];
        int count = timKiem(name);
        for (int i = 0; i < count; i++) {
            danhsach2[i] = danhSach[i];
        }
        for (int i = count; i < danhsach2.length; i++) {
            danhsach2[i] = danhSach[i+1];

        }

    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;

    }


    @Override
    public void sapXep() {
        Arrays.sort(danhSach);

    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("----------------------------");
    }
    public void hienThi2() {
        for (int i = 0; i < danhsach2.length; i++) {
            System.out.println(danhsach2[i]);
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xe1 = new XeMay("Honda","pink" , "dream", 20000000, 97 );
        XeMay xe2 = new XeMay("Honda","yellow" , "cup", 50000000, 97 );
        XeMay xe3 = new XeMay("Honda","blue" , "ab", 70000000, 150 );
        XeMay xe4 = new XeMay("Honda","green" , "sh", 80000000, 150 );
        XeMay xe5 = new XeMay("Honda","black" , "lenovo", 90000000, 150 );
        ql.them(xe1.getTen(), xe1);
        ql.them(xe1.getTen(), xe2);
        ql.them(xe1.getTen(), xe3);
        ql.them(xe1.getTen(), xe4);
        ql.them(xe1.getTen(), xe5);
        ql.hienThi();
        System.out.println(ql.timKiem("sh"));
        ql.hienThi();
        ql.sapXep();
        ql.hienThi();
        System.out.println("xoa");
        ql.xoa("dream");
        ql.hienThi2();

    }

}
