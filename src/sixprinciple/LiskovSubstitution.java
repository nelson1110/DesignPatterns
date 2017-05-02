package sixprinciple;

/**
 * Created by Niu on 2017/5/2.
 * 里氏替换原则
 */
public class LiskovSubstitution {

    /**  只要父类能出现的地方，子类就可以出现，而且替换成子类也不会产生任何的错误或异常，使用者可能根本就不需要知道是父类还是子类。但是反过来
     *   就不行了，有子类出现的地方父类未必就能适应。
     */


    public static void main(String[] args) {
        needGroup(new Layout()); //父类出现的地方，子类就可以出现
        needGroup(new ViewGroup());
        //needLayout(new View()); 但是有子类出现的地方，出现父类就未必能适应
    }

    private static void needGroup(ViewGroup viewGroup){
        viewGroup.show();
    }



    static class View{
       public void show(){
            System.out.print("View");
        }
    }

    static class ViewGroup extends View{
        @Override
        public void show() {
            System.out.print("ViewGroup");
        }

        public void layout(View view){
            System.out.println(view.getClass());
        }
    }

    static class Layout extends ViewGroup{
        @Override
        public void show() {
            System.out.print("ViewGroup");
        }

        @Override
        public void layout(View view) {
            System.out.println(view.getClass());
        }
    }

}
