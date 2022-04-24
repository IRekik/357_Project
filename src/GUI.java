import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI {


    static int difficulty = 0;
    static boolean learning = true;

    private JButton createButton(String s) {
        JButton button = new JButton(s);

        return button;
    }

    private void setDifficulty(int x) {
        difficulty = x;
    }

    private void setLearning(boolean x) {
        learning = x;
    }


    public GUI() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Learning by Ear");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JLabel title = new JLabel("Learning by Ear");	title.setFont(new Font("Verdana",1,30));	title.setBounds(165, 0, 400, 100);
        JLabel difficulty = new JLabel("Difficulty");	difficulty.setFont(new Font("Verdana",1,20));	difficulty.setBounds(235, 65, 400, 100);

        JRadioButton option1 = new JRadioButton("To Learn");
        JRadioButton option2= new JRadioButton("Challenge");
        ButtonGroup radiogroup = new ButtonGroup();
        radiogroup.add(option1); radiogroup.add(option2);
        option1.setSelected(true);
        option1.setBounds(200, 140, 80, 50);
        option2.setBounds(300, 140, 120, 50);
        option1.setFocusable(false);
        option2.setFocusable(false);


        JButton button1 = createButton("Easy");	button1.setBounds(60, 200, 130, 50);	button1.setFocusable(false);
        JButton button2 = createButton("Medium");	button2.setBounds(230, 200, 130, 50);	button2.setFocusable(false);
        JButton button3 = createButton("Hard");	button3.setBounds(400, 200, 130, 50);	button3.setFocusable(false);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                setDifficulty(1);
                MusicalTraining();

            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                setDifficulty(2);
                MusicalTraining();

                System.out.println("Mediumest");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                setDifficulty(3);
                MusicalTraining();

                System.out.println("Hardest");
            }
        });

        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLearning(true);
                System.out.println("Learning Time");
            }
        });

        option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLearning(false);
                System.out.println("Challenge Time");
            }
        });

        panel.setLayout(null);
        panel.add(title);
        panel.add(difficulty);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(option1);
        panel.add(option2);

        frame.add(panel, BorderLayout.CENTER);



    }

    public int[] get4Numbers() {
        Random rand = new Random();
        boolean finished = false;
        int[] arr = new int[4];
        int i1;
        int i2;
        int i3;
        int i4;
        while (!finished) {
            i1 = rand.nextInt(12);
            arr[0] = i1;
            i2 = rand.nextInt(12);
            while(true) {
                if(i2==i1) {
                    i2 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[1] = i2;
            i3 = rand.nextInt(12);
            while(true) {
                if(i3==i1 || i3==i2) {
                    i3 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[2] = i3;
            i4 = rand.nextInt(12);
            while(true) {
                if(i4==i1 || i4==i2 || i4 == i3) {
                    i4 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[3] = i4;
            finished=true;
        }
        return arr;

    }

    public int[] get6Numbers() {
        Random rand = new Random();
        boolean finished = false;
        int[] arr = new int[6];
        int i1;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        while (!finished) {
            i1 = rand.nextInt(12);
            arr[0] = i1;
            i2 = rand.nextInt(12);
            while(true) {
                if(i2==i1) {
                    i2 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[1] = i2;
            i3 = rand.nextInt(12);
            while(true) {
                if(i3==i1 || i3==i2) {
                    i3 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[2] = i3;
            i4 = rand.nextInt(12);
            while(true) {
                if(i4==i1 || i4==i2 || i4 == i3) {
                    i4 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[3] = i4;
            i5 = rand.nextInt(12);
            while(true) {
                if(i5==i1 || i5==i2 || i5 == i3 || i5 == i4) {
                    i5 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[4] = i5;
            i6 = rand.nextInt(12);
            while(true) {
                if(i6==i1 || i6==i2 || i6 == i3 || i6 == i4 || i6 == i5) {
                    i6 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[5] = i6;
            finished=true;
        }
        return arr;

    }

    public int[] get8Numbers() {
        Random rand = new Random();
        boolean finished = false;
        int[] arr = new int[8];
        int i1;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        while (!finished) {
            i1 = rand.nextInt(12);
            arr[0] = i1;
            i2 = rand.nextInt(12);
            while(true) {
                if(i2==i1) {
                    i2 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[1] = i2;
            i3 = rand.nextInt(12);
            while(true) {
                if(i3==i1 || i3==i2) {
                    i3 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[2] = i3;
            i4 = rand.nextInt(12);
            while(true) {
                if(i4==i1 || i4==i2 || i4 == i3) {
                    i4 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[3] = i4;
            i5 = rand.nextInt(12);
            while(true) {
                if(i5==i1 || i5==i2 || i5 == i3 || i5 == i4) {
                    i5 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[4] = i5;
            i6 = rand.nextInt(12);
            while(true) {
                if(i6==i1 || i6==i2 || i6 == i3 || i6 == i4 || i6 == i5) {
                    i6 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[5] = i6;
            i7 = rand.nextInt(12);
            while(true) {
                if(i7==i1 || i7==i2 || i7 == i3 || i7 == i4 || i7 == i5 || i7 == i6) {
                    i7 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[6] = i7;
            i8 = rand.nextInt(12);
            while(true) {
                if(i8==i1 || i8==i2 || i8 == i3 || i8 == i4 || i8 == i5 || i8 == i6 || i8 == i7) {
                    i8 = rand.nextInt(12);
                }
                else {break;}
            }
            arr[7] = i8;
            finished=true;
        }
        return arr;

    }

    public void MusicalTraining() {
        JFrame MusicalFrame = new JFrame();
        JPanel MusicalPanel = new JPanel();
        JButton back = new JButton();
        MusicalFrame.setTitle("Learning by Ear");
        MusicalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ArrayList<JButton> NoteList = new ArrayList<JButton>();
        if(learning == true) {
            JButton note1 = createButton("Note1");
            JButton note2 = createButton("Note2");
            JButton note3 = createButton("Note3");
            JButton note4 = createButton("Note4");
            JButton note5 = createButton("Note5");
            JButton note6 = createButton("Note6");
            JButton note7 = createButton("Note7");
            JButton note8 = createButton("Note8");
            JButton note9 = createButton("Note9");
            JButton note10 = createButton("Note10");
            JButton note11 = createButton("Note11");
            JButton note12 = createButton("Note12");
            NoteList.add(note1);NoteList.add(note2);NoteList.add(note3);NoteList.add(note4);
            NoteList.add(note5);NoteList.add(note6);NoteList.add(note7);NoteList.add(note8);
            NoteList.add(note9);NoteList.add(note10);NoteList.add(note11);NoteList.add(note12);
        }
        else {
            JButton note1 = createButton("Note");
            JButton note2 = createButton("Note");
            JButton note3 = createButton("Note");
            JButton note4 = createButton("Note");
            JButton note5 = createButton("Note");
            JButton note6 = createButton("Note");
            JButton note7 = createButton("Note");
            JButton note8 = createButton("Note");
            JButton note9 = createButton("Note");
            JButton note10 = createButton("Note");
            JButton note11 = createButton("Note");
            JButton note12 = createButton("Note");
            NoteList.add(note1);NoteList.add(note2);NoteList.add(note3);NoteList.add(note4);
            NoteList.add(note5);NoteList.add(note6);NoteList.add(note7);NoteList.add(note8);
            NoteList.add(note9);NoteList.add(note10);NoteList.add(note11);NoteList.add(note12);
        }

        if(GUI.difficulty == 1) {
            int[] arr = get4Numbers();
            MusicalFrame.setSize(600,350);
            back = createButton("Back");	back.setBounds(230, 250, 130, 50);	back.setFocusable(false);

            JButton b1 = NoteList.get(arr[0]); JButton b2 = NoteList.get(arr[1]); JButton b3 = NoteList.get(arr[2]); JButton b4 = NoteList.get(arr[3]);
            b1.setBounds(100, 20, 75, 50); b2.setBounds(400, 20, 75, 50);
            b3.setBounds(100, 140, 75, 50); b4.setBounds(400, 140, 75, 50);
            MusicalPanel.add(b1);MusicalPanel.add(b2);MusicalPanel.add(b3);MusicalPanel.add(b4);
        }
        else if (GUI.difficulty == 2) {
            int[] arr = get6Numbers();
            MusicalFrame.setSize(600,350);
            back = createButton("Back");	back.setBounds(230, 250, 130, 50);	back.setFocusable(false);

            JButton b1 = NoteList.get(arr[0]); JButton b2 = NoteList.get(arr[1]); JButton b3 = NoteList.get(arr[2]);
            JButton b4 = NoteList.get(arr[3]); JButton b5 = NoteList.get(arr[4]); JButton b6 = NoteList.get(arr[5]);
            b1.setBounds(70, 20, 75, 50); b2.setBounds(255, 20, 75, 50); b3.setBounds(435, 20, 75, 50);
            b4.setBounds(70, 140, 75, 50);b5.setBounds(255, 140, 75, 50); b6.setBounds(435, 140, 75, 50);
            MusicalPanel.add(b1);MusicalPanel.add(b2);MusicalPanel.add(b3);MusicalPanel.add(b4);MusicalPanel.add(b5);MusicalPanel.add(b6);
        }
        else if (GUI.difficulty == 3) {
            int[] arr = get8Numbers();
            MusicalFrame.setSize(600,350);
            back = createButton("Back");	back.setBounds(230, 250, 130, 50);	back.setFocusable(false);

            JButton b1 = NoteList.get(arr[0]); JButton b2 = NoteList.get(arr[1]); JButton b3 = NoteList.get(arr[2]); JButton b4 = NoteList.get(arr[3]);
            JButton b5 = NoteList.get(arr[4]); JButton b6 = NoteList.get(arr[5]); JButton b7 = NoteList.get(arr[6]); JButton b8 = NoteList.get(arr[7]);
            b1.setBounds(40, 20, 75, 50); b2.setBounds(180, 20, 75, 50); b3.setBounds(320, 20, 75, 50); b4.setBounds(460, 20, 75, 50);
            b5.setBounds(40, 140, 75, 50); b6.setBounds(180, 140, 75, 50); b7.setBounds(320, 140, 75, 50); b8.setBounds(460, 140, 75, 50);
            MusicalPanel.add(b1);MusicalPanel.add(b2);MusicalPanel.add(b3);MusicalPanel.add(b4);MusicalPanel.add(b5);MusicalPanel.add(b6);MusicalPanel.add(b7);MusicalPanel.add(b8);
        }
        MusicalFrame.setLocationRelativeTo(null);
        MusicalFrame.setVisible(true);
        MusicalPanel.setLayout(null);




        MusicalPanel.add(back);

        MusicalFrame.add(MusicalPanel, BorderLayout.CENTER);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MusicalFrame.dispose();
                new GUI();
                System.out.println("Bye");
            }
        });

    }

    public static void main(String[] args) {
        new GUI();

    }

}