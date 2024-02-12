package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

                               //instanciation dynamique
public class presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/config.txt"));
        String DaoClassName = scanner.nextLine();// Connait le nom de la class
        Class cDao = Class.forName(DaoClassName);//charger la classe a la memoire
        IDao dao = (IDao) cDao.newInstance();//instancier la classe

        String MetierClassName = scanner.nextLine();
        Class cMetier = Class.forName(MetierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setIdao",IDao.class);
        method.invoke(metier,dao); // == metier.setIdao(dao);
        System.out.println(metier.calcule());
    }
}
