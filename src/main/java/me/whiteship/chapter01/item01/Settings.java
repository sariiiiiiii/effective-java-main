package me.whiteship.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {} // 외부 호출 막기

    private static final Settings SETTINGS = new Settings(); // 미리 만들어 놓은 다음에

    // 정적 팩토리 메서드 제공
    public static Settings getInstance() {
        return SETTINGS; // 미리 만들어 놓은 인스턴스를 리턴하게 됨
    }

    public static void main(String[] args) {

        /**
         * main 메서드를 보면 매번 다른 인스턴스를 만드는것을 볼 수 있다
         * 경우에 따라서 인스턴스를 매번 만들지 아니면 특정한 경우에만 만들지 등등은 우리가 인스턴스를 만드는 방법을 통제할 필요가 있다
         * 하지만 생성자를 통해서 인스턴스를 만드는 방법은 통제가 불가능하다
         *   - 무슨 뜻이냐면 어디서든 생성자 메서드를 통해서 인스턴스를 만들 수 있다는 뜻이 됨
         * 만약에 우리가 한개만 만든다 하면은 정적 팩토리 메서드를 통해서 만들 수 있다
         */

        System.out.println(new Settings()); // me.whiteship.chapter01.item01.Settings@dfd3711
        System.out.println(new Settings()); // me.whiteship.chapter01.item01.Settings@42d3bd8b
        System.out.println(new Settings()); // me.whiteship.chapter01.item01.Settings@26ba2a48
    }

}
