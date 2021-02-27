package com.jevely.design.decorator


/**
 * 所以饮品基类
 */
abstract class Drinks {

    abstract fun setDescribe(): String

    abstract fun cost(): Int

    fun showContent() {
        System.out.println("${setDescribe()}的价钱为:${cost()}")
    }

}