import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnAdd = new JButton("Add");
    private JButton jbtnSub = new JButton("Sub");
    private JButton jbtnExit = new JButton("Exit");
    private int count = 0;
    public MainFrame(){
        init();
    }
    private void init(){
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setLocation(100,50);
    this.setSize(800,600);
    jbtnAdd.setLocation(50,60);
    jbtnAdd.setSize(120,30);
    this.add(jbtnAdd);
    jbtnAdd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            MainFrame.this.setTitle(Integer.toString(count));
        }
    });
    jbtnSub.setLocation(200,60);
    jbtnSub.setSize(120,30);
    this.add(jbtnSub);
    jbtnSub.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count--;
            MainFrame.this.setTitle(Integer.toString(count));
        }
    });
    jbtnExit.setLocation(350,60);
    jbtnExit.setSize(120,30);
    this.add(jbtnExit);
    jbtnExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    }
}
