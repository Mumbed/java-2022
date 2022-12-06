import java.awt.*;
import java.awt.event.*;

class item extends Frame {
    String [] item={"봄","여름","가을","겨울"};
    Checkbox c1,c2,c3;
    List ls;
    TextArea tf;
    Panel p;
    public item(){
        p=new Panel();
        tf=new TextArea();
        Checkbox c1=new Checkbox("사과");
        Checkbox c2=new Checkbox("딸기");
        Checkbox c3=new Checkbox("포도");
        p.add(c1);
        p.add(c2);
        p.add(c3);

        ls=new List(3,false);
        for(int i=0; i<item.length;i++){
            ls.add(item[i]);
        }

        add(tf,"Center");
        add(ls,"West");
        add(p,"North");
        setSize(300,200);
        setVisible(true);

        c1.addItemListener(action);
        c2.addItemListener(action);
        c3.addItemListener(action);

        //선택한 리스트 tf에 출력
        ls.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                System.out.println(arg0.getItem()+"is SELECTED");
                tf.append(ls.getSelectedItem()+"를 선택하셨습니다.\n");
            }
        });


        //시스템 종료:
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new item();
    }

    ItemListener action = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {

            switch(e.getStateChange()){
                case 1:
                    System.out.println(e.getItem()+"is SELECTED");
                    tf.append(e.getItem()+"를 선택하셨습니다.\n");
                    break;
                case 2:
                    System.out.println(e.getItem()+"is DESELECTED");
                    tf.append(e.getItem()+"를 해제하셨습니다.\n");
                    break;
            }

            //tf.append(ls.getItem((Integer) e.getItem())+"를 선택하셨습니다.\n");
            //System.out.println(e.getItemSelectable());           
        }
    };
}//외부클래스 끝