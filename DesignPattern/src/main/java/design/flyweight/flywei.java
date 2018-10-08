package design.flyweight;

import java.util.HashMap;
/**
 * @Auther: ltc
 * @Date: 2018/10/8 22:25
 * @Description: 享元模式（Flyweight）
 */

/**
 * 使用共享对象的方法，用来尽可能减少内存使用量以及分享资讯。通常使用工厂类辅助，
 * 例子中使用一个HashMap类进行辅助判断，数据池中是否已经有了目标实例，如果有，则直接返回，不需要多次创建重复实例。
 */
abstract class flywei{ }

class Flyweight extends flywei{
    Object obj ;
    public Flyweight(Object obj){
        this.obj = obj;
    }
}

class  FlyweightFactory{
    private HashMap<Object,Flyweight> data;

    public FlyweightFactory(){ data = new HashMap<>();}

    public Flyweight getFlyweight(Object object){
        if ( data.containsKey(object)){
            return data.get(object);
        }else {
            Flyweight flyweight = new Flyweight(object);
            data.put(object,flyweight);
            return flyweight;
        }
    }
}
