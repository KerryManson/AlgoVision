import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoVisHelper {

    private AlgoVisHelper(){}

    public static final Color Red = new Color(0xF44336);
    public static final Color Pink = new Color(0xE91E63);
    public static final Color Purple = new Color(0x9C27B0);
    public static final Color DeepPurple = new Color(0x673AB7);
    public static final Color Indigo = new Color(0x3F51B5);
    public static final Color Blue = new Color(0x2196F3);
    public static final Color LightBlue = new Color(0x03A9F4);
    public static final Color Cyan = new Color(0x00BCD4);
    public static final Color Teal = new Color(0x009688);
    public static final Color Green = new Color(0x4CAF50);
    public static final Color LightGreen = new Color(0x8BC34A);
    public static final Color Lime = new Color(0xCDDC39);
    public static final Color Yellow = new Color(0xFFEB3B);
    public static final Color Amber = new Color(0xFFC107);
    public static final Color Orange = new Color(0xFF9800);
    public static final Color DeepOrange = new Color(0xFF5722);
    public static final Color Brown = new Color(0x795548);
    public static final Color Grey = new Color(0x9E9E9E);
    public static final Color BlueGrey = new Color(0x607D8B);
    public static final Color Black = new Color(0x000000);
    public static final Color White = new Color(0xFFFFFF);

    //圆框
    public static void StrokeCirle(Graphics2D g,int x,int y ,int r ){
        Ellipse2D circle = new Ellipse2D.Double(x-r,y-r,2*r,2*r);
        g.draw(circle);
    }

    //填充的圆
    public static void FillCircle(Graphics2D g,int x, int y ,int r){
        Ellipse2D circle = new Ellipse2D.Double(x-r,y-r,2*r,2*r);
        g.fill(circle);
    }

    //长方形框
    public static void StokeRectangle(Graphics2D g,int x, int y, int w,int h){
        Rectangle rectangle = new Rectangle(x,y,w,h);
        g.draw(rectangle);
    }

    //填充颜色的长方形
    public static void FillRectangle(Graphics2D g,int x, int y, int w,int h){
        Rectangle rectangle = new Rectangle(x,y,w,h);
        g.fill(rectangle);
    }

    //设置颜色工具
    public static void SetStrokeColor(Graphics2D g,Color color){g.setColor(color);}

    public static void PutImage(Graphics2D g ,int x ,int y ,String url){
        //插入图片工具
        ImageIcon imageIcon = new ImageIcon(url);
        Image image =imageIcon.getImage();
        g.drawImage(image,x,y,null);
    }

    public static void DrawText(Graphics2D g,String text,int centerX,int centerY) throws IllegalAccessException {
        //插入文本工具
        if (text == null) {
            throw new IllegalAccessException("Text is null in DrawText function!");
        }
        FontMetrics fontMetrics = g.getFontMetrics();
        int w = fontMetrics.stringWidth(text);
        int h = fontMetrics.getDescent();
        g.drawString(text,centerX-w/2,centerY+h);
    }

    public static void pause(int t ) throws IllegalAccessException {
        try {
            Thread.sleep(t);
        }
        catch (InterruptedException e){
            throw new IllegalAccessException("Thead sleep error!");
        }
    }



}
