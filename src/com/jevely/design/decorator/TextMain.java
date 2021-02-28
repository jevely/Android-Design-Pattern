package com.jevely.design.decorator;

import com.jevely.design.decorator.decorator.Fruit;
import com.jevely.design.decorator.decorator.Sugar;

/**
 * 装饰者模式
 *
 * 饮品为主体，糖，水果为装饰品。
 * 主体有很多种，每一种都可以加糖和水果。
 * 以后如果相加其他的装饰者，不用修改原有的代码，直接加入新的类就可以。
 */
public class TextMain {

    public static void main(String[] args) {
        Drinks drinks = new FruitDrinks();
        drinks = new Sugar(drinks);
        drinks = new Fruit(drinks);
        drinks.showContent();
    }

}
