public class pesanan {
    public Integer jmlhpaket, harga, total;
    public String id_pesanan, paket;

    public pesanan(String id_pesanan, String paket, Integer jmlhpaket, Integer harga){
        this.id_pesanan=id_pesanan;
        this.paket=paket;
        this.harga=harga;
        this.jmlhpaket=jmlhpaket;
        total=jmlhpaket*harga;
    }
    void tampilpesanan(){
        System.out.println("Anda memilih "+paket+ " dengan harga "+harga);
    }
}
