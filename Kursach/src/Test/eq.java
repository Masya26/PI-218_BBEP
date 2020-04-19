package Test;
 

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class eq {
 private JTextField peremenaya;
 private JLabel put;
private JLabel kM;
 private JTextField peremenaya1;
 private JLabel RASHOD;
 private JLabel litersLabel;
 private JTextField priceField;
 private JLabel price;
 private JLabel rurLabel;
 private JButton calcButton;
 private JLabel txtPanel;
 private JFrame okoska;
float result;
 
 eq() {
	 
 put = new JLabel("Расстояние S ");// Расстояние
 peremenaya = new JTextField("0");
 peremenaya.setHorizontalAlignment(JTextField.RIGHT);
 kM = new JLabel("Км");
 
 RASHOD = new JLabel("Средний расход топлива на 100 км");
 peremenaya1 = new JTextField("0");
 peremenaya1.setHorizontalAlignment(JTextField.RIGHT);
 litersLabel = new JLabel("Л");
 price = new JLabel("Цена за литр топлива");
 priceField = new JTextField("0");
 priceField.setHorizontalAlignment(JTextField.RIGHT);
 rurLabel = new JLabel("Руб");
 calcButton = new JButton("Рассчитать");
 calcButton.addActionListener(new ActionListener() {
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
 
 JOptionPane.showMessageDialog(null, "Понадобится "+ fuel + " литров топлива,обойдётся в "+ cost ,"Все",JOptionPane.INFORMATION_MESSAGE); 
 }
 
 catch ( NumberFormatException nfe ) {
 txtPanel.setText("Проверьте введённые данные");
 }
 }
 });
 txtPanel = new JLabel("Введите необходимые данные");

 GridBagLayout layout = new GridBagLayout();
 GridBagConstraints constraints = new GridBagConstraints();
 constraints.weightx = 1.0;
 constraints.weighty = 1.0;
 constraints.insets = new Insets(5, 5, 5, 5);

 constraints.gridx = 0;
 constraints.anchor = GridBagConstraints.WEST;
 constraints.ipadx = 90;
 constraints.gridy = 0;
 layout.setConstraints(put, constraints);
 constraints.gridy = 1;
 layout.setConstraints(RASHOD, constraints);
 constraints.gridy = 2;
 layout.setConstraints(price, constraints);

 constraints.gridx = 1;
 constraints.anchor = GridBagConstraints.EAST;
 constraints.ipadx = 50;
 constraints.gridy = 0;
 layout.setConstraints(peremenaya, constraints);
 constraints.gridy = 1;
 layout.setConstraints(peremenaya1, constraints);
 constraints.gridy = 2;
 layout.setConstraints(priceField, constraints);

 constraints.gridx = 2;
 constraints.ipadx = 0;
 constraints.gridy = 0;
 layout.setConstraints(kM, constraints);
 constraints.gridy = 1;
 layout.setConstraints(litersLabel, constraints);
 constraints.gridy = 2;
 layout.setConstraints(rurLabel, constraints);

 constraints.gridx = 0;
 constraints.gridy = 4;
constraints.gridwidth = GridBagConstraints.REMAINDER;
 constraints.anchor = GridBagConstraints.EAST;
 layout.setConstraints(calcButton, constraints);

 constraints.gridy = 5;
 constraints.fill = GridBagConstraints.HORIZONTAL;
 constraints.anchor = GridBagConstraints.WEST;
 layout.setConstraints(txtPanel, constraints);

 okoska = new JFrame("Расход топлива");
 okoska.setSize(650, 500);
 okoska.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 okoska.setLayout(layout);

 okoska.add(put);
 okoska.add(RASHOD);
 okoska.add(price);
 okoska.add(peremenaya);
 okoska.add(peremenaya1);
 okoska.add(priceField);
 okoska.add(kM);
 okoska.add(litersLabel);
 okoska.add(rurLabel);
 okoska.add(calcButton);
 okoska.add(txtPanel);

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
 public float Result(float way,float average,float price) { //Задаем переменные и метод 
	 float cost = (float) ((average / 100.0 * way)*price) ; //Формула подсчета 
	 return cost; //Возвращаем значение 
	 }
 
 
 
}
