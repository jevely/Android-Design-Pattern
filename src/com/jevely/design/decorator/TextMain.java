package com.jevely.design.decorator;

import com.jevely.design.decorator.decorator.Sugar;

public class TextMain {

    public static void main(String[] args) {
        Drinks drinks = new FruitDrinks();
        drinks = new Sugar(drinks);
        drinks.showContent();
    }

}
