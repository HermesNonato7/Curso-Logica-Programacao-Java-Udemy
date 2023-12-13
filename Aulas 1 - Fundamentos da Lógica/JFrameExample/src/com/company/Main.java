package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        //Cria um JFrame (janela) com um título
        JFrame frame = new JFrame("JFrame Exemplo");

        // Painel que define o layout, usaremos o estilo GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());

        // Definições da posição atual do grid desejada [X,Y] layout
        GridBagConstraints constr = new GridBagConstraints();

        //Bordas Mínimas
        constr.insets = new Insets(5, 5, 5, 5);

        /*************** TEXTO E CAMPO DO NOME**********/
        // Título
        JLabel userNameLabel = new JLabel("Digite seu nome:");
        //Campo Editável do Nome
        JTextField userNameTxt = new JTextField(20);

        // Posição inicial do grid 0,0
        constr.gridx=0;constr.gridy=0;

        //Adiciona a label de nome no [0,0]
        panel.add(userNameLabel, constr);
        //Adiciona o campo de texto no [0,1]
        constr.gridx=1;
        panel.add(userNameTxt, constr);

        /*************** TEXTO E CAMPO DA IDADE **********/
        // Título de Idade
        JLabel pwdLabel = new JLabel("Digite sua idade :");
        // Declare Text fields
        JTextField ageTxt = new JTextField(20);

        // Posição inicial do grid 0,0
        constr.gridx=0;constr.gridy=1;

        //Adiciona a label de nome no [0,1]
        panel.add(pwdLabel, constr);
        //Adiciona o campo de texto no [1,1]
        constr.gridx=1;
        panel.add(ageTxt, constr);

        /*************** BOTÃO **********/
        //Posição
        constr.gridx=0;constr.gridy=2;
        //Tamanho
        constr.gridwidth = 2;
        //Alinhamento
        constr.anchor = GridBagConstraints.CENTER;

        // Botão com texto de "Enviar"
        JButton button = new JButton("Enviar Informações");

        // Adiciona um listener ao botão
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Modifica o texto do título
                JOptionPane.showMessageDialog(null, userNameTxt.getText() + " tem " + ageTxt.getText() + "anos");
            }
        });

        //Adiciona o botão ao panel
        panel.add(button, constr);

        //Adiciona o painel ao frame
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
