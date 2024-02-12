package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        //DaoImpl dao=new DaoImpl();
        /*
        * injection des depandences en par instanciation statique ==> new
        */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setIdao(dao);
        System.out.println(metier.calcule());
    }
}
