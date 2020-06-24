import javax.swing.*;
import java.awt.*;

public class AlgoFrame extends JFrame {
    private final int cavaWidth;
    private final int cavaHeight;


    public AlgoFrame(String title,int cavaWidth,int caveheight){
        super(title);
        this.cavaWidth = cavaWidth;
        this.cavaHeight = caveheight;

        //设置画布

        AlgoCavas algoCavas = new AlgoCavas();
        setContentPane(algoCavas);
        pack(); //自适应画布大小

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false); //不可调大小
        setVisible(true);
    }

    private Object data;
    public void render(Object data){
        this.data = data;
        repaint();
    }

    public int getCavaWidth(){return this.cavaWidth;}
    public int getCavaHeight(){return this.cavaHeight;}


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
            hints.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
            g2d.addRenderingHints(hints);

            //具体绘制

            AlgoVisHelper.SetStrokeColor(g2d,AlgoVisHelper.DeepOrange);

        }
        @Override
        public Dimension getPreferredSize(){return new Dimension(cavaWidth,cavaHeight);}//设置窗口大小
    }
}



