package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import BusinessLogic.*;
import BusinessLogic.Entities.sgUsers;
import Framework.AppException;

// Ventana que muestra el Login del Usuario

public class sgLogin extends JFrame implements ActionListener {
    
    private int intentos = 0;
    private JLabel sgUsernameLabel, sgPasswordLabel;
    private JTextField sgUsernameField;
    private JPasswordField sgPasswordField;
    private JButton sgLoginButton;

    public sgLogin() {
        super("Inicio de Secion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 225); 
        setLocationRelativeTo(null);

        // Crea los componentes
        sgUsernameLabel = new JLabel("Usuario:");
        sgPasswordLabel = new JLabel("Contraseña:");
        sgUsernameField = new JTextField(20);
        sgPasswordField = new JPasswordField(20);
        sgLoginButton = new JButton("Ingreso");
        sgLoginButton.addActionListener(this); 

    
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); 
        panel.add(sgUsernameLabel); panel.add(sgUsernameField); panel.add(sgPasswordLabel); panel.add(sgPasswordField); panel.add(new JLabel()); panel.add(sgLoginButton);

        add(panel);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        sgUsuariosBL usuarios = new sgUsuariosBL();
        boolean sgUsuarioRegistrado = false;
        String sgUsuarioIngresado = sgUsernameField.getText();
        String sgContrasenaIngresada = String.valueOf(sgPasswordField.getPassword());
    
        try {
            for (sgUsers user : usuarios.sgGetAllUsuarios()) {
                if (sgUsuarioIngresado.equals(user.sgGetUsuarios()) && sgContrasenaIngresada.equals(user.sgGetContrasenas())) {
                    JOptionPane.showMessageDialog(this, "Bienvenido " + sgUsuarioIngresado + "!");
                    dispose(); 
                    sgUsuarioRegistrado = true;
                    break;
                }
            }
        } catch (AppException e1) {
            e1.printStackTrace();
        }
    
        if ((!sgUsuarioRegistrado)){
            intentos++;
            if (intentos >= 3) {
                JOptionPane.showMessageDialog(this, "Ha llegado al numero maximo de intentos, lo sentimos :(.");
                dispose(); 
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        }
    }
    
}
