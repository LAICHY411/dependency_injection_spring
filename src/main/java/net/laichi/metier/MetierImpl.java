package net.laichi.metier;

import net.laichi.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*12*Math.PI/2 * Math.cos(t);
        return res;
    }
    // pour injecter dans l'attribut dao un objet d'une classe implement linterface idao
    //apres l'instanciation
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }
    // au moment de l'instanciation
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
}
