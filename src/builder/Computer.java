package builder;

/**
 * Created by Niu on 2017/5/10.
 * 產品抽象類
 */
public abstract class Computer {

    protected String mBoard;//鍵盤
    protected String mDisplay; //顯示器
    protected String mOs; //操作系统

    public Computer() {

    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOs();

}


