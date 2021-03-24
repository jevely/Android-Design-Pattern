package com.jevely.design.factory;

/**
 * 工厂模式
 *
 * 首先是有一个卖鱼的店，在两个地方开了分店，一个是四川{@link com.jevely.design.factory.SichuanFishStore SichuanFishStore}，
 * 一个是重庆{@link com.jevely.design.factory.ChongqinFishStore ChongqinFishStore}
 *
 * 两家店只有处理鱼的方式不一样，其他工序都是一样的，所以建造一个处理鱼的工厂，工厂再根据不同的地方有自己不同的处理方式。
 *
 * 在处理鱼的时候会有不同的佐料，而佐料根据地方的不同也会有不同，所以用抽象功能的方法来构造佐料的制作工厂。
 *
 * 这样不同的佐料也可以用于不同的工厂，佐料的改变不会影响处理鱼工厂的生产。
 *
 * 如果要新增一家店，只需要新增一个处理鱼方式的工厂就可以来。不会影响现有的代码。如果新增的工厂不需要新的处理鱼的方式，那么直接用现有的处理鱼的
 * 工厂就可以来。
 */
public class TestMain {

    public static void main(String[] args) {


        FishStore fishStory = new ChongqinFishStore();
        fishStory.getRoastFish();
    }

}
