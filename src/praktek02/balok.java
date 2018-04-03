
package praktek02;

public class balok {
    double panjang;
    double lebar;
    double tinggi;

    public balok() {
        panjang=4;
        lebar=6;
        tinggi=8;
    }
    
    void cetakinfo(){
        System.out.println("================");
        System.out.println("panjang :"+panjang);
        System.out.println("lebar :"+lebar);
        System.out.println("tinggi:"+tinggi);
        System.out.println("================");
        }
    
    double hitungvolume(){
        double volume;
        volume = panjang*lebar*tinggi;
        return volume;
    }
    void cetakvolume(){
        System.out.println("volumenya adalah:"+hitungvolume());
    }
}
