package com.jimmy.guiutility.component;

import javax.swing.JLabel;

public class NumberLabel extends JLabel {

    private static final long serialVersionUID = 1L;
    private boolean addZero;

    public NumberLabel(int number, boolean addZero) {
        super();
        this.addZero = addZero;
        setText(number);
    }

    public void setText(int number) {
        if (addZero && number < 10) {
            setText("0" + number);
        } else {
            setText(number + "");
        }
    }
}
