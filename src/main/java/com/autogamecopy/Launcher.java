/* 
 * Copyright (C) 2016 Benjamin Schellenberger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.autogamecopy;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Ben
 */
public class Launcher {

    private static final Logger log = Logger.getLogger(Launcher.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("This application does not support a headless environment.");
            System.exit(0);
        }

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            log.error("An exception occured while attempting to set up the default look and feel.", ex);
            if (JOptionPane.showConfirmDialog(null, "Failed to apply your system's default look and feel, would you like to continue?", "Auto Game Copy", JOptionPane.WARNING_MESSAGE) != JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }

        CoreFrame cf = new CoreFrame();
        cf.setLocationRelativeTo(null);
        cf.setVisible(true);
    }

}
