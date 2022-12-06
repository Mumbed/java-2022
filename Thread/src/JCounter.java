import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCounter extends JFrame {
    private JLabel l_cnt = new JLabel("0");
    private JButton b_start = new JButton("Start");
    private JButton b_pause = new JButton("Pause");
    private JButton b_reset = new JButton("Reset");

    Thread thread1;

    public JCounter() {
        super("JCounter");
        setTitle("Counter");
        buildGUI();
        setSize(300, 100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void buildGUI() {
        JPanel p1 = new JPanel(new FlowLayout());

        this.setLayout(new BorderLayout());
        this.add(l_cnt, BorderLayout.CENTER);
        p1.add(b_start);
        b_start.addActionListener(handler);
        p1.add(b_pause);
        p1.add(b_reset);
        this.add(p1, BorderLayout.SOUTH);
    }

    private ActionListener handler = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b_start) {
                thread1 = new Thread(new Runnable() {
                    int i = 0;

                    @Override
                    public void run() {
                        while (thread1 == Thread.currentThread()) {
                            l_cnt.setText(String.format("%d", i));
                            i++;
                            try {
                                thread1.sleep(300);
                            } catch (InterruptedException e1) {

                            }
                        }


                    }
                });
                thread1.start();
            } else {
                thread1 = null;
            }
        }
    };
        JPanel p_display;
        JPanel p_button;
        public static void main(String[] args) {
            new JCounter();
        }
}
