package net.laichi.pres;

import net.laichi.dao.IDao;
import net.laichi.metier.IMetier;
import net.laichi.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String MetierClassName = sc.nextLine();
        Class cMetier = Class.forName(MetierClassName);
        //IMetier metier = (IMetier) cMetier.newInstance();
        //Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        //setDao.invoke(metier,d);
        System.out.println("res = ");
    }}