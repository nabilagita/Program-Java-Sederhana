package terakhir;
import awal.*;
import kedua.*;

public class main {
    public static void main(String[] args) throws Exception {
        daftarharga list = new daftarharga();
        Data data = new Data();
        System.out.println("+------------------------------------------------------+");
        System.out.println("I                       SEWA KOS                       ");
        System.out.println("+------------------------------------------------------+");
        list.daftar();
        data.data();
        data.output();
        System.out.println("------------------------------------------------------");
        System.out.println("                      THANK YOUU                      ");
    }
}
