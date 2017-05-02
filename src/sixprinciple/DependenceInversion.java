package sixprinciple;

/**
 * Created by Niu on 2017/5/2.
 * 依赖倒置原则
 */
public class DependenceInversion {

    /** 定义：高层次的模块不依赖于低层次的模块的实现细节的目的，依赖模块被颠倒了。

     *   关键点：
     *   1.高层模块不应该依赖底层模块，两者都应该依赖其抽象；
     *   2.抽象不应该依赖细节；
     *   3.细节应该依赖抽象。
     */


    public static void main(String[] args) {
        autoDo(new Man());
        autoDo(new Women());
    }

    private static void autoDo(Human human){
        human.walk();
        human.walk();
        human.stop();
    }

    public interface Human{
        void walk();
        void stop();
    }

    static class Man implements Human{

        @Override
        public void walk() {
            System.out.println("man walk");
        }

        @Override
        public void stop() {
            System.out.println("man stop");
        }
    }

    static class Women implements Human{

        @Override
        public void walk() {
            System.out.println("Women walk");
        }

        @Override
        public void stop() {
            System.out.println("Women stop");
        }
    }

}
