import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;

public class AlgoVisualizer {

    private AlgoFrame frame;
    private Object data;

    public AlgoVisualizer(int scenceWidth,int scenceHeight){
        EventQueue.invokeLater(()->{
            frame = new AlgoFrame("test",scenceWidth,scenceHeight);
            // TODO 打开键盘鼠标控件
            //frame.addMouseListener(new AlgoAdapter());
            //frame.addKeyListener(new Algokeyboard());

            new Thread(()->run()).start();
        });
    }

    private void run(){


    }

    public class AlgoMouse extends MouseAdapter {}
    public class Algokeyboard extends KeyAdapter{}

    public static void main(String[] args){
        int scenceWidth = 800;
        int scenceHeight = 800;

        AlgoVisualizer algoVisualizer = new AlgoVisualizer(scenceWidth,scenceHeight);
    }
}


