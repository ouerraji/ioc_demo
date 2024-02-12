package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao idao;// couplage faible
    @Override
    public double calcule() {
        double temp=idao.getData();
        double resultat=temp*540/Math.cos(temp*Math.PI);
        return resultat;
    }


    /*
    injecter dans la variable dao un objet d'une class qui implement l'interface IDao
   */
    public void setIdao(IDao idao) {
        this.idao = idao;
    }
}
