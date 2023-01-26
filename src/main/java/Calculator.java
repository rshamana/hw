import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import javax.swing.*;
import java.util.ArrayList;



final class Calculator extends JFrame {

    private void buttonControlDisable() {
        for (JButton b:equationButtons
        ) {
            b.setEnabled(false);
            jButtonDot.setEnabled(true);

        }
    }
    private void backspaceLogic(){
        try {
            jTextField.setText(jTextField.getText().substring(0, jTextField.getText().length() - 1));
            if(strEquationButtons.contains(jTextField.getText().substring(jTextField.getText().length()-1))){
                buttonControlDisable();
            }
            else {
                buttonControlEnable();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "nothing more to delete!");
        }
    }
    private void buttonLogicv1(JButton button){
        if(equationButtons.contains(button)) {
            jTextField.setText(jTextField.getText() + button.getText());
            buttonControlDisable();
        }else{
            jTextField.setText(jTextField.getText() + button.getText());
            buttonControlEnable();
        }
    }

    private void buttonControlEnable() {
        for (JButton b:equationButtons
             ) {
            b.setEnabled(true);

        }
    }

    public void equal() {
        Expression expression = new ExpressionBuilder(jTextField.getText()).build();
        try {
            double result = expression.evaluate();
            jTextField.setText(String.valueOf(result));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Division by zero!");
        }
    }

    ArrayList<JButton> equationButtons = new ArrayList<>();
    ArrayList<String> strEquationButtons = new ArrayList<>();
    final JTextField jTextField = new JTextField();
    final JButton jButtonEqual = new JButton("=");
    final JButton jButton1 = new JButton("1");
    final JButton jButton2 = new JButton("2");
    final JButton jButton3 = new JButton("3");
    final JButton jButton4 = new JButton("4");
    final JButton jButton5 = new JButton("5");
    final JButton jButton6 = new JButton("6");
    final JButton jButton7 = new JButton("7");
    final JButton jButton8 = new JButton("8");
    final JButton jButton9 = new JButton("9");
    final JButton jButton0 = new JButton("0");
    final JButton jButtonPlus = new JButton("+");
    final JButton jButtonMinus = new JButton("-");
    final JButton jButtonMulti = new JButton("*");
    final JButton jButtonDev = new JButton("/");
    final JButton jButtonDot = new JButton(".");
    final JButton jButtonCc = new JButton("CC");
    final JButton jButtonBackspace = new JButton("<-");

    Calculator() {
        equationButtons.add(jButtonMinus);
        equationButtons.add(jButtonPlus);
        equationButtons.add(jButtonMulti);
        equationButtons.add(jButtonEqual);
        equationButtons.add(jButtonDev);
        strEquationButtons.add(jButtonMinus.getText());
        strEquationButtons.add(jButtonPlus.getText());
        strEquationButtons.add(jButtonMulti.getText());
        strEquationButtons.add(jButtonEqual.getText());
        strEquationButtons.add(jButtonDev.getText());
        strEquationButtons.add(jButtonDot.getText());
        jTextField.setBounds(0, 0, 900, 100);
        jTextField.setEnabled(false);
        jButtonCc.addActionListener(actionEvent -> jTextField.setText(""));
        jButtonCc.addActionListener(actionEvent->buttonControlEnable());
        jButtonCc.setFocusPainted(false);
        jButtonCc.setBounds(300, 300, 100, 100);
        jButtonBackspace.addActionListener(actionEvent ->backspaceLogic());
        jButtonBackspace.setFocusPainted(false);
        jButtonBackspace.setBounds(300, 400, 100, 100);
        jButton1.addActionListener(actionEvent -> buttonLogicv1(jButton1));
        jButton1.setFocusPainted(false);
        jButton1.setBounds(0, 400, 100, 100);
        jButton2.addActionListener(actionEvent -> buttonLogicv1(jButton2));
        jButton2.setFocusPainted(false);
        jButton2.setBounds(100, 400, 100, 100);
        jButton3.addActionListener(actionEvent -> buttonLogicv1(jButton3));
        jButton3.setFocusPainted(false);
        jButton3.setBounds(200, 400, 100, 100);
        jButton4.addActionListener(actionEvent -> buttonLogicv1(jButton4));
        jButton4.setFocusPainted(false);
        jButton4.setBounds(0, 300, 100, 100);
        jButton5.addActionListener(actionEvent -> buttonLogicv1(jButton5));
        jButton5.setFocusPainted(false);
        jButton5.setBounds(100, 300, 100, 100);
        jButton6.addActionListener(actionEvent -> buttonLogicv1(jButton6));
        jButton6.setFocusPainted(false);
        jButton6.setBounds(200, 300, 100, 100);
        jButton7.addActionListener(actionEvent -> buttonLogicv1(jButton7));
        jButton7.setFocusPainted(false);
        jButton7.setBounds(0, 200, 100, 100);
        jButton8.addActionListener(actionEvent -> buttonLogicv1(jButton8));
        jButton8.setBounds(100, 200, 100, 100);
        jButton8.setFocusPainted(false);
        jButton9.addActionListener(actionEvent -> buttonLogicv1(jButton9));
        jButton9.setBounds(200, 200, 100, 100);
        jButton9.setFocusPainted(false);
        jButton0.addActionListener(actionEvent -> buttonLogicv1(jButton0));
        jButton0.setFocusPainted(false);
        jButton0.setBounds(0, 500, 300, 100);
        jButtonPlus.addActionListener(actionEvent -> buttonLogicv1(jButtonPlus));
        jButtonPlus.setFocusPainted(false);
        jButtonPlus.setBounds(300, 200, 100, 100);
        jButtonMinus.setBounds(300, 100, 100, 100);
        jButtonMinus.addActionListener(actionEvent -> buttonLogicv1(jButtonMinus));
        jButtonMinus.setFocusPainted(false);
        jButtonMinus.setBounds(300, 100, 100, 100);
        jButtonMulti.addActionListener(actionEvent -> buttonLogicv1(jButtonMulti));
        jButtonMulti.setFocusPainted(false);
        jButtonMulti.setBounds(200, 100, 100, 100);
        jButtonDev.addActionListener(actionEvent -> buttonLogicv1(jButtonDev));
        jButtonDev.setFocusPainted(false);
        jButtonDev.setBounds(100, 100, 100, 100);
        jButtonEqual.addActionListener(actionEvent -> equal());
        jButton1.setFocusPainted(false);
        jButtonEqual.setBounds(300, 500, 100, 100);
        jButtonDot.addActionListener(actionEvent -> buttonLogicv1(jButtonDot));
        jButtonDot.addActionListener(actionEvent -> jButtonDot.setEnabled(false));
        jButtonDot.setFocusPainted(false);
        jButtonDot.setBounds(0, 100, 100, 100);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(900, 800);
        this.setTitle("simple calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(jTextField);
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
        this.add(jButton4);
        this.add(jButton5);
        this.add(jButton6);
        this.add(jButton7);
        this.add(jButton8);
        this.add(jButton9);
        this.add(jButton0);
        this.add(jButtonPlus);
        this.add(jButtonMinus);
        this.add(jButtonMulti);
        this.add(jButtonDev);
        this.add(jButtonEqual);
        this.add(jButtonDot);
        this.add(jButtonCc);
        this.add(jButtonBackspace);
    }
}