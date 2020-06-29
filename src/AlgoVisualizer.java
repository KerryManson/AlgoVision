import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;

public class AlgoVisualizer {

    private AlgoFrame frame;
    private Object data1;
    private SelectionSortData data;
    private int DELAY = 5;

    public AlgoVisualizer(int scenceWidth,int scenceHeight){
        data = new SelectionSortData(100,scenceHeight);

        EventQueue.invokeLater(()->{
            frame = new AlgoFrame("Selection Sort Visualization",scenceWidth,scenceHeight);
            // TODO 打开键盘鼠标控件
            //frame.addMouseListener(new AlgoAdapter());
            //frame.addKeyListener(new Algokeyboard());

            new Thread(()->run()).start();
        });
    }

    private void run() {
        setData(data.currenIndex,data.currentMinIndex,data.orderedIndex);
        for (int i = 0; i < data.arrayLength(); i++) {
            int minInsex = i;
            for (int j = i +1; j<data.arrayLength(); j++){
                if (data.get(minInsex) > data.get(j)){
                    minInsex = j;
            }
                setData(j,minInsex,i);
                data.currenIndex = j;
        }
            data.swap(i,minInsex);
    }


    }
    private void setData(int curIndex,int curMinIdex,int orderedIndex){
        this.data.currenIndex = curIndex;
        this.data.currentMinIndex = curMinIdex;
        this.data.orderedIndex = orderedIndex;

        frame.render(data);
        AlgoVisHelper.pause(DELAY);
    }

    public class AlgoMouse extends MouseAdapter {}
    public class Algokeyboard extends KeyAdapter{}

    public static void main(String[] args){
        int scenceWidth = 800;
        int scenceHeight = 800;

        AlgoVisualizer algoVisualizer = new AlgoVisualizer(scenceWidth,scenceHeight);
    }
}


