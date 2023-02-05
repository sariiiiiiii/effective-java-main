package me.whiteship.chapter01.item01;

import java.util.EnumSet;
import java.util.Set;

public class Product {

    public static void main(String[] args) {

        /**
         * 정적 팩토리 메서드를 이용해서 객체를 생성하면은 같은 인스턴스가 생성되는 것을 볼 수가 있다
         * 객체가 생성되는 것을 팩토리 내부에서 자기자신이 컨트롤 하겠다는 의미가 된다
         * 미리 생성된 인스턴스를 가져올 수는 있지만 생성하는 것은 아님
         */


        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1); // me.whiteship.chapter01.item01.Settings@dfd3711
        System.out.println(settings2); // me.whiteship.chapter01.item01.Settings@dfd3711

        Boolean.valueOf(false);
        EnumSet.allOf(Difficulty.class);
    }
}
