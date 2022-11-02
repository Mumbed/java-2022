import java.util.Scanner;

public class PhoneBook {
    Phone[] phone;
    Scanner s;
    PhoneBook(){
        s = new Scanner(System.in);
    }
    void run(){
        System.out.print("인원수>>>");
        int people = s.nextInt();
        phone = new Phone[people];
        for(int i = 0; i < people; i++){
            System.out.print("(이름과 전화번호는 빈 칸없이 입력)>>");
            String name = s.next();
            String tel = s.next();
            phone[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.println("검색할 이름>>");
            String name = s.next();
            if(name.equals("그만"))
                break;
            String tel = search(name);
            if(tel==null)
                System.out.println(name+"이 없습니다.");

            else System.out.println(name+"의 번호는 "+tel+"입니다");
        }
        }
    String search(String name) {
        for(int i = 0; i < phone.length; i++) {
            if(phone[i].getName().equals(name)) {
                return phone[i].getTel();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.run();
    }
}