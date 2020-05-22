import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Calculator");
        List<JButton> buttons = new ArrayList<>();

        JTextField screen = new JTextField();
        screen.setEditable(false);
        screen.setBounds(0, 0, 500, 40);

        buttons = generateButtons();
        StringBuilder stringBuilder = new StringBuilder();
        buttons.forEach(jButton -> jButton.addActionListener(actionEvent -> {
            String buttonValue = ((JButton) actionEvent.getSource()).getText();
//            System.out.println(buttonValue);
            switch (buttonValue) {
                case "=":
                    String result = String.valueOf(buildResult(stringBuilder));
                    stringBuilder.setLength(0);
                    stringBuilder.append(result);
                    break;
                default:
                    stringBuilder.append(buttonValue);
            }
            screen.setText(stringBuilder.toString());
        }));

        jFrame.setSize(800, 800);
        jFrame.setLayout(null);
        buttons.forEach(jFrame::add);
        jFrame.add(screen);

        jFrame.setVisible(true);
    }
    private static int buildResult(StringBuilder stringBuilder) {
        String [] data = stringBuilder.toString().split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        int op1 = Integer.parseInt(data[0]);
        int op2 = Integer.parseInt(data[2]);

        if(data.length > 3){
            JOptionPane.showMessageDialog(null,"Operation not supported!!!");
            return 0;
        }

        switch (data[1]){
            case "+":
                return op1 + op2;
            case "-" :
                return op1 - op2;
            default:
                JOptionPane.showMessageDialog(null,"Operation not supported!!!");
                return 0;

        }
    }

    private static List<JButton> generateButtons() {
        List<JButton> buttons = new ArrayList<>();
        int x = 0, y = 50, w = 80, h = 40;
        for (int i = 0; i <= 9; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            if (i > 0 && i < 3) {
                x += 100;
            } else if (i >= 3 && i <= 5) {
                y = 100;
                if (i == 3) {
                    x = 0;
                } else {
                    x += 100;
                }
            } else if (i > 5 && i <= 8) {
                y = 150;
                if (i == 6) {
                    x = 0;
                } else {
                    x += 100;
                }
            } else if (i == 9) {
                x = 0;
                y = 200;
            }
            jButton.setBounds(x, y, w, h);
            buttons.add(jButton);
        }
        JButton jButtonAdd = new JButton("+");
        jButtonAdd.setBounds(100, 200, 80, 40);
        JButton jButtonSub = new JButton("-");
        jButtonSub.setBounds(200, 200, 80, 40);
        JButton jButtonEq = new JButton("=");
        jButtonEq.setBounds(0, 250, 80, 40);
        JButton jButtonClearAll = new JButton("C");
        jButtonClearAll.setBounds(100, 250, 80, 40);

        buttons.addAll(Arrays.asList(jButtonAdd, jButtonSub, jButtonEq, jButtonClearAll));

        return buttons;
    }
}
