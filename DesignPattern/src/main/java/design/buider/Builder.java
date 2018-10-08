package design.buider;

/**
 * @Auther: ltc
 * @Date: 2018/9/30 0:15
 * @Description: 建造者模式（Builder）
 */

/**
 * 在了解之前，先假设有一个问题，我们需要创建一个学生对象，属性有name,number,class,sex,age,school等属性，
 * 如果每一个属性都可以为空，也就是说我们可以只用一个name,也可以用一个school,name,或者一个class,number，或者其他任意的赋值来创建一个学生对象，这时该怎么构造？
 * 难道我们写6个1个输入的构造函数，15个2个输入的构造函数.......吗？这个时候就需要用到Builder模式了。
 */
public class Builder {

    static class Student {
        private String name;

        private Integer age;

        public Student() {
        }

        public Student name(String name) {
            this.name = name;
            return this;
        }

        public Student age(Integer age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student stu = student.name("zhangsan").age(20);
        System.out.println(stu);
    }

}
