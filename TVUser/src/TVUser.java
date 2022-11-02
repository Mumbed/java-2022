public class TVUser {
    public static void main(String[] args) {
        TV1 t = new TV1();
        t.PushPower(t.status);
        if (t.status) {
            System.out.println("CH = " + t.channel);
            System.out.println("VOLUME = " + t.volume);
            for (int i = 0; i < 6; i++) {
                t.ChannelUp();
                System.out.println("CH UP = " + t.channel);
            }
            for (int i = 0; i < 6; i++) {
                t.VolumeDown();
                System.out.println("VOLUME DOWN = " + t.volume);
            }
        } else
            System.out.println("TV가 꺼져있음.");
    }
}