public class Pixel {
    private int red;
    private int green;
    private int blue;

    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public boolean isRed() {
        return blue == 0 && green == 0 && red >= 1;
    }

    public boolean isGreen() {
        return blue == 0 && green >= 1 && red == 0;
    }

    public boolean isBlue() {
        return blue >= 1 && green == 0 && red == 0;
    }

    public boolean isWhite() {
        return blue == 255 && green == 255 && red == 255;
    }

    public boolean isBlack() {
        return blue == 0 && green == 0 && red == 0;
    }
}
