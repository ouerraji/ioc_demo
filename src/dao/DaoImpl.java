package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        se connecter a la base donnes pour recuperer la tempurature
        */

        double temp=Math.random()*40;
        return temp;
    }
}
