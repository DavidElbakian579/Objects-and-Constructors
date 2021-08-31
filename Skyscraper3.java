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
public class Skyscraper3 {
    /*
    Построим новый бизнес-комплекс JavaRush Business Center
    Давай построим бизнес-центр, который состоит из двух зданий, 
    один из которых только начинаем строить, а второй — на этапе планирования, поэтому о нем мало что известно.
    Тебе нужно будет создать два конструктора: один с параметрами, второй — без. Они оба должны инициализировать поля floorsCount и developer.
    */
    
    private int floorsCount;
    private String developer;

    public Skyscraper3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper3(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void start() {
        Skyscraper3 skyscraper = new Skyscraper3();
        Skyscraper3 skyscraperUnknown = new Skyscraper3(50, "Неизвестно");
    }
}
