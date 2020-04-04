package Animal;

abstract public class Animal {
    private String ten;
    private int tuoi;
    private String moTa;

    public Animal(){

    }
    public Animal(String Ten){
        this.ten = Ten;
    }
    public Animal(String Ten, int Tuoi){
        this.ten = Ten;
        this.tuoi = Tuoi;
    }
    public Animal(String Ten, int Tuoi, String MoTa){
        this.ten = Ten;
        this.tuoi = Tuoi;
        this.moTa = MoTa;
    }
    //setter abd getter


    public void ThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Mo ta: " + moTa);
    }

    void Add(String Ten){
        this.ten = Ten;
    }

    void Add(String ten, int tuoi) {
        this.ten= ten;
        this.tuoi = tuoi;
    }

    void Add(String ten, int tuoi, String moTa) {
        this.ten= ten;
        this.tuoi = tuoi;
        this.moTa = moTa;
    }


}
