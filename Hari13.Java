package Gajikaryawan;
public class Hitungaji {
    public static void main(String[] args) {
          int gajiPokok = 5000000;
        
        // Mendeklarasikan bonus dan mengubahnya (misalnya bonus adalah 500.000)
        byte bonus = 50;  // Bonus direpresentasikan sebagai kelipatan 10.000
        int bonusDalamRupiah = bonus * 10000;
        
        // Total gaji dihitung dengan menjumlahkan gaji pokok dan bonus
               int gajiTotal = gajiPokok + bonusDalamRupiah;
        
        // Mencetak hasil ke layar
        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Bonus: Rp " + bonusDalamRupiah);
        System.out.printf("Gaji total karyawan adalah: Rp " + gajiTotal);

    }
    
}
