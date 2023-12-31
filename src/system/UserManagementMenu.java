package system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import design.RoundedButton;
import openfile.OpenFile;

public class UserManagementMenu extends OpenFile{
    private static JFrame UserManagementFrame;
    public static void UserManagementMenu() {
        UserManagementFrame = new JFrame("사용자 관리");
        UserManagementFrame.setBounds(560,200,400,300);
        UserManagementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserManagementFrame.getContentPane().setLayout(null);
        UserManagementFrame.setVisible(true);
        UserManagementFrame.getContentPane().setBackground(new Color(180,230,180));
        UserManagementFrame.setLocationRelativeTo(null);

        RoundedButton plusBtn = new RoundedButton("추가");
        plusBtn.setBounds(30,100,80,80);
        plusBtn.setFont(new Font("굴림", Font.BOLD, 20));
        UserManagementFrame.getContentPane().add(plusBtn);

        plusBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserManagementFrame.setVisible(false);
                PlusUser.PlusUser();
            }
        });

        RoundedButton deleteBtn = new RoundedButton("삭제");
        deleteBtn.setBounds(150,100,80,80);
        deleteBtn.setFont(new Font("굴림", Font.BOLD, 20));
        UserManagementFrame.getContentPane().add(deleteBtn);

        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserManagementFrame.setVisible(false);
                DeleteUser.DeleteUser(UserManagementFrame);
            }
        });

        RoundedButton correct = new RoundedButton("수정");
        correct.setBounds(270,100,80,80);
        correct.setFont(new Font("굴림", Font.BOLD, 20));
        UserManagementFrame.getContentPane().add(correct);

        correct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserManagementFrame.setVisible(false);
                TranslationUser.TranslationUser(UserManagementFrame);
            }
        });

        RoundedButton UserBackBtn = new RoundedButton("Back");
        UserBackBtn.setFont(new Font("굴림", Font.BOLD, 20));
        UserBackBtn.setBounds(20,10,80,45);
        UserManagementFrame.getContentPane().add(UserBackBtn);
        UserBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserManagementFrame.setVisible(false);
                Select_View.getFrame().setVisible(true);
            }
        });
    }
}