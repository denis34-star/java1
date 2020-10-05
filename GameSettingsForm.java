package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettingsForm extends JFrame {
    GameSettingsForm gameSettingsForm = this;
    public GameSettingsForm() {
        setTitle("Настройка игры");
        setBounds(450, 450, 240, 190);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel jLabelMode = new JLabel("Выберете режим игры:");
        add(jLabelMode);
        JRadioButton radioButtonModelTwoPlayers = new JRadioButton("Игрок против игрока");
        add(radioButtonModelTwoPlayers);
        radioButtonModelTwoPlayers.setSelected(true);
        final JRadioButton radioButtonModelAgainstAI = new JRadioButton("Игрок против компьютера");
        add(radioButtonModelAgainstAI);
        JLabel jLabelAILevel = new JLabel("Выберете уровень AI:");
        add(jLabelAILevel);
        final JSlider jSlider = new JSlider(0,2, 0);
        add(jSlider);
        jSlider.setAlignmentX(LEFT_ALIGNMENT);
        jSlider.setVisible(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonModelTwoPlayers);
        buttonGroup.add(radioButtonModelAgainstAI);
        JLabel jLabelLinesCount = new JLabel("Размер поля по умолчанию 3 на 3");
        add(jLabelLinesCount);
        final JTextField jTextFieldLinesCount = new JTextField();
        jTextFieldLinesCount.setMaximumSize(new Dimension(100, 20));
        add(jTextFieldLinesCount);
        JButton jButtonSetSettigs = new JButton("Начать игру!");
        add(jButtonSetSettigs);
        setVisible(true);

        radioButtonModelAgainstAI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonModelAgainstAI.isSelected()) {
                    jSlider.setVisible(false);
                }

            }
        });
        jButtonSetSettigs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGameField gameField = MainGameField.GetInstance();
                if (jTextFieldLinesCount.getText().is Empty()) {
                    gameField.linesCount = 3;
                }
                else {
                    try {
                     gameField.linesCount = Integer.parseInt(jTextFieldLinesCount.getText());
                    }
                    catch (NumberFormatException ex) {
                        System.out.println("Необходимо ввести целое число!");
                    }
                }
                gameField.startNewGame();
                if (radioButtonModelAgainstAI.isSelected()) {
                    gameField.gameMode = 2;
                }
                gameField.aiLevel = jSlider.getValue();
                gameSettingsForm.setVisible(false);
            }
        });

    }

}
