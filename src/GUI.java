import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI {
    
    //Making player objects to use later
    MP3FileManager am = new MP3FileManager();
    MediaPlayer player = new MediaPlayer();
    
    //Setting up variables
    static int difficulty = 0;
    static boolean learning = true;
    static String answer1 = "";
    static String answer2 = "";
    static String answer3 = "";
    static String answer4 = "";
    static String answer5 = "";
    static String answer6 = "";
    static String answer7 = "";
    static String answer8 = "";
    static int correct =0;
    private void resetAnswers() {
        answer1 = "";
        answer2 = "";
        answer3 = "";
        answer4 = "";
        answer5 = "";
        answer6 = "";
        answer7 = "";
        answer8 = "";
        correct = 0;
    }
    //Method to create a new button
    private JButton createButton(String s) {
        JButton button = new JButton(s);
        return button;
    }
    //Setter to change the difficulty of the learning exercise
    private void setDifficulty(int x) {
        difficulty = x;
    }
    //Setter to change from learning mode to challenge mode
    private void setLearning(boolean x) {
        learning = x;
    }


    public GUI() {
        //Initializing the panel and frame to use later
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Learning by Ear");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        //Forming the main interface GUI of the selection screen
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

        //Creating the buttons
        JButton button1 = createButton("Easy");	button1.setBounds(60, 200, 130, 50);	button1.setFocusable(false);
        JButton button2 = createButton("Medium");	button2.setBounds(230, 200, 130, 50);	button2.setFocusable(false);
        JButton button3 = createButton("Hard");	button3.setBounds(400, 200, 130, 50);	button3.setFocusable(false);
        
        //Giving buttons actions when clicking on them
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
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                setDifficulty(3);
                MusicalTraining();
            }
        });
        //This is a radio button listener to switch between learning mode and challenge mode
        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLearning(true);
            }
        });

        option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLearning(false);
            }
        });
        
        //Adding everything to the panel
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
    //Custom made method to randomize 4 integers, used for choosing 4 random note sounds from a sample of 12
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
    //Custom made method to randomize 6 integers, used for choosing 6 random note sounds from a sample of 12
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
    
    //Custom made method to randomize 8 integers, used for choosing 8 random note sounds from a sample of 12
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

       //Custom method to check if the input answer is correct with the one attributed to the button
    public boolean right(String s, JButton b) {
        if (s.equals(b.getName())) {
            correct++;
            return true;
        }
        return false;
    }
    
    //Method that produces an array with n integers ordered randomly
    //It is used to randomize the button order for practicing the same notes for learning
    public int[] order(int n) {
        int[] arr = null;
        if(n==1) {
            arr = new int[4];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=0; i<4; i++) {
                list.add(i);
            }
            Collections.shuffle(list); // Used to randomize the order
            for (int i=0; i<list.size(); i++) {
                arr[i]=list.get(i);
            }

        }
        else if(n==2) {
            arr = new int[6];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=0; i<6; i++) {
                list.add(i);
            }
            Collections.shuffle(list);
            for (int i=0; i<6; i++) {
                arr[i]=list.get(i);
            }
        }
        else if(n==3) {
            arr = new int[8];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=0; i<8; i++) {
                list.add(i);
            }
            Collections.shuffle(list);
            for (int i=0; i<list.size(); i++) {
                arr[i]=list.get(i);
            }
        }
        return arr;
    }

    //Method that returns the pixel position value on the horizontal axis based on the difficulty and position of the button
    public int Xvalue(int n, int m) {
        int x = 0;
        if(n==1) {
            if (m==0) {x=100;}
            else if (m==1) {x=400;}
            else if (m==2) {x=100;}
            else if (m==3) {x=400;}
        }
        else if(n==2) {
            if (m==0) {x=70;}
            else if (m==1) {x=255;}
            else if (m==2) {x=435;}
            else if (m==3) {x=70;}
            else if (m==4) {x=255;}
            else if (m==5) {x=435;}
        }
        else if(n==3) {
            if (m==0) {x=40;}
            else if (m==1) {x=180;}
            else if (m==2) {x=320;}
            else if (m==3) {x=460;}
            else if (m==4) {x=40;}
            else if (m==5) {x=180;}
            else if (m==6) {x=320;}
            else if (m==7) {x=460;}
        }
        return x;
    }
    
    //Method that returns the pixel position value on the vertical axis based on the difficulty and position of the button
    public int Yvalue(int n, int m) {
        int x = 0;
        if(n==1) {
            if (m==0 || m==1) {x=20;}
            else if (m==2 || m==3) {x=140;}
        }
        else if(n==2) {
            if (m==0 || m==1 || m==2) {x=20;}
            else if (m==3 || m==4 ||m==5) {x=140;}
        }
        else if(n==3) {
            if (m==0 || m==1 || m==2 || m==3) {x=20;}
            else if (m==4 || m==5 || m==6 || m==7) {x=140;}
        }
        return x;
    }
    public void MusicalTraining() {
        //Setting up new window for the part where you play the exercise
        JFrame MusicalFrame = new JFrame();
        JPanel MusicalPanel = new JPanel();
        JButton back = new JButton();
        MusicalFrame.setTitle("Learning by Ear");
        MusicalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Creating the 12 notes that will be used for the exercise
        ArrayList<JButton> NoteList = new ArrayList<JButton>();
        if(learning == true) {
            //In the learning section, you can see the names to get used to the sound they make
            JButton note1 = createButton("A"); 	note1.setName("A");
            JButton note2 = createButton("A#"); note2.setName("A#");
            JButton note3 = createButton("B"); note3.setName("B");
            JButton note4 = createButton("C"); note4.setName("C");
            JButton note5 = createButton("C#"); note5.setName("C#");
            JButton note6 = createButton("D"); note6.setName("D");
            JButton note7 = createButton("D#"); note7.setName("D#");
            JButton note8 = createButton("E"); note8.setName("E");
            JButton note9 = createButton("F"); note9.setName("F");
            JButton note10 = createButton("F#"); note10.setName("F#");
            JButton note11 = createButton("G"); note11.setName("G");
            JButton note12 = createButton("G#"); note12.setName("G#");
            NoteList.add(note1);NoteList.add(note2);NoteList.add(note3);NoteList.add(note4);
            NoteList.add(note5);NoteList.add(note6);NoteList.add(note7);NoteList.add(note8);
            NoteList.add(note9);NoteList.add(note10);NoteList.add(note11);NoteList.add(note12);
            
            //Giving the notes (buttons) the action of producing their specific sound
            for (int i = 0; i < NoteList.size(); i++) {
                int finalI = i;
                NoteList.get(i).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        player.play(NoteList.get(finalI).getName());
                    }
                });
            }
        }
        else {
            //In the challenge section, you cannot see the names, you are supposed to guess them according to the sound they make
            JButton note1 = createButton("?"); note1.setName("A");
            JButton note2 = createButton("?"); note2.setName("A#");
            JButton note3 = createButton("?"); note3.setName("B");
            JButton note4 = createButton("?"); note4.setName("C");
            JButton note5 = createButton("?"); note5.setName("C#");
            JButton note6 = createButton("?"); note6.setName("D");
            JButton note7 = createButton("?"); note7.setName("D#");
            JButton note8 = createButton("?"); note8.setName("E");
            JButton note9 = createButton("?"); note9.setName("F");
            JButton note10 = createButton("?"); note10.setName("F#");
            JButton note11 = createButton("?"); note11.setName("G");
            JButton note12 = createButton("?"); note12.setName("G#");
            NoteList.add(note1);NoteList.add(note2);NoteList.add(note3);NoteList.add(note4);
            NoteList.add(note5);NoteList.add(note6);NoteList.add(note7);NoteList.add(note8);
            NoteList.add(note9);NoteList.add(note10);NoteList.add(note11);NoteList.add(note12);
            
            //Giving the notes (buttons) the action of producing their specific sound
            for (int i = 0; i < NoteList.size(); i++) {
                int finalI = i;
                NoteList.get(i).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        player.play(NoteList.get(finalI).getName());
                    }
                });
            }
        }
        
        //Making text fields to allow users to write down their answers
        JTextField tf1 = new JTextField();JTextField tf2 = new JTextField(); JTextField tf3 = new JTextField();JTextField tf4 = new JTextField();
        JTextField tf5 = new JTextField(); JTextField tf6 = new JTextField(); JTextField tf7 = new JTextField(); JTextField tf8 = new JTextField();
        //Adding the submit and practice buttons
        JButton submit = createButton("Submit");	submit.setBounds(450, 250, 130, 50);	submit.setFocusable(false); MusicalPanel.add(submit);
        JButton next = createButton("Practice");	next.setBounds(450, 250, 130, 50);	next.setFocusable(false); MusicalPanel.add(next);
        JLabel Score =new JLabel();
        //Here you generate the 8 random numbers from 1 to 12 that will choose which notes are displayed on the buttons, then we create buttons that point to them
        int[] arr = get8Numbers();
        JButton b1 = NoteList.get(arr[0]); JButton b2 = NoteList.get(arr[1]); JButton b3 = NoteList.get(arr[2]); JButton b4 = NoteList.get(arr[3]);
        JButton b5 = NoteList.get(arr[4]); JButton b6 = NoteList.get(arr[5]); JButton b7 = NoteList.get(arr[6]); JButton b8 = NoteList.get(arr[7]);
        MusicalFrame.setSize(600,350);
        back = createButton("Back");	back.setBounds(230, 250, 130, 50);	back.setFocusable(false);

        submit.setVisible(false);
        next.setVisible(false);
        
        //If we are learning, we want to be able to go to the practice section, if not we can just submit the answers since we are already in challenge mode
        if(learning) {next.setVisible(true);} else {submit.setVisible(true);}
        //DIFFICULTY : EASY
        if(GUI.difficulty == 1) {
            //Easy difficulty has 4 notes
            b1.setBounds(100, 20, 75, 50); b2.setBounds(400, 20, 75, 50);
            b3.setBounds(100, 140, 75, 50); b4.setBounds(400, 140, 75, 50);
            MusicalPanel.add(b1);MusicalPanel.add(b2);MusicalPanel.add(b3);MusicalPanel.add(b4);
            if (!learning) {
                //If we are in challenge mode, we have 4 textfields
                tf1.setBounds(100, 75, 75, 25); tf2.setBounds(400, 75, 75, 25);
                tf3.setBounds(100, 195, 75, 25); tf4.setBounds(400, 195, 75, 25);
                MusicalPanel.add(tf1);MusicalPanel.add(tf2);MusicalPanel.add(tf3);MusicalPanel.add(tf4);}
        }
        //DIFFICULTY : MEDIUM
        else if (GUI.difficulty == 2) {
            b1.setBounds(70, 20, 75, 50); b2.setBounds(255, 20, 75, 50); b3.setBounds(435, 20, 75, 50);
            b4.setBounds(70, 140, 75, 50);b5.setBounds(255, 140, 75, 50); b6.setBounds(435, 140, 75, 50);
            MusicalPanel.add(b1);MusicalPanel.add(b2);MusicalPanel.add(b3);MusicalPanel.add(b4);MusicalPanel.add(b5);MusicalPanel.add(b6);
            if (!learning) {
                tf1.setBounds(70, 75, 75, 25); tf2.setBounds(255, 75, 75, 25);  tf3.setBounds(435, 75, 75, 25);
                tf4.setBounds(70, 195, 75, 25); tf5.setBounds(255, 195, 75, 25);  tf6.setBounds(435, 195, 75, 25);
                MusicalPanel.add(tf1);MusicalPanel.add(tf2);MusicalPanel.add(tf3);MusicalPanel.add(tf4);MusicalPanel.add(tf5);MusicalPanel.add(tf6);}
        }
        //DIFFICULTY : HARD
        else if (GUI.difficulty == 3) {
            b1.setBounds(40, 20, 75, 50); b2.setBounds(180, 20, 75, 50); b3.setBounds(320, 20, 75, 50); b4.setBounds(460, 20, 75, 50);
            b5.setBounds(40, 140, 75, 50); b6.setBounds(180, 140, 75, 50); b7.setBounds(320, 140, 75, 50); b8.setBounds(460, 140, 75, 50);
            MusicalPanel.add(b1);MusicalPanel.add(b2);MusicalPanel.add(b3);MusicalPanel.add(b4);MusicalPanel.add(b5);MusicalPanel.add(b6);MusicalPanel.add(b7);MusicalPanel.add(b8);
            if (!learning) {
                tf1.setBounds(40, 75, 75, 25); tf2.setBounds(180, 75, 75, 25);  tf3.setBounds(320, 75, 75, 25); tf4.setBounds(460, 75, 75, 25);
                tf5.setBounds(40, 195, 75, 25);  tf6.setBounds(180, 195, 75, 25); tf7.setBounds(320, 195, 75, 25);  tf8.setBounds(460, 195, 75, 25);
                MusicalPanel.add(tf1);MusicalPanel.add(tf2);MusicalPanel.add(tf3);MusicalPanel.add(tf4);
                MusicalPanel.add(tf5);MusicalPanel.add(tf6);MusicalPanel.add(tf7);MusicalPanel.add(tf8);}
        }
        
        //The practice button is used to randomize the place of the current notes, hide their name and allow for submitting answers
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                next.setVisible(false);
                submit.setVisible(true);
                if(GUI.difficulty == 1) {
                    b1.setText("?");b2.setText("?");b3.setText("?");b4.setText("?"); //Make the name invisible
                    int[] arr = order(1);
                    for(int i=0;i<arr.length;i++) {
                        int x = Xvalue(1,arr[i]);
                        int y = Yvalue(1,arr[i]);
                        if(i==0) {b1.setBounds(x, y, 75, 50); tf1.setBounds(x, y+55, 75, 25);} //Here we are changing the position of the notes in a random manner
                        else if(i==1){b2.setBounds(x, y, 75, 50); tf2.setBounds(x, y+55, 75, 25); }
                        else if(i==2){b3.setBounds(x, y, 75, 50); tf3.setBounds(x, y+55, 75, 25);}
                        else if(i==3){b4.setBounds(x, y, 75, 50); tf4.setBounds(x, y+55, 75, 25);}
                    }
                    MusicalPanel.add(tf1);MusicalPanel.add(tf2);MusicalPanel.add(tf3);MusicalPanel.add(tf4); //Adding only 4 text fields (we have 4 notes)
                }
                else if (GUI.difficulty == 2) {
                    b1.setText("?");b2.setText("?");b3.setText("?");b4.setText("?");b5.setText("?");b6.setText("?");
                    int[] arr = order(2);
                    for(int i=0;i<arr.length;i++) {
                        int x = Xvalue(2,arr[i]);
                        int y = Yvalue(2,arr[i]);
                        if(i==0) {b1.setBounds(x, y, 75, 50);tf1.setBounds(x, y+55, 75, 25);}
                        else if(i==1){b2.setBounds(x, y, 75, 50);tf2.setBounds(x, y+55, 75, 25);}
                        else if(i==2){b3.setBounds(x, y, 75, 50);tf3.setBounds(x, y+55, 75, 25);}
                        else if(i==3){b4.setBounds(x, y, 75, 50);tf4.setBounds(x, y+55, 75, 25);}
                        else if(i==4){b5.setBounds(x, y, 75, 50);tf5.setBounds(x, y+55, 75, 25);}
                        else if(i==5){b6.setBounds(x, y, 75, 50);tf6.setBounds(x, y+55, 75, 25);}
                    }
                    //Adding only 6 text fields (we have 6 notes)
                    MusicalPanel.add(tf1);MusicalPanel.add(tf2);MusicalPanel.add(tf3);MusicalPanel.add(tf4);MusicalPanel.add(tf5);MusicalPanel.add(tf6);
                }
                else if (GUI.difficulty == 3) {
                    b1.setText("?");b2.setText("?");b3.setText("?");b4.setText("?");b5.setText("?");b6.setText("?");b7.setText("?");b8.setText("?");
                    int[] arr = order(3);
                    for(int i=0;i<arr.length;i++) {
                        int x = Xvalue(3,arr[i]);
                        int y = Yvalue(3,arr[i]);
                        if(i==0) {b1.setBounds(x, y, 75, 50);tf1.setBounds(x, y+55, 75, 25);}
                        else if(i==1){b2.setBounds(x, y, 75, 50);tf2.setBounds(x, y+55, 75, 25);}
                        else if(i==2){b3.setBounds(x, y, 75, 50);tf3.setBounds(x, y+55, 75, 25);}
                        else if(i==3){b4.setBounds(x, y, 75, 50);tf4.setBounds(x, y+55, 75, 25);}
                        else if(i==4){b5.setBounds(x, y, 75, 50);tf5.setBounds(x, y+55, 75, 25);}
                        else if(i==5){b6.setBounds(x, y, 75, 50);tf6.setBounds(x, y+55, 75, 25);}
                        else if(i==6){b7.setBounds(x, y, 75, 50);tf7.setBounds(x, y+55, 75, 25);}
                        else if(i==7){b8.setBounds(x, y, 75, 50);tf8.setBounds(x, y+55, 75, 25);}
                    }
                    //Adding 8 text fields 
                    MusicalPanel.add(tf1);MusicalPanel.add(tf2);MusicalPanel.add(tf3);MusicalPanel.add(tf4);
                    MusicalPanel.add(tf5);MusicalPanel.add(tf6);MusicalPanel.add(tf7);MusicalPanel.add(tf8);
                }
            }

        });

        //SUBMIT BUTTON ACTION
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Here we set the text fields to invisible and check the answers.
                tf1.setVisible(false);tf2.setVisible(false);tf3.setVisible(false);tf4.setVisible(false);tf5.setVisible(false);tf6.setVisible(false);tf7.setVisible(false);tf8.setVisible(false);
                answer1 = tf1.getText();
                //Here we compare the answer given with the name of the button
                if(right(answer1,b1)) {	b1.setForeground(Color.GREEN);} else {b1.setForeground(Color.RED);} //If the answer is correct. the text becomes green, else it is red
                b1.setText(b1.getName());
                answer2 = tf2.getText();
                if(right(answer2,b2)) {	b2.setForeground(Color.GREEN);} else {b2.setForeground(Color.RED);}
                b2.setText(b2.getName());
                answer3 = tf3.getText();
                if(right(answer3,b3)) {	b3.setForeground(Color.GREEN);} else {b3.setForeground(Color.RED);}
                b3.setText(b3.getName());
                answer4 = tf4.getText();
                if(right(answer4,b4)) {	b4.setForeground(Color.GREEN);} else {b4.setForeground(Color.RED);}
                b4.setText(b4.getName());
                answer5 = tf5.getText();
                if(right(answer5,b5)) {	b5.setForeground(Color.GREEN);} else {b5.setForeground(Color.RED);}
                b5.setText(b5.getName());
                answer6 = tf6.getText();
                if(right(answer6,b6)) {	b6.setForeground(Color.GREEN);} else {b6.setForeground(Color.RED);}
                b6.setText(b6.getName());
                submit.setVisible(false);
                answer7 = tf7.getText();
                if(right(answer7,b7)) {	b7.setForeground(Color.GREEN);} else {b7.setForeground(Color.RED);}
                b7.setText(b7.getName());
                answer8 = tf8.getText();
                if(right(answer8,b8)) {	b8.setForeground(Color.GREEN);} else {b8.setForeground(Color.RED);}
                b8.setText(b8.getName());
                submit.setVisible(false);
                //SHOWING FINAL SCORE
                if(difficulty==1) {
                    Score.setText("Correct : " + correct + "/4");
                    if(correct!=4) {Score.setForeground(Color.RED);} else {Score.setForeground(Color.GREEN);}
                }
                else if (difficulty==2) {
                    Score.setText("Correct : " + correct + "/6");
                    if(correct!=6) {Score.setForeground(Color.RED);} else {Score.setForeground(Color.GREEN);}
                }
                else if (difficulty==3) {
                    Score.setText("Correct : " + correct + "/8");
                    if(correct!=8) {Score.setForeground(Color.RED);} else {Score.setForeground(Color.GREEN);}
                }
                Score.setFont(new Font("Verdana",1,30));
                Score.setBounds(165, 0, 400, 200);
                MusicalPanel.add(Score);
                resetAnswers();
            }
        });

        //Setting up the frame
    
        MusicalFrame.setLocationRelativeTo(null);
        MusicalFrame.setVisible(true);
        MusicalPanel.setLayout(null);
        MusicalPanel.add(back);
        MusicalFrame.add(MusicalPanel, BorderLayout.CENTER);
        //Back button's action
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MusicalFrame.dispose();
                learning = true;
                new GUI();
            }
        });

    }
}
