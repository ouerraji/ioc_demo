package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("la nouvelle version de Dao");
        double temp=56;
        return temp;
    }
}
