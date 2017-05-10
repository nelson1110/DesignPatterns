package builder;

/**
 * Created by Niu on 2017/5/10.
 *
 */
public interface Builder {
    Builder buildBoard(String board);
    Builder buildDisplay(String display);
    Builder buildOs();

    Computer create();
}
