
package Bussines;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author justin
 */
public class Center {
    public void CenterPanel(JPanel panel){
        
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0; // Permitir que el panel crezca horizontalmente
        gbc.weighty = 1.0; // Permitir que el panel crezca verticalmente
        
        // Añadir un JLabel centrado
        JLabel label = new JLabel("Contenido Centrado", SwingConstants.CENTER);
        gbc.gridx = 0; // Columna 0
        gbc.gridy = 0; // Fila 0
        panel.add(label, gbc);

    }
}
