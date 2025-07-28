package RGBColor;
public class RGBColor {
    int red;
    int green;
    int blue;

    public RGBColor(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }

    public String toString() {
        return "RGB(" + red + ", " + green + ", " + blue + ")";
    }

    public static void main(String[] args) {
        RGBColor color = new RGBColor(255, 0, 0);
        System.out.println(color.toString());
    }
}
