package me.whiteship.chapter01.item01;

import java.lang.reflect.InvocationTargetException;

public class HelloServiceFactory {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
//        Optional<HelloService> helloServiceOptional = loader.findFirst();
//        helloServiceOptional.ifPresent(h -> {
//            System.out.println(h.hello());
//        });
//
//        HelloService helloService = new ChineseHelloService();
//        System.out.println(helloService.hello());

//        Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService");
//        Constructor<?> constructor = aClass.getConstructor();
//        HelloService helloService = (HelloService) constructor.newInstance();
//        System.out.println(helloService.hello());
    }

}
