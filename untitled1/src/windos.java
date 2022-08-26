import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class windos extends JFrame {
    private static JLayeredPane win;
    private static JTextArea temp;
    private static JButton jb;
    public static void main(String[] args) {
        new windos().init();
        new windos().input();
    }
    void init(){
        win = new JLayeredPane();
        temp = new JTextArea(30,30);
        temp.setBounds(150,150,200,100);
        Font f = new Font("黑体",Font.BOLD,20);
        temp.setFont(f);
        temp.setEditable(false);
        this.setBounds(200,200,500,500);
        win.add(temp);
        this.add(win);
        this.setLayeredPane(win);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void input(){
        this.temp.setText(" ");
        Date startime = new Date(System.currentTimeMillis());//获取系统当前时间
        while(true){
            try {
                Thread.sleep(1000);
                this.temp.setText(new SimpleDateFormat("HH:mm:ss").format(startime));
                System.out.println(this.temp.getText());
                startime = new Date(System.currentTimeMillis());//更新系统时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
