/*
 * Created by JFormDesigner on Sat Sep 30 20:05:40 CST 2017
 */

package SockesDemo.ServerDemooooo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * @author nnn
 */
public class ChatRoom extends JFrame {
    public ChatRoom() {
        initComponents();
    }

    private void thisWindowClosing(WindowEvent e) {
        System.exit(0);
    }

    private void sendButtonActionPerformed(ActionEvent e) {
//        String Message = textMessage.getText().trim();
//        if (Message.equals("")){
//            return;
//        }
//        String log = ServerText.getText();
//        StringBuilder stringBuilder = new StringBuilder(log);
//        stringBuilder.append("\r\n").append(Message);
//        ServerText.setText(stringBuilder.toString());
//        textMessage.setText("");

    }

    public JButton getSendButton() {
        return sendButton;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        ServerText = new JTextArea();
        buttonBar = new JPanel();
        textMessage = new JTextField();
        sendButton = new JButton();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== scrollPane1 ========
                {

                    //---- ServerText ----
                    ServerText.setText("enter the message:");
                    scrollPane1.setViewportView(ServerText);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};
                buttonBar.add(textMessage, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- sendButton ----
                sendButton.setText("SEND");
                sendButton.addActionListener(e -> sendButtonActionPerformed(e));
                buttonBar.add(sendButton, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    public JTextArea ServerText;
    private JPanel buttonBar;

    public JTextField getTextMessage() {
        return textMessage;
    }

    private JTextField textMessage;
    private JButton sendButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setVisible(true);
        chatRoom.textMessage.grabFocus();

    }
}
