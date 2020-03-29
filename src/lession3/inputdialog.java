package lession3;

import javax.swing.*;

public class inputdialog {
    public static void main(String[] args) {
        String radiusStr;
        double radius, area;

        radiusStr = JOptionPane.showInputDialog("Enter the radius of circle");
        radius = Double.parseDouble(radiusStr);
        area = radius*radius*Math.PI;
        System.out.println("The area is " + area);

    }
}
