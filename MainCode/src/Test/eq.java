package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class eq {
private JTextField peremenaya;
private JLabel put;
private JLabel person;
private JLabel kM;
private JLabel kg;

private JLabel gruz;
private JTextField gruz1;

private JTextField peremenaya4;

private JTextField peremenaya5;
private JTextField peremenaya1;
private JLabel RASHOD;
private JLabel litersLabel;
private JTextField priceField;
private JLabel price;
private JLabel ruble;
private JButton button;
private JLabel txtPanel;
private JFrame okoska;
private JComboBox comboBox;
float result;

eq() {
	String[] cars = {
		    "Hyundai Solaris",
		    "Reno Logan",
		    "Lada Granta",
		    "Volkswagen Polo"
		};
 String[] seas = { "����",
		    "����"};
	
JComboBox comboBox = new JComboBox(cars);
JComboBox season = new JComboBox(seas);

ActionListener actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
            /*
             * ��������, ������� ���������� ���������.
             */
    }
};
comboBox.addActionListener(actionListener);
gruz = new JLabel("��� ������");
gruz1 = new JTextField("0");
gruz1.setHorizontalAlignment(JTextField.RIGHT);
kg = new JLabel("��");

put = new JLabel("���������� S ");// ����������
peremenaya = new JTextField("0");
peremenaya.setHorizontalAlignment(JTextField.RIGHT);
kM = new JLabel("��");

person = new JLabel("���������� ���������� ");
peremenaya4 = new JTextField("0");
peremenaya4.setHorizontalAlignment(JTextField.RIGHT);


RASHOD = new JLabel("������� ������ ������� �� 100 ��");
peremenaya1 = new JTextField("0");
peremenaya1.setHorizontalAlignment(JTextField.RIGHT);
litersLabel = new JLabel("�");

price = new JLabel("���� �� ���� �������");
priceField = new JTextField("0");
priceField.setHorizontalAlignment(JTextField.RIGHT);

ruble = new JLabel("���");
button = new JButton("����������");
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent ae) {
try {
double way =
Double.parseDouble(peremenaya.getText());
double average =
Double.parseDouble(peremenaya1.getText());
double price =
Double.parseDouble(priceField.getText());
double fuel = average / 100.0 * way;
double cost = fuel * price;

JOptionPane.showMessageDialog(null, "����������� "+ fuel + " ������ �������, �������� � "+ cost ,"���",JOptionPane.INFORMATION_MESSAGE); 
}

catch ( NumberFormatException nfe ) {
txtPanel.setText("��������� �������� ������");
}
}
});
txtPanel = new JLabel("������� ����������� ������");

GridBagLayout layout = new GridBagLayout();
GridBagConstraints constraints = new GridBagConstraints();
constraints.weightx = 1.0;
constraints.weighty = 1.0;
constraints.insets = new Insets(5, 5, 5, 5);

constraints.gridx = 0;
constraints.anchor = GridBagConstraints.WEST;
constraints.ipadx = 90;
constraints.gridy = 0;
layout.setConstraints(person, constraints);
constraints.gridy = 1;
layout.setConstraints(gruz, constraints);
constraints.gridy = 2;
layout.setConstraints(put, constraints);
//constraints.gridy = 3;
//layout.setConstraints(RASHOD, constraints);
//constraints.gridy = 4;
//layout.setConstraints(price, constraints);

constraints.gridx = 0;
constraints.anchor = GridBagConstraints.EAST;
constraints.ipadx = 50;
constraints.gridy = 0;
layout.setConstraints(peremenaya4, constraints);
constraints.gridy = 1;
layout.setConstraints(gruz1, constraints);
constraints.gridy = 2;
layout.setConstraints(peremenaya, constraints);
constraints.gridy = 3;
layout.setConstraints(peremenaya1, constraints);
constraints.gridy = 4;
layout.setConstraints(priceField, constraints);

constraints.gridy = 4;
layout.setConstraints(comboBox, constraints);

constraints.gridy = 5;
layout.setConstraints(season, constraints);

constraints.gridx = 2;
constraints.ipadx = 0;
constraints.gridy = 1;
layout.setConstraints(kg, constraints);
constraints.gridy = 2;
layout.setConstraints(kM, constraints);
//constraints.gridy = 3;
//layout.setConstraints(litersLabel, constraints);
//constraints.gridy = 4;
//layout.setConstraints(ruble, constraints);



constraints.gridx = 0;
constraints.gridy = 7;
constraints.gridwidth = GridBagConstraints.REMAINDER;
constraints.anchor = GridBagConstraints.EAST;
layout.setConstraints(button, constraints);

constraints.gridy = 6;
constraints.fill = GridBagConstraints.HORIZONTAL;
constraints.anchor = GridBagConstraints.WEST;
layout.setConstraints(txtPanel, constraints);

okoska = new JFrame("������ �������");
okoska.setSize(650, 500);
okoska.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
okoska.setLayout(layout);

okoska.add(put);
//okoska.add(RASHOD);
//okoska.add(price);
okoska.add(peremenaya);

okoska.add(gruz1);
okoska.add(gruz);

okoska.add(season);
//okoska.add(peremenaya1);
//okoska.add(priceField);
okoska.add(kM);
okoska.add(kg);
okoska.add(peremenaya4);
okoska.add(person);

//okoska.add(litersLabel);
//okoska.add(ruble);
okoska.add(button);
okoska.add(txtPanel);
okoska.add(comboBox);
okoska.pack();

okoska.setVisible(true);

}

public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new eq();
}
});
}
public float Result(float way,float average,float price) { //������ ���������� � ����� 
	 float cost = (float) ((average / 100.0 * way)*price) ; //������� �������� 
	 return cost; //���������� �������� 
	 }
public float Result2(float way,float average) { //������ ���������� � ����� 
	 float fuel = (float) (average / 100.0 * way) ; //������� �������� 
	 return fuel; //���������� �������� 
	 }


}
