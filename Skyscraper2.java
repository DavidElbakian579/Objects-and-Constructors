/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro11l2;

/**
 *
 * @author David-pc
 */
public class Skyscraper2 {
    /*
    Построим новый жилой комплекс JavaRush Towers
    Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
    Объявляет о результате постройки.
    Объявляет о результате и указывает количество этажей.
    Объявляет о результате и указывает застройщика.
    Пример вывода:
    Небоскреб построен.
    Небоскреб построен. Количество этажей - 50
    Небоскреб построен. Застройщик - JavaRushDevelopment

    Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.    
    */
    
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper2() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper2(int floores) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floores);
    }

    public Skyscraper2(String floores) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + floores);
    }

    public static void start() {
        Skyscraper2 skyscraper = new Skyscraper2();
        Skyscraper2 skyscraperTower = new Skyscraper2(50);
        Skyscraper2 skyscraperSkyline = new Skyscraper2("JavaRushDevelopment");
    }
}
