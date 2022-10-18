package kedua;

import java.util.Scanner;

public class Data extends awaldata {
    private String nama;
    private String alamat;
    private long nohp;
    private int pilih;
    private int tgl;
    int harga;

    Scanner input = new Scanner(System.in);

    @Override
    public void data() {
        System.out.println("--------Masukkan Data Anda--------");
        System.out.print("MMasukkan Nama Anda      : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda     : ");
        alamat = input.nextLine();
        System.out.print("Masukkan No. HP Anda     : ");
        nohp = input.nextLong();
        System.out.print("Masukkan Pilihan Kamar   : ");
        pilih = input.nextInt();
        System.out.print("Tanggal Masuk            : ");
        tgl = input.nextInt();
        
    }

    @Override
    public void harga() {
        switch (pilih){
            case 1:
                harga = 1300000;
                System.out.println("Fasilitas Kamar             : AC + Kamar Mandi Dalam");
                System.out.println("Harga Kamar                 :" + harga);
                System.out.println("Pembayaran Setiap Tanggal   :" + tgl);
                break;
            case 2:
                harga = 1000000;
                System.out.println("Fasilitas Kamar             : AC + Kamar Mandi Luar");
                System.out.println("Harga Kamar                 :" + harga);
                System.out.println("Pembayaran Setiap Tanggal   :" + tgl);
                break;
            case 3:
                harga = 600000;
                System.out.println("Fasilitas Kamar             : Non AC + Kamar Mandi Dalam");
                System.out.println("Harga Kamar                 :" + harga);
                System.out.println("Pembayaran Setiap Tanggal   :" + tgl);
                break;
            case 4:
                harga = 450000;
                System.out.println("Fasilitas Kamar             : Non AC + Kamar Mandi Luar");
                System.out.println("Harga Kamar                 :" + harga);
                System.out.println("Pembayaran Setiap Tanggal   :" + tgl);
                break;
            default:
                System.out.println("Maaf yang anda masukkan salah");
        }
        
    }

    @Override
    public void output() {
                System.out.println("--------Invoice Sewa Kamar Kos--------");
                System.out.println("Nama Penyewa                : " + nama);
                System.out.println("Alamat                      : " + alamat);
                System.out.println("No HP                       : " + nohp);
        harga();

        
    }


}