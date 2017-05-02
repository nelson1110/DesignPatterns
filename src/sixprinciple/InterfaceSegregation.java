package sixprinciple;

/**
 * Created by Niu on 2017/5/2.
 * 接口隔离原则
 */
public class InterfaceSegregation {
    /**
     * 定义：一个类对另一个类的依赖应该建立在最小接口上。
     * */


    public static void main(String[] args) {
        makeSomeTalk(new Human());
        makeSomeTalk(new Dog());
        makeSomeEat(new Human());
    }

    private static void makeSomeTalk(Talkable talkable){
        talkable.talk();
    }
    private static void makeSomeEat(Eatable eatable){
        eatable.eat();
    }

    interface Talkable{
        void talk();
    }

    interface Eatable{
        void eat();
    }

    static class Human implements Talkable,Eatable{

        @Override
        public void talk() {

        }

        @Override
        public void eat() {

        }
    }

    static class Dog implements Talkable{

        @Override
        public void talk() {

        }
    }

}
