package engine;

import javax.swing.*;
import java.awt.*;

class UIPanel extends JPanel {

    JPanel getComponentWithVerticalTitle(JComponent comp, String label) {
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(4, 1));
        resultPanel.add(new JLabel(label, SwingConstants.CENTER));
        resultPanel.add(comp);
        return resultPanel;
    }

}