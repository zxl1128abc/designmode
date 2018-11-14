package com.ziroom.decoratemode;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author zhangxiuli
 * @version 1.0
 * @date 2018/11/7 15:02
 * @since 1.0
 */
public class Person {

    /**
     * 姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public void wearTShirts(){
        System.out.println("穿T恤");
    }

    public void wearBigTrouser(){
        System.out.println("穿垮裤");
    }
    public void wearSneakers(){
        System.out.println("破球鞋");
    }
    public void wearSuit(){
        System.out.println("西装");
    }
    public void wearTie(){
        System.out.println("领带");
    }
    public void wearLeatherShoes(){
        System.out.println("皮鞋");
    }*/
    public void show(){
        System.out.println("装扮的"+name);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
