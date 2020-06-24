import javax.swing.*;
import java.awt.*;

public class AlgoFrame extends JFrame {
    private int cavaWidth;
    private int cavaHeight;

    public AlgoFrame(String title,int cavaWidth,int caveheight){
        super(title);
        this.cavaWidth = cavaWidth;
        this.cavaHeight = caveheight;

        //设置画布


    }

    public int getCavaWidth(){return this.cavaWidth;}
    public int getCavaHeight(){return this.cavaWidth;}


    public class AlgoCavas extends JPanel{
        public AlgoCavas(){
            super(true);// 开启双缓存
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g; //将g强制转换为g2d

            //开启抗锯齿
            RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);


        }
    }
}



