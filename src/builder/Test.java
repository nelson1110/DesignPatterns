package builder;

/**
 * Created by Niu on 2017/5/10.
 * Dirctor 角色在实际开发中经常被省略，它存在的意义就是对外隐藏构建的细节，直接用Builder也可以
 */
public class Test {

    public static void main(String[] args) {

        Builder builder = new MacBookBuilder();
        Director pcDirctor = new Director(builder);
        pcDirctor.construct("bord","display");

        Computer computer = new MacBookBuilder().buildBoard("board").buildDisplay("display").buildOs().create();

    }
}
