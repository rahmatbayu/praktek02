
package praktek02;

public class balokaksi {
    public static void main(String[] args) {
        balok b1 = new balok();
        b1.panjang = 12;
        b1.lebar = 8;
        b1.tinggi = 6;
        
        b1.cetakinfo();
        System.out.println("volume balok ="+b1.hitungvolume());
        b1.cetakvolume();
    }
    
  
    
}
