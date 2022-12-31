import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
        String Pemilihan="Y";
        boolean stop = true;
        int pilih, jmlhpaket, total, uang;
        int kembalian;
        String nama_pelanggan;
        System.out.println();
        System.out.println("     ~Selamat Datang di Rumah Makan Mitra~");
        System.out.println("==============================================");
        System.out.println("                MITRA CATERING ");
        System.out.println("            SEHAT, LEZAT DAN HEMAT");
        System.out.println("==============================================");
        System.out.println();
        System.out.print("Masukkan Nama Anda : ");
        nama_pelanggan=in.nextLine();
        System.out.println("Hallo " +nama_pelanggan+ "...");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Silakan pilih paket menu yang ada di bawah ini :");
        System.out.println("1. Paket Prasmanan");
        System.out.println("\t-> Menu\t\t: Nasi Putih, Aneka Sayuran, Ayam Goreng, Kakap Asam Manis, Kerupuk Udang, Pudding, Es Buah");
        System.out.println("\t-> Harga\t: Rp. 25.000,-");
        System.out.println("2. Paket Nasi Box");
        System.out.println("\t-> Menu\t\t: Nasi Putih, Capcay, Telur Balado, Lalapan, Kerupuk, Buah (Pisang), Air mineral");
        System.out.println("\t-> Harga\t: Rp. 20.000,-");
        System.out.println("3. Paket Ramadhan");
        System.out.println("\t-> Menu\t\t: Nasi Putih, Tumis Buncis, Ayam Rica, Sop Kimlo, Macaroni Scotell, Es Buah, Kolak, Air Mineral");
        System.out.println("\t-> Harga\t: Rp. 45.000,-");
        System.out.println("4. Paket Lebaran");
        System.out.println("\t-> Menu\t\t: Nasi Putih, Ketupat, Ayam Rica, Opor, Sambal Kentang, Rendang, Es Buah, Pudding");
        System.out.println("\t-> Harga\t: Rp. 70.000,-");
        System.out.println("5. Paket Snackbox");
        System.out.println("\t-> Menu\t\t: Lember, Risoles, Pastel, Pudding Jagung, Air Meneral");
        System.out.println("\t-> Harga\t: Rp. 15.000,-");
        System.out.println("6. Keluar");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Mohon masukkan angka sesuai dengan menu paket yang tersedia !");
        while (Pemilihan.equals("Y") && stop == true)
        {
            System.out.print("Pilih menu yang Anda inginkan : ");
            pilih = in.nextInt();
            switch (pilih){
                case 1 : {
                    pesanan s = new pesanan("1010", "Nasi Putih, Aneka Sayuran, Ayam Goreng, Kakap Asam Manis, Kerupuk Udang, Pudding, Es Buah", 50, 25000);
                    s.tampilpesanan();
                    System.out.print("Masukkan jumlah paket : ");
                    jmlhpaket = in.nextInt();
                    total = s.harga*jmlhpaket;
                    System.out.println("Total Biaya\t: "+total);
                    System.out.print("Total Uang\t: ");
                    uang = in.nextInt();
                    if(uang>=total){
                        kembalian = uang - total;
                        System.out.println("Kembalian Anda Rp. " +kembalian);
                        System.out.println("Terima Kasih");
                        System.out.print("Apakah Anda ingin menambah pesanan? (Y/N) ");
                        try {

                            Pemilihan = in2.readLine();
                        }catch (IOException e){
                            System.out.println("Anda salah pilih");
                        }
                        System.out.println();
                    }else {
                        System.out.println("Mohon maaf uang Anda tidak cukup!");
                        System.out.println("Silakan lakukan pemesanan kembali..");
                        System.out.println();
                    }
                    break;
                }
                case 2 : {
                    pesanan s = new pesanan("1011","Nasi Putih, Capcay, Telur Balado, Lalapan, Kerupuk, Buah (Pisang), Air mineral",100, 20000);
                    s.tampilpesanan();
                    System.out.print("Masukkan jumlah paket : ");
                    jmlhpaket = in.nextInt();
                    total = s.harga*jmlhpaket;
                    System.out.println("Total Biaya\t: "+total);
                    System.out.print("Total Uang\t: ");
                    uang = in.nextInt();
                    if(uang>=total){
                        kembalian = uang - total;
                        System.out.println("Kembalian Anda Rp. "+kembalian);
                        System.out.print("Apakah Anda ingin memesan kembali? (Y/N)");
                        try {
                            Pemilihan = in2.readLine();
                        }catch (IOException e){
                            System.out.println("Anda salah pilih");
                        }
                        System.out.println();
                    }else {
                        System.out.println("Mohon maaf uang Anda tidak cukup!");
                        System.out.println("Silakan lakukan pemesanan kembali..");
                        System.out.println();
                    }
                    break;
                }
                case 3 : {
                    pesanan s = new pesanan("1013","Nasi Putih, Tumis Buncis, Ayam Rica, Sop Kimlo, Macaroni Scotell, Es Buah, Kolak, Air Mineral",100, 45000);
                    s.tampilpesanan();
                    System.out.print("Masukkan jumlah paket : ");
                    jmlhpaket = in.nextInt();
                    total = s.harga*jmlhpaket;
                    System.out.println("Total Biaya\t: "+total);
                    System.out.print("Total Uang\t: ");
                    uang = in.nextInt();
                    if(uang>=total){
                        kembalian = uang - total;
                        System.out.println("Kembalian Anda Rp. "+kembalian);
                        System.out.print("Apakah Anda ingin memesan kembali? (Y/N)");
                        try {
                            Pemilihan = in2.readLine();
                        }catch (IOException e){
                            System.out.println("Anda salah pilih");
                        }
                        System.out.println();
                    }else {
                        System.out.println("Mohon maaf uang Anda tidak cukup!");
                        System.out.println("Silakan lakukan pemesanan kembali..");
                        System.out.println();
                    }
                    break;
                }
                case 4 : {
                    pesanan s = new pesanan("1014", "Nasi Putih, Ketupat, Ayam Rica, Opor, Sambal Kentang, Rendang, Es Buah, Pudding", 50, 70000);
                    s.tampilpesanan();
                    System.out.print("Masukkan jumlah paket : ");
                    jmlhpaket = in.nextInt();
                    total = s.harga*jmlhpaket;
                    System.out.println("Total Biaya\t: "+total);
                    System.out.print("Total Uang\t: ");
                    uang = in.nextInt();
                    if(uang>=total){
                        kembalian = uang - total;
                        System.out.println("Kembalian Anda " +kembalian);
                        System.out.print("Apakah Anda ingin menambah pesanan? (Y/N)");
                        try {
                            Pemilihan = in2.readLine();
                        }catch (IOException e){
                            System.out.println("Anda salah pilih");
                        }
                        System.out.println();
                    }else {
                        System.out.println("Mohon maaf uang Anda tidak cukup!");
                        System.out.println("Silakan lakukan pemesanan kembali..");
                        System.out.println();
                    }
                    break;
                }
                case 5 : {
                    pesanan s = new pesanan("1015", "Lember, Risoles, Pastel, Pudding Jagung, Air Meneral", 50, 15000);
                    s.tampilpesanan();
                    System.out.print("Masukkan jumlah paket : ");
                    jmlhpaket = in.nextInt();
                    total = s.harga*jmlhpaket;
                    System.out.println("Total biaya\t: "+total);
                    System.out.print("Total Uang\t: ");
                    uang = in.nextInt();
                    if(uang>=total){
                        kembalian = uang - total;
                        System.out.println("Kembalian Anda " +kembalian);
                        System.out.print("Apakah Anda ingin menambah pesanan? (Y/N)");
                        try {
                            Pemilihan = in2.readLine();
                        }catch (IOException e){
                            System.out.println("Anda salah pilih");
                        }
                        System.out.println();
                    }else {
                        System.out.println("Mohon maaf uang Anda tidak cukup!");
                        System.out.println("Silakan lakukan pemesanan kembali..");
                        System.out.println();
                    }
                    break;
                }
                default:{
                    stop = false;
                    break;

                }
            }
        }
        System.out.println();
        System.out.println("EXIT");
    }
}