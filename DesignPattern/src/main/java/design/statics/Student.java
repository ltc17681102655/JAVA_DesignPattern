package design.statics;

import org.junit.Test;

class Student {
    String name;

    //使用了static修饰country，那么这时候country就是一个共享的数据。
    static String country = "中国";    //国籍

    // 构造函数
    public Student(String name) {
        this.name = name;
    }
}

class Demo9 {
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        Student s2 = new Student("陈七");
        s1.country = "小日本";
        System.out.println("姓名：" + s1.name + " 国籍：" + s1.country);
        //  小日本
        System.out.println("姓名：" + s2.name + " 国籍：" + s2.country);
        // 小日本	}
    }


    /**
     * 如果代码中的static String  country 去掉static修饰，则最终s1.country="小日本"，s2.country="中国"
     */
}