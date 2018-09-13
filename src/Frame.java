import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame extends java.awt.Frame {
    private Button btn = new Button("Exit");
    private Button btn1 = new Button("+");
    private Button btn2 = new Button("-");
    private Button btn3 = new Button("-->");
    private Button btn4 = new Button("<--");
    private Label lb = new Label("0");
    int x= 0;
    int lx =250;
    public Frame(){
        init();
    }
    public void init(){
        this.setBounds(50,50,500,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setTitle("");
        setLayout(null);
        btn.setBounds(50,50,100,100);
        btn1.setBounds(100,150,100,100);
        btn2.setBounds(100,250,100,100);
        btn3.setBounds(250,150,100,100);
        btn4.setBounds(250,250,100,100);
        lb.setBounds(x,400,100,100);
        add(btn);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(lb);
        btn.setBackground(Color.BLUE);
        btn.setFont(new Font(null,Font.BOLD,16));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+1;
                Frame.this.setTitle(Integer.toString(x));
                lb.setText(Integer.toString(x));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-1;
                Frame.this.setTitle(Integer.toString(x));
                lb.setText(Integer.toString(x));
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lx=lx+10;
                lb.setBounds(lx,400,100,100);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lx=lx-10;
                lb.setBounds(lx,400,100,100);
            }
        });

    }
}
