import processing.core.PApplet;

public class Process extends PApplet {
    private final int HEIGHT = 800;
    private final int WIDTH = 1040;
    private final int WIDTH_OF_ELLIPSE = 17;
    private final int HEIGHT_OF_ELLIPSE = 17;
    private int speedOfEllipse1=0;
    private int speedOfEllipse2=0;
    private int speedOfEllipse3 =0;
    private int speedOfEllipse4 =0;

    public static void main(String[] args) {
        PApplet.main("Process",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        ellipse1();
        ellipse2();
        ellipse3();
        ellipse4();
    }
    private void ellipse1() {
        ellipse(speedOfEllipse1,HEIGHT/5, WIDTH_OF_ELLIPSE, HEIGHT_OF_ELLIPSE);
        speedOfEllipse1+=1;

    }
    private void ellipse2() {
        ellipse(speedOfEllipse2,2*HEIGHT/5, WIDTH_OF_ELLIPSE, HEIGHT_OF_ELLIPSE);
        speedOfEllipse2+=2;

    }
    private void ellipse3() {
        ellipse(speedOfEllipse3,3*HEIGHT/5, WIDTH_OF_ELLIPSE, HEIGHT_OF_ELLIPSE);
        speedOfEllipse3 +=3;

    }
    private void ellipse4() {
        ellipse(speedOfEllipse4,4*HEIGHT/5, WIDTH_OF_ELLIPSE, HEIGHT_OF_ELLIPSE);
        speedOfEllipse4 +=4;

    }

}
