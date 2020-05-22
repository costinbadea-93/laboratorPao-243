import model.Persoana;
import repository.MainRepository;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {
    private static MainRepository mainRepository = new MainRepository();
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Add new Person");

        JLabel nameLabel = new JLabel("Nume: ");
        JTextField nameTextField = new JTextField();
        nameLabel.setBounds(0,50,200,30);
        nameTextField.setBounds(55,50,200,30);

        JLabel surnameLabel = new JLabel("Prenume: ");
        JTextField surnameTextField = new JTextField();
        surnameLabel.setBounds(0,100,200,30);
        surnameTextField.setBounds(55,100,200,30);

        JButton jButtonAdd = new JButton("Save Person");
        jButtonAdd.setBounds(350,100,150,30);



        JList<Persoana> jList = new JList<>();
        jList.setBounds(50,300,400,200);
        jList.setListData(getPeopleAsArray());

        jButtonAdd.addActionListener(addActionListener(nameTextField,surnameTextField,jList));

        JButton deletePersonButton = new JButton("Delete Person");
        deletePersonButton.setBounds(500,300,200,30);
        deletePersonButton.addActionListener(deletePersonActionListener(jList));


        jFrame.add(nameLabel);
        jFrame.add(nameTextField);
        jFrame.add(surnameLabel);
        jFrame.add(surnameTextField);
        jFrame.add(jButtonAdd);
        jFrame.add(deletePersonButton);
        jFrame.add(jList);
        jFrame.setSize(800,800);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    private static ActionListener addActionListener(JTextField nameTextField, JTextField surnameTextField, JList jList){
        ActionListener actionListener = action ->{
            String name = nameTextField.getText();
            String surname = surnameTextField.getText();

            Persoana persoana = new Persoana(name,surname);
            mainRepository.addPersoana(persoana);
            jList.setListData(getPeopleAsArray());
            JOptionPane.showMessageDialog(null, "Person was successfully added!!!");
        };
        return actionListener;
    }

    private static  ActionListener deletePersonActionListener(JList<Persoana> jList){
        ActionListener actionListener = actionEvent -> {
            mainRepository.deletePersona(jList.getSelectedValue().getNume());
            jList.setListData(getPeopleAsArray());
            JOptionPane.showMessageDialog(null, "Person was deleted!!!");
        };
        return actionListener;
    }


    private static Persoana [] getPeopleAsArray(){
        return mainRepository.getPersoane().toArray(new Persoana[0]);
    }
}
