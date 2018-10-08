package design.decorator;
/**
 * @Auther: ltc
 * @Date: 2018/10/8 22:00
 * @Description: 装饰模式（Decorator）
 */

/**
 * 给一类对象增加新的功能，装饰方法与具体的内部逻辑无关
 */
interface Source {
    void method();
}

public class Decorator implements Source {

    private Source source;

    public void decotate1() {
        System.out.println("decorate");
    }

    @Override
    public void method() {
        decotate1();
        source.method();
    }
}
