public class SideBorder extends Border {
    private char bordarChar;
    final static int DECORATION = 1;

    public SideBorder(Display display, char bordarChar) {
        super(display);
        this.bordarChar = bordarChar;
    }

    @Override
    public int getColumns() {
        return DECORATION + display.getColumns() + DECORATION;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }
    @Override
    public String getRowText(int row) {
        return bordarChar + display.getRowText(row) + bordarChar;
    }
}
