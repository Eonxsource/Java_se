package com.mr.draw;
import javax.swing.JFrame;
public class DrawPictureFrame extends JFrame{ //继承窗体类
/*
* 构造方法
* */
    public DrawPictureFrame() {
        setResizable(false);//窗体不能改变大小
        setTitle("你好");//设置标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗体关闭则停止程序
        setBounds(500,100,574,460);//设置窗口位置和宽高
    }

    public static void main(String[] args) {
        DrawPictureFrame frame=new DrawPictureFrame();//创建窗体对象
        frame.setVisible(true);//让窗体可见
    }
}
