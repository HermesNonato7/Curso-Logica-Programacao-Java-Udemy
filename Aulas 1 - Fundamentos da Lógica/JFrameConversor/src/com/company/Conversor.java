package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Conversor extends JFrame {

    private JPanel mainPanel;
    private JTextField textFieldDolar;
    private JButton buttonConverter;
    private JLabel labelDolares;
    private JLabel labelReais;

    //Método Construtor
    public Conversor(String title) {
        //Chama o construtor de JFrame
        super(title);
        //Faz o programa encerrar ao fechar a janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Adiciona o Panel criado para a janela
        this.setContentPane(mainPanel);
        //Ajusta os tamanhos mínimos dos componentes
        this.pack();

        //Criou o listener do botão
        buttonConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double dolaresDigitados = Double.parseDouble(textFieldDolar.getText());
                double valorEmReais = dolaresDigitados * 4.94;
                //Muda a formatação para duas casas após vírgula
                DecimalFormat df = new DecimalFormat("0.00");
                labelReais.setText("R$" + df.format(valorEmReais));
            }
        });
    }

    public static void main(String[] args) {
        //Inicia o frame
        JFrame frame = new Conversor("Título");
        //Torna-o visível
        frame.setVisible(true);
    }
}
