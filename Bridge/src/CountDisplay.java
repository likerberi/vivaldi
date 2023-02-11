public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        while (times - 1 >= 0) {
            times -= 1;
            print();
        }
        close();
    }
}
