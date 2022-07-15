package com.xzit.interfaces.imp;

import com.xzit.interfaces.Clock;
import com.xzit.interfaces.Computer;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

//此类继承了JFrame （窗体）  并实现了Computer接口
public class Mulity extends JFrame implements Clock {
    public double count(double a, double b){
        return a*b;
    }

    private String title;//窗体标题
    private JButton botton;//按钮
    private JTextField text1;//文本框1
    private JTextField text2;//文本框2
    private JTextField text3;//文本框3
    private JTextField text4;//文本框4

    private Mulity self;

    public Mulity(String title){
        init("标题");
    }


    private void init(String title){

        self=this;
        this.setTitle(title);
        this.setVisible(true); //是否可见
        this.setBounds(200,100,800,600);//窗体大小
        this.setLayout(null);

        botton=new JButton("请点击计算");
        botton.setBounds(100,100,150,30);
        botton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                double n1=Double.valueOf(text1.getText());
                double n2=Double.valueOf(text2.getText());
                double res=self.count(n1,n2);

                text3.setText(String.valueOf(res));

                self.validate();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.add(botton);

        text1=new JTextField();
        text1.setBounds(100,200,200,30);
        this.add(text1);

        text2=new JTextField();
        text2.setBounds(100,300,200,30);
        this.add(text2);

        text3=new JTextField();
        text3.setBounds(100,400,200,30);
        this.add(text3);

        text4=new JTextField();
        text4.setBounds(300,500,200,30);
        this.add(text4);

        this.validate();
        self.showSystemDateTime();
    }

    @Override
    public void showSystemDateTime(){
        while (1==1){
            Date time=new Date();
            String timeString=new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss").format(time);
            text4.setText(timeString);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
