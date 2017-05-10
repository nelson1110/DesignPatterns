package builder;

/**
 * Created by Niu on 2017/5/10.
 *
 */
public class MacBookBuilder implements Builder{

    private Computer mComputer = new MacBook();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOs() {
        mComputer.setmOs();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
