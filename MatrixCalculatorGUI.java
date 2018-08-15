package matrixCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MatrixCalculatorGUI implements ActionListener {

    private JTextField fieldOne, fieldTwo, fieldThree, fieldFour, fieldFive, fieldSix, fieldSeven, fieldEight, fieldNine,
            secondFieldOne, secondFieldTwo, secondFieldThree, secondFieldFour, secondFieldFive, secondFieldSix, secondFieldSeven, secondFieldEight, secondFieldNine,
            addFieldOne, addFieldTwo, addFieldThree, addFieldFour, addFieldFive, addFieldSix, addFieldSeven, addFieldEight, addFieldNine,
            multiplyFieldOne, multiplyFieldTwo, multiplyFieldThree, multiplyFieldFour, multiplyFieldFive, multiplyFieldSix, multiplyFieldSeven, multiplyFieldEight, multiplyFieldNine,
            checkAddFieldOne, checkAddFieldTwo, checkAddFieldThree, checkAddFieldFour, checkAddFieldFive, checkAddFieldSix, checkAddFieldSeven, checkAddFieldEight, checkAddFieldNine,
            checkMultiplyFieldOne, checkMultiplyFieldTwo, checkMultiplyFieldThree, checkMultiplyFieldFour, checkMultiplyFieldFive, checkMultiplyFieldSix, checkMultiplyFieldSeven, checkMultiplyFieldEight, checkMultiplyFieldNine;

    private JButton matrixOneRandom, matrixTwoRandom, clearMatrixOne, clearMatrixTwo, addMatrices, multiplyMatrices, clearAddMatrices, clearMultiplyMatrices, checkYourselfAdd, checkYourselfMultiply, clearCheckYourselfAdd, clearCheckYourselfMultiply, showResults, hideResults;

    void buildMatrixCalculatorGUI() {

        JFrame matrixCalculatorGUI = new JFrame("Primordial Matrix Calculator");

        /*
        ------------------------------ MATRIX ONE ------------------------------
         */

        matrixOneRandom = new JButton("Random 1st matrix");
        matrixOneRandom.setHorizontalAlignment(SwingConstants.CENTER);
        matrixOneRandom.setBounds(30, 30, 170, 25);
        matrixOneRandom.addActionListener(this);
        matrixOneRandom.setFocusPainted(false);
        matrixCalculatorGUI.add(matrixOneRandom);

        clearMatrixOne = new JButton("Clear 1st matrix");
        clearMatrixOne.setHorizontalAlignment(SwingConstants.CENTER);
        clearMatrixOne.setBounds(30, 58, 170, 25);
        clearMatrixOne.addActionListener(this);
        clearMatrixOne.setFocusPainted(false);
        matrixCalculatorGUI.add(clearMatrixOne);

        fieldOne = new JTextField();
        fieldOne.setHorizontalAlignment(SwingConstants.CENTER);
        fieldOne.setBounds(30, 87, 50, 50);
        fieldOne.addActionListener(this);
        matrixCalculatorGUI.add(fieldOne);

        fieldTwo = new JTextField();
        fieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
        fieldTwo.setBounds(90, 87, 50, 50);
        fieldTwo.addActionListener(this);
        matrixCalculatorGUI.add(fieldTwo);

        fieldThree = new JTextField();
        fieldThree.setHorizontalAlignment(SwingConstants.CENTER);
        fieldThree.setBounds(150, 87, 50, 50);
        fieldThree.addActionListener(this);
        matrixCalculatorGUI.add(fieldThree);

        fieldFour = new JTextField();
        fieldFour.setHorizontalAlignment(SwingConstants.CENTER);
        fieldFour.setBounds(30, 147, 50, 50);
        fieldFour.addActionListener(this);
        matrixCalculatorGUI.add(fieldFour);

        fieldFive = new JTextField();
        fieldFive.setHorizontalAlignment(SwingConstants.CENTER);
        fieldFive.setBounds(90, 147, 50, 50);
        fieldFive.addActionListener(this);
        matrixCalculatorGUI.add(fieldFive);

        fieldSix = new JTextField();
        fieldSix.setHorizontalAlignment(SwingConstants.CENTER);
        fieldSix.setBounds(150, 147, 50, 50);
        fieldSix.addActionListener(this);
        matrixCalculatorGUI.add(fieldSix);

        fieldSeven = new JTextField();
        fieldSeven.setHorizontalAlignment(SwingConstants.CENTER);
        fieldSeven.setBounds(30, 207, 50, 50);
        fieldSeven.addActionListener(this);
        matrixCalculatorGUI.add(fieldSeven);

        fieldEight = new JTextField();
        fieldEight.setHorizontalAlignment(SwingConstants.CENTER);
        fieldEight.setBounds(90, 207, 50, 50);
        fieldEight.addActionListener(this);
        matrixCalculatorGUI.add(fieldEight);

        fieldNine = new JTextField();
        fieldNine.setHorizontalAlignment(SwingConstants.CENTER);
        fieldNine.setBounds(150, 207, 50, 50);
        fieldNine.addActionListener(this);
        matrixCalculatorGUI.add(fieldNine);


        /*
        ------------------------------ MATRIX ONE ------------------------------
         */


        /*
        ------------------------------ MATRIX TWO ------------------------------
         */

        matrixTwoRandom = new JButton("Random 2nd matrix");
        matrixTwoRandom.setHorizontalAlignment(SwingConstants.CENTER);
        matrixTwoRandom.setBounds(30, 265, 170, 25);
        matrixTwoRandom.addActionListener(this);
        matrixTwoRandom.setFocusPainted(false);
        matrixCalculatorGUI.add(matrixTwoRandom);

        clearMatrixTwo = new JButton("Clear 2nd matrix");
        clearMatrixTwo.setHorizontalAlignment(SwingConstants.CENTER);
        clearMatrixTwo.setBounds(30, 293, 170, 25);
        clearMatrixTwo.addActionListener(this);
        clearMatrixTwo.setFocusPainted(false);
        matrixCalculatorGUI.add(clearMatrixTwo);

        secondFieldOne = new JTextField();
        secondFieldOne.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldOne.setBounds(30, 322, 50, 50);
        secondFieldOne.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldOne);

        secondFieldTwo = new JTextField();
        secondFieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldTwo.setBounds(90, 322, 50, 50);
        secondFieldTwo.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldTwo);

        secondFieldThree = new JTextField();
        secondFieldThree.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldThree.setBounds(150, 322, 50, 50);
        secondFieldThree.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldThree);

        secondFieldFour = new JTextField();
        secondFieldFour.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldFour.setBounds(30, 382, 50, 50);
        secondFieldFour.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldFour);

        secondFieldFive = new JTextField();
        secondFieldFive.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldFive.setBounds(90, 382, 50, 50);
        secondFieldFive.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldFive);

        secondFieldSix = new JTextField();
        secondFieldSix.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldSix.setBounds(150, 382, 50, 50);
        secondFieldSix.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldSix);

        secondFieldSeven = new JTextField();
        secondFieldSeven.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldSeven.setBounds(30, 442, 50, 50);
        secondFieldSeven.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldSeven);

        secondFieldEight = new JTextField();
        secondFieldEight.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldEight.setBounds(90, 442, 50, 50);
        secondFieldEight.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldEight);

        secondFieldNine = new JTextField();
        secondFieldNine.setHorizontalAlignment(SwingConstants.CENTER);
        secondFieldNine.setBounds(150, 442, 50, 50);
        secondFieldNine.addActionListener(this);
        matrixCalculatorGUI.add(secondFieldNine);

        /*
        ------------------------------ MATRIX TWO ------------------------------
         */


        /*
        ------------------------------ ADD MATRICES ------------------------------
         */

        addMatrices = new JButton("Add matrices");
        addMatrices.setHorizontalAlignment(SwingConstants.CENTER);
        addMatrices.setBounds(250, 30, 170, 25);
        addMatrices.setFocusPainted(false);
        addMatrices.addActionListener(this);
        matrixCalculatorGUI.add(addMatrices);

        clearAddMatrices = new JButton("Clear results");
        clearAddMatrices.setHorizontalAlignment(SwingConstants.CENTER);
        clearAddMatrices.setBounds(250, 58, 170, 25);
        clearAddMatrices.setFocusPainted(false);
        clearAddMatrices.addActionListener(this);
        matrixCalculatorGUI.add(clearAddMatrices);

        addFieldOne = new JTextField();
        addFieldOne.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldOne.setBounds(250, 87, 50, 50);
        addFieldOne.setEditable(false);
        matrixCalculatorGUI.add(addFieldOne);

        addFieldTwo = new JTextField();
        addFieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldTwo.setBounds(310, 87, 50, 50);
        addFieldTwo.setEditable(false);
        matrixCalculatorGUI.add(addFieldTwo);

        addFieldThree = new JTextField();
        addFieldThree.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldThree.setBounds(370, 87, 50, 50);
        addFieldThree.setEditable(false);
        matrixCalculatorGUI.add(addFieldThree);

        addFieldFour = new JTextField();
        addFieldFour.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldFour.setBounds(250, 147, 50, 50);
        addFieldFour.setEditable(false);
        matrixCalculatorGUI.add(addFieldFour);

        addFieldFive = new JTextField();
        addFieldFive.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldFive.setBounds(310, 147, 50, 50);
        addFieldFive.setEditable(false);
        matrixCalculatorGUI.add(addFieldFive);

        addFieldSix = new JTextField();
        addFieldSix.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldSix.setBounds(370, 147, 50, 50);
        addFieldSix.setEditable(false);
        matrixCalculatorGUI.add(addFieldSix);

        addFieldSeven = new JTextField();
        addFieldSeven.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldSeven.setBounds(250, 207, 50, 50);
        addFieldSeven.setEditable(false);
        matrixCalculatorGUI.add(addFieldSeven);

        addFieldEight = new JTextField();
        addFieldEight.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldEight.setBounds(310, 207, 50, 50);
        addFieldEight.setEditable(false);
        matrixCalculatorGUI.add(addFieldEight);

        addFieldNine = new JTextField();
        addFieldNine.setHorizontalAlignment(SwingConstants.CENTER);
        addFieldNine.setBounds(370, 207, 50, 50);
        addFieldNine.setEditable(false);
        matrixCalculatorGUI.add(addFieldNine);

        /*
        ------------------------------ ADD MATRICES ------------------------------
         */


        /*
        ------------------------------ MULTIPLY MATRICES ------------------------------
         */

        multiplyMatrices = new JButton("Multiply matrices");
        multiplyMatrices.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyMatrices.setBounds(250, 265, 170, 25);
        multiplyMatrices.addActionListener(this);
        multiplyMatrices.setFocusPainted(false);
        matrixCalculatorGUI.add(multiplyMatrices);

        clearMultiplyMatrices = new JButton("Clear results");
        clearMultiplyMatrices.setHorizontalAlignment(SwingConstants.CENTER);
        clearMultiplyMatrices.setBounds(250, 293, 170, 25);
        clearMultiplyMatrices.addActionListener(this);
        clearMultiplyMatrices.setFocusPainted(false);
        matrixCalculatorGUI.add(clearMultiplyMatrices);

        multiplyFieldOne = new JTextField();
        multiplyFieldOne.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldOne.setBounds(250, 322, 50, 50);
        multiplyFieldOne.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldOne);

        multiplyFieldTwo = new JTextField();
        multiplyFieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldTwo.setBounds(310, 322, 50, 50);
        multiplyFieldTwo.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldTwo);

        multiplyFieldThree = new JTextField();
        multiplyFieldThree.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldThree.setBounds(370, 322, 50, 50);
        multiplyFieldThree.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldThree);

        multiplyFieldFour = new JTextField();
        multiplyFieldFour.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldFour.setBounds(250, 382, 50, 50);
        multiplyFieldFour.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldFour);

        multiplyFieldFive = new JTextField();
        multiplyFieldFive.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldFive.setBounds(310, 382, 50, 50);
        multiplyFieldFive.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldFive);

        multiplyFieldSix = new JTextField();
        multiplyFieldSix.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldSix.setBounds(370, 382, 50, 50);
        multiplyFieldSix.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldSix);

        multiplyFieldSeven = new JTextField();
        multiplyFieldSeven.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldSeven.setBounds(250, 442, 50, 50);
        multiplyFieldSeven.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldSeven);

        multiplyFieldEight = new JTextField();
        multiplyFieldEight.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldEight.setBounds(310, 442, 50, 50);
        multiplyFieldEight.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldEight);

        multiplyFieldNine = new JTextField();
        multiplyFieldNine.setHorizontalAlignment(SwingConstants.CENTER);
        multiplyFieldNine.setBounds(370, 442, 50, 50);
        multiplyFieldNine.setEditable(false);
        matrixCalculatorGUI.add(multiplyFieldNine);

        /*
        ------------------------------ MULTIPLY MATRICES ------------------------------
         */


        /*
        ------------------------------ CHECK YOURSELF ADD ------------------------------
         */

        checkYourselfAdd = new JButton("Check result");
        checkYourselfAdd.setHorizontalAlignment(SwingConstants.CENTER);
        checkYourselfAdd.setBounds(470, 30, 170, 25);
        checkYourselfAdd.addActionListener(this);
        checkYourselfAdd.setFocusPainted(false);
        matrixCalculatorGUI.add(checkYourselfAdd);

        clearCheckYourselfAdd = new JButton("Clear adding matrix");
        clearCheckYourselfAdd.setHorizontalAlignment(SwingConstants.CENTER);
        clearCheckYourselfAdd.setBounds(470, 58, 170, 25);
        clearCheckYourselfAdd.addActionListener(this);
        clearCheckYourselfAdd.setFocusPainted(false);
        matrixCalculatorGUI.add(clearCheckYourselfAdd);

        checkAddFieldOne = new JTextField();
        checkAddFieldOne.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldOne.setBounds(470, 87, 50, 50);
        checkAddFieldOne.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldOne);

        checkAddFieldTwo = new JTextField();
        checkAddFieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldTwo.setBounds(530, 87, 50, 50);
        checkAddFieldTwo.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldTwo);

        checkAddFieldThree = new JTextField();
        checkAddFieldThree.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldThree.setBounds(590, 87, 50, 50);
        checkAddFieldThree.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldThree);

        checkAddFieldFour = new JTextField();
        checkAddFieldFour.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldFour.setBounds(470, 147, 50, 50);
        checkAddFieldFour.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldFour);

        checkAddFieldFive = new JTextField();
        checkAddFieldFive.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldFive.setBounds(530, 147, 50, 50);
        checkAddFieldFive.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldFive);

        checkAddFieldSix = new JTextField();
        checkAddFieldSix.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldSix.setBounds(590, 147, 50, 50);
        checkAddFieldSix.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldSix);

        checkAddFieldSeven = new JTextField();
        checkAddFieldSeven.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldSeven.setBounds(470, 207, 50, 50);
        checkAddFieldSeven.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldSeven);

        checkAddFieldEight = new JTextField();
        checkAddFieldEight.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldEight.setBounds(530, 207, 50, 50);
        checkAddFieldEight.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldEight);

        checkAddFieldNine = new JTextField();
        checkAddFieldNine.setHorizontalAlignment(SwingConstants.CENTER);
        checkAddFieldNine.setBounds(590, 207, 50, 50);
        checkAddFieldNine.addActionListener(this);
        matrixCalculatorGUI.add(checkAddFieldNine);

        /*
        ------------------------------ CHECK YOURSELF ADD ------------------------------
         */


        /*
        ------------------------------ CHECK YOURSELF MULTIPLY ------------------------------
         */

        checkYourselfMultiply = new JButton("Check result");
        checkYourselfMultiply.setHorizontalAlignment(SwingConstants.CENTER);
        checkYourselfMultiply.setBounds(470, 265, 170, 25);
        checkYourselfMultiply.addActionListener(this);
        checkYourselfMultiply.setFocusPainted(false);
        matrixCalculatorGUI.add(checkYourselfMultiply);

        clearCheckYourselfMultiply = new JButton("Clear multiplying matrix");
        clearCheckYourselfMultiply.setHorizontalAlignment(SwingConstants.CENTER);
        clearCheckYourselfMultiply.setBounds(470, 293, 170, 25);
        clearCheckYourselfMultiply.addActionListener(this);
        clearCheckYourselfMultiply.setFocusPainted(false);
        matrixCalculatorGUI.add(clearCheckYourselfMultiply);

        checkMultiplyFieldOne = new JTextField();
        checkMultiplyFieldOne.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldOne.setBounds(470, 322, 50, 50);
        checkMultiplyFieldOne.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldOne);

        checkMultiplyFieldTwo = new JTextField();
        checkMultiplyFieldTwo.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldTwo.setBounds(530, 322, 50, 50);
        checkMultiplyFieldTwo.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldTwo);

        checkMultiplyFieldThree = new JTextField();
        checkMultiplyFieldThree.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldThree.setBounds(590, 322, 50, 50);
        checkMultiplyFieldThree.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldThree);

        checkMultiplyFieldFour = new JTextField();
        checkMultiplyFieldFour.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldFour.setBounds(470, 382, 50, 50);
        checkMultiplyFieldFour.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldFour);

        checkMultiplyFieldFive = new JTextField();
        checkMultiplyFieldFive.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldFive.setBounds(530, 382, 50, 50);
        checkMultiplyFieldFive.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldFive);

        checkMultiplyFieldSix = new JTextField();
        checkMultiplyFieldSix.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldSix.setBounds(590, 382, 50, 50);
        checkMultiplyFieldSix.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldSix);

        checkMultiplyFieldSeven = new JTextField();
        checkMultiplyFieldSeven.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldSeven.setBounds(470, 442, 50, 50);
        checkMultiplyFieldSeven.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldSeven);

        checkMultiplyFieldEight = new JTextField();
        checkMultiplyFieldEight.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldEight.setBounds(530, 442, 50, 50);
        checkMultiplyFieldEight.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldEight);

        checkMultiplyFieldNine = new JTextField();
        checkMultiplyFieldNine.setHorizontalAlignment(SwingConstants.CENTER);
        checkMultiplyFieldNine.setBounds(590, 442, 50, 50);
        checkMultiplyFieldNine.addActionListener(this);
        matrixCalculatorGUI.add(checkMultiplyFieldNine);

        /*
        ------------------------------ CHECK YOURSELF MULTIPLY ------------------------------
         */


        /*
        ------------------------------ SHOW/HIDE RESULT ------------------------------
         */

        showResults = new JButton("Show adding/multiplying results");
        showResults.setHorizontalAlignment(SwingConstants.CENTER);
        showResults.setBounds(30,502, 300, 50);
        showResults.addActionListener(this);
        showResults.setFocusPainted(false);
        matrixCalculatorGUI.add(showResults);

        hideResults = new JButton("Hide adding/multiplying results");
        hideResults.setHorizontalAlignment(SwingConstants.CENTER);
        hideResults.setBounds(340,502, 300, 50);
        hideResults.addActionListener(this);
        hideResults.setFocusPainted(false);
        matrixCalculatorGUI.add(hideResults);

        /*
        ------------------------------ SHOW/HIDE RESULT ------------------------------
         */

        matrixCalculatorGUI.setSize(687, 610);
        matrixCalculatorGUI.setLayout(null);
        matrixCalculatorGUI.setVisible(true);
        matrixCalculatorGUI.setResizable(false);
        matrixCalculatorGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent eventActionListener) {

        if (eventActionListener.getSource() == addMatrices) {
            int firstNumber = Integer.parseInt(fieldOne.getText()) + Integer.parseInt(secondFieldOne.getText());
            addFieldOne.setText("" + (firstNumber));
            int secondNumber = Integer.parseInt(fieldTwo.getText()) + Integer.parseInt(secondFieldTwo.getText());
            addFieldTwo.setText("" + (secondNumber));
            int thirdNumber = Integer.parseInt(fieldThree.getText()) + Integer.parseInt(secondFieldThree.getText());
            addFieldThree.setText("" + (thirdNumber));
            int fourthNumber = Integer.parseInt(fieldFour.getText()) + Integer.parseInt(secondFieldFour.getText());
            addFieldFour.setText("" + (fourthNumber));
            int fifthNumber = Integer.parseInt(fieldFive.getText()) + Integer.parseInt(secondFieldFive.getText());
            addFieldFive.setText("" + (fifthNumber));
            int sixthNumber = Integer.parseInt(fieldSix.getText()) + Integer.parseInt(secondFieldSix.getText());
            addFieldSix.setText("" + (sixthNumber));
            int seventhNumber = Integer.parseInt(fieldSeven.getText()) + Integer.parseInt(secondFieldSeven.getText());
            addFieldSeven.setText("" + (seventhNumber));
            int eighthNumber = Integer.parseInt(fieldEight.getText()) + Integer.parseInt(secondFieldEight.getText());
            addFieldEight.setText("" + (eighthNumber));
            int ninthNumber = Integer.parseInt(fieldNine.getText()) + Integer.parseInt(secondFieldNine.getText());
            addFieldNine.setText("" + (ninthNumber));
        }

        if (eventActionListener.getSource() == multiplyMatrices) {
            int firstNumber =
                    (Integer.parseInt(fieldOne.getText()) * Integer.parseInt(secondFieldOne.getText()) +
                            (Integer.parseInt(fieldTwo.getText()) * Integer.parseInt(secondFieldFour.getText()) +
                                    (Integer.parseInt(fieldThree.getText()) * Integer.parseInt(secondFieldSeven.getText()))));
            multiplyFieldOne.setText("" + (firstNumber));
            int secondNumber =
                    (Integer.parseInt(fieldOne.getText()) * Integer.parseInt(secondFieldTwo.getText()) +
                            (Integer.parseInt(fieldTwo.getText()) * Integer.parseInt(secondFieldFive.getText()) +
                                    (Integer.parseInt(fieldThree.getText()) * Integer.parseInt(secondFieldEight.getText()))));
            multiplyFieldTwo.setText("" + (secondNumber));
            int thirdNumber =
                    (Integer.parseInt(fieldOne.getText()) * Integer.parseInt(secondFieldThree.getText()) +
                            (Integer.parseInt(fieldTwo.getText()) * Integer.parseInt(secondFieldSix.getText()) +
                                    (Integer.parseInt(fieldThree.getText()) * Integer.parseInt(secondFieldNine.getText()))));
            multiplyFieldThree.setText("" + (thirdNumber));
            int fourthNumber =
                    (Integer.parseInt(fieldFour.getText()) * Integer.parseInt(secondFieldOne.getText()) +
                            (Integer.parseInt(fieldFive.getText()) * Integer.parseInt(secondFieldFour.getText()) +
                                    (Integer.parseInt(fieldSix.getText()) * Integer.parseInt(secondFieldSeven.getText()))));
            multiplyFieldFour.setText("" + (fourthNumber));
            int fifthNumber =
                    (Integer.parseInt(fieldFour.getText()) * Integer.parseInt(secondFieldTwo.getText()) +
                            (Integer.parseInt(fieldFive.getText()) * Integer.parseInt(secondFieldFive.getText()) +
                                    (Integer.parseInt(fieldSix.getText()) * Integer.parseInt(secondFieldEight.getText()))));
            multiplyFieldFive.setText("" + (fifthNumber));
            int sixthNumber =
                    (Integer.parseInt(fieldFour.getText()) * Integer.parseInt(secondFieldThree.getText()) +
                            (Integer.parseInt(fieldFive.getText()) * Integer.parseInt(secondFieldSix.getText()) +
                                    (Integer.parseInt(fieldSix.getText()) * Integer.parseInt(secondFieldNine.getText()))));
            multiplyFieldSix.setText("" + (sixthNumber));
            int seventhNumber =
                    (Integer.parseInt(fieldSeven.getText()) * Integer.parseInt(secondFieldOne.getText()) +
                            (Integer.parseInt(fieldEight.getText()) * Integer.parseInt(secondFieldFour.getText()) +
                                    (Integer.parseInt(fieldNine.getText()) * Integer.parseInt(secondFieldSeven.getText()))));
            multiplyFieldSeven.setText("" + (seventhNumber));
            int eightNumber =
                    (Integer.parseInt(fieldSeven.getText()) * Integer.parseInt(secondFieldTwo.getText()) +
                            (Integer.parseInt(fieldEight.getText()) * Integer.parseInt(secondFieldFive.getText()) +
                                    (Integer.parseInt(fieldNine.getText()) * Integer.parseInt(secondFieldEight.getText()))));
            multiplyFieldEight.setText("" + (eightNumber));
            int ninthNumber =
                    (Integer.parseInt(fieldSeven.getText()) * Integer.parseInt(secondFieldThree.getText()) +
                            (Integer.parseInt(fieldEight.getText()) * Integer.parseInt(secondFieldSix.getText()) +
                                    (Integer.parseInt(fieldNine.getText()) * Integer.parseInt(secondFieldNine.getText()))));
            multiplyFieldNine.setText("" + (ninthNumber));
        }

        if (eventActionListener.getSource() == matrixOneRandom) {
            fieldOne.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldTwo.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldThree.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldFour.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldFive.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldSix.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldSeven.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldEight.setText(String.format("%d", (int)(Math.random() * 11)));
            fieldNine.setText(String.format("%d", (int)(Math.random() * 11)));
        }

        if (eventActionListener.getSource() == matrixTwoRandom) {
            secondFieldOne.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldTwo.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldThree.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldFour.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldFive.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldSix.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldSeven.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldEight.setText(String.format("%d", (int)(Math.random() * 11)));
            secondFieldNine.setText(String.format("%d", (int)(Math.random() * 11)));
        }

        if (eventActionListener.getSource() == checkYourselfAdd) {
            if (checkAddFieldOne.getText().equals(addFieldOne.getText())) {
                checkAddFieldOne.setBackground(Color.green);
            } else {
                checkAddFieldOne.setBackground(Color.red);
            }
            if (checkAddFieldTwo.getText().equals(addFieldTwo.getText())) {
                checkAddFieldTwo.setBackground(Color.green);
            } else {
                checkAddFieldTwo.setBackground(Color.red);
            }
            if (checkAddFieldThree.getText().equals(addFieldThree.getText())) {
                checkAddFieldThree.setBackground(Color.green);
            } else {
                checkAddFieldThree.setBackground(Color.red);
            }
            if (checkAddFieldFour.getText().equals(addFieldFour.getText())) {
                checkAddFieldFour.setBackground(Color.green);
            } else {
                checkAddFieldFour.setBackground(Color.red);
            }
            if (checkAddFieldFive.getText().equals(addFieldFive.getText())) {
                checkAddFieldFive.setBackground(Color.green);
            } else {
                checkAddFieldFive.setBackground(Color.red);
            }
            if (checkAddFieldSix.getText().equals(addFieldSix.getText())) {
                checkAddFieldSix.setBackground(Color.green);
            } else {
                checkAddFieldSix.setBackground(Color.red);
            }
            if (checkAddFieldSeven.getText().equals(addFieldSeven.getText())) {
                checkAddFieldSeven.setBackground(Color.green);
            } else {
                checkAddFieldSeven.setBackground(Color.red);
            }
            if (checkAddFieldEight.getText().equals(addFieldEight.getText())) {
                checkAddFieldEight.setBackground(Color.green);
            } else {
                checkAddFieldEight.setBackground(Color.red);
            }
            if (checkAddFieldNine.getText().equals(addFieldNine.getText())) {
                checkAddFieldNine.setBackground(Color.green);
            } else {
                checkAddFieldNine.setBackground(Color.red);
            }
        }

        if (eventActionListener.getSource() == checkYourselfMultiply) {
            if (checkMultiplyFieldOne.getText().equals(multiplyFieldOne.getText())) {
                checkMultiplyFieldOne.setBackground(Color.green);
            } else {
                checkMultiplyFieldOne.setBackground(Color.red);
            }
            if (checkMultiplyFieldTwo.getText().equals(multiplyFieldTwo.getText())) {
                checkMultiplyFieldTwo.setBackground(Color.green);
            } else {
                checkMultiplyFieldTwo.setBackground(Color.red);
            }
            if (checkMultiplyFieldThree.getText().equals(multiplyFieldThree.getText())) {
                checkMultiplyFieldThree.setBackground(Color.green);
            } else {
                checkMultiplyFieldThree.setBackground(Color.red);
            }
            if (checkMultiplyFieldFour.getText().equals(multiplyFieldFour.getText())) {
                checkMultiplyFieldFour.setBackground(Color.green);
            } else {
                checkMultiplyFieldFour.setBackground(Color.red);
            }
            if (checkMultiplyFieldFive.getText().equals(multiplyFieldFive.getText())) {
                checkMultiplyFieldFive.setBackground(Color.green);
            } else {
                checkMultiplyFieldFive.setBackground(Color.red);
            }
            if (checkMultiplyFieldSix.getText().equals(multiplyFieldSix.getText())) {
                checkMultiplyFieldSix.setBackground(Color.green);
            } else {
                checkMultiplyFieldSix.setBackground(Color.red);
            }
            if (checkMultiplyFieldSeven.getText().equals(multiplyFieldSeven.getText())) {
                checkMultiplyFieldSeven.setBackground(Color.green);
            } else {
                checkMultiplyFieldSeven.setBackground(Color.red);
            }
            if (checkMultiplyFieldEight.getText().equals(multiplyFieldEight.getText())) {
                checkMultiplyFieldEight.setBackground(Color.green);
            } else {
                checkMultiplyFieldEight.setBackground(Color.red);
            }
            if (checkMultiplyFieldNine.getText().equals(multiplyFieldNine.getText())) {
                checkMultiplyFieldNine.setBackground(Color.green);
            } else {
                checkMultiplyFieldNine.setBackground(Color.red);
            }
        }

        if (eventActionListener.getSource() == clearMatrixOne) {
            fieldOne.setText("");
            fieldTwo.setText("");
            fieldThree.setText("");
            fieldFour.setText("");
            fieldFive.setText("");
            fieldSix.setText("");
            fieldSeven.setText("");
            fieldEight.setText("");
            fieldNine.setText("");
        }

        if (eventActionListener.getSource() == clearMatrixTwo) {
            secondFieldOne.setText("");
            secondFieldTwo.setText("");
            secondFieldThree.setText("");
            secondFieldFour.setText("");
            secondFieldFive.setText("");
            secondFieldSix.setText("");
            secondFieldSeven.setText("");
            secondFieldEight.setText("");
            secondFieldNine.setText("");
        }

        if (eventActionListener.getSource() == clearAddMatrices) {
            addFieldOne.setText("");
            addFieldTwo.setText("");
            addFieldThree.setText("");
            addFieldFour.setText("");
            addFieldFive.setText("");
            addFieldSix.setText("");
            addFieldSeven.setText("");
            addFieldEight.setText("");
            addFieldNine.setText("");
        }

        if (eventActionListener.getSource() == clearMultiplyMatrices) {
            multiplyFieldOne.setText("");
            multiplyFieldTwo.setText("");
            multiplyFieldThree.setText("");
            multiplyFieldFour.setText("");
            multiplyFieldFive.setText("");
            multiplyFieldSix.setText("");
            multiplyFieldSeven.setText("");
            multiplyFieldEight.setText("");
            multiplyFieldNine.setText("");
        }

        if (eventActionListener.getSource() == clearCheckYourselfAdd) {
            checkAddFieldOne.setText("");
            checkAddFieldOne.setBackground(Color.white);
            checkAddFieldTwo.setText("");
            checkAddFieldTwo.setBackground(Color.white);
            checkAddFieldThree.setText("");
            checkAddFieldThree.setBackground(Color.white);
            checkAddFieldFour.setText("");
            checkAddFieldFour.setBackground(Color.white);
            checkAddFieldFive.setText("");
            checkAddFieldFive.setBackground(Color.white);
            checkAddFieldSix.setText("");
            checkAddFieldSix.setBackground(Color.white);
            checkAddFieldSeven.setText("");
            checkAddFieldSeven.setBackground(Color.white);
            checkAddFieldEight.setText("");
            checkAddFieldEight.setBackground(Color.white);
            checkAddFieldNine.setText("");
            checkAddFieldNine.setBackground(Color.white);
        }

        if (eventActionListener.getSource() == clearCheckYourselfMultiply) {
            checkMultiplyFieldOne.setText("");
            checkMultiplyFieldOne.setBackground(Color.white);
            checkMultiplyFieldTwo.setText("");
            checkMultiplyFieldTwo.setBackground(Color.white);
            checkMultiplyFieldThree.setText("");
            checkMultiplyFieldThree.setBackground(Color.white);
            checkMultiplyFieldFour.setText("");
            checkMultiplyFieldFour.setBackground(Color.white);
            checkMultiplyFieldFive.setText("");
            checkMultiplyFieldFive.setBackground(Color.white);
            checkMultiplyFieldSix.setText("");
            checkMultiplyFieldSix.setBackground(Color.white);
            checkMultiplyFieldSeven.setText("");
            checkMultiplyFieldSeven.setBackground(Color.white);
            checkMultiplyFieldEight.setText("");
            checkMultiplyFieldEight.setBackground(Color.white);
            checkMultiplyFieldNine.setText("");
            checkMultiplyFieldNine.setBackground(Color.white);
        }

        if (eventActionListener.getSource() == showResults) {
            addFieldOne.setVisible(true);
            addFieldTwo.setVisible(true);
            addFieldThree.setVisible(true);
            addFieldFour.setVisible(true);
            addFieldFive.setVisible(true);
            addFieldSix.setVisible(true);
            addFieldSeven.setVisible(true);
            addFieldEight.setVisible(true);
            addFieldNine.setVisible(true);
            multiplyFieldOne.setVisible(true);
            multiplyFieldTwo.setVisible(true);
            multiplyFieldThree.setVisible(true);
            multiplyFieldFour.setVisible(true);
            multiplyFieldFive.setVisible(true);
            multiplyFieldSix.setVisible(true);
            multiplyFieldSeven.setVisible(true);
            multiplyFieldEight.setVisible(true);
            multiplyFieldNine.setVisible(true);
        }

        if (eventActionListener.getSource() == hideResults) {
            addFieldOne.setVisible(false);
            addFieldTwo.setVisible(false);
            addFieldThree.setVisible(false);
            addFieldFour.setVisible(false);
            addFieldFive.setVisible(false);
            addFieldSix.setVisible(false);
            addFieldSeven.setVisible(false);
            addFieldEight.setVisible(false);
            addFieldNine.setVisible(false);
            multiplyFieldOne.setVisible(false);
            multiplyFieldTwo.setVisible(false);
            multiplyFieldThree.setVisible(false);
            multiplyFieldFour.setVisible(false);
            multiplyFieldFive.setVisible(false);
            multiplyFieldSix.setVisible(false);
            multiplyFieldSeven.setVisible(false);
            multiplyFieldEight.setVisible(false);
            multiplyFieldNine.setVisible(false);
        }
    }
}
