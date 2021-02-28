package RandomNumberMaker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RandomNumberMaker extends JFrame{
	Container contentPane;
	Panel Center;
	Panel South;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	TextField textfield;
	JButton btn;
	int[] number = new int[6];
	int num;
	public RandomNumberMaker() {
		setTitle("�ζǻ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		Center = new Panel();
		Center.setLayout(new GridLayout(2,3,8,8));
		btn1 = new JButton("1");		
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("���ü", Font.BOLD, 35));
		Center.add(btn1);
		btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("���ü", Font.BOLD, 35));
		Center.add(btn2);
		btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE); 
		btn3.setFont(new Font("���ü", Font.BOLD, 35));
		Center.add(btn3);
		btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("���ü", Font.BOLD, 35));
		Center.add(btn4);
		btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("���ü", Font.BOLD, 35));
		Center.add(btn5);
		btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("���ü", Font.BOLD, 35));
		Center.add(btn6);
		
		contentPane.add(Center,BorderLayout.CENTER);
		
		South = new Panel();
		South.setLayout(new BorderLayout(30, 0));		
		textfield = new TextField();
		South.add(textfield,BorderLayout.CENTER);
		btn = new JButton("���ڻ���");
		btn.addMouseListener(new MyMouseListener());
		btn.setBackground(Color.WHITE);
		South.add(btn,BorderLayout.EAST);
		contentPane.add(South,BorderLayout.SOUTH);
			
		setSize(400, 300);
		setVisible(true);
		
		//System.out.print(""+(int)(Math.random()*45)+1);
	}
	class MyMouseListener implements MouseListener {

		public void mousePressed(MouseEvent e) {
			for(int i=0;i<6;i++)
			{		
				number [i] = (int)(Math.random()*(45-1))+1;
				for(int j=0;j<i;j++)
				{
					if(number[i] == number[j])
					{
						i--;
					}
				}
			}
			
			//�� ���
			for(int n=0;n<6;n++)
			{								
				String bt1 = String.valueOf(number[0]); //number �迭�� 0��°�� String���� ����ȯ
				btn1.setText(bt1); //btn1�� bt1�� ���
				String bt2 = String.valueOf(number[1]);//number �迭�� 1��°�� String���� ����ȯ
				btn2.setText(bt2); //btn2�� bt2�� ���
				String bt3 = String.valueOf(number[2]);//number �迭�� 2��°�� String���� ����ȯ
				btn3.setText(bt3); //btn3�� bt3�� ���
				String bt4 = String.valueOf(number[3]);//number �迭�� 3��°�� String���� ����ȯ
				btn4.setText(bt4); //btn4�� bt4�� ���
				String bt5 = String.valueOf(number[4]);//number �迭�� 4��°�� String���� ����ȯ
				btn5.setText(bt5); //btn5�� bt5�� ���
				String bt6 = String.valueOf(number[5]);//number �迭�� 5��°�� String���� ����ȯ
				btn6.setText(bt6); //btn6�� bt6�� ���
				
				String nm = Arrays.toString(number).replaceAll("[^0-9 ]",""); //int�迭 String �迭�� ��ȯ
				textfield.setText(nm); //textfield�� �迭 ���				
				textfield.setFont(new Font("���ü", Font.BOLD, 17));	//textfield ��� ��Ʈ ����
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub	
		}
	}
	
    public static void main(String [] args) 
    {
    	new RandomNumberMaker();
    }
}
