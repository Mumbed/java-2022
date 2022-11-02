public class TV1 {
    static final int LaCh = 5;
    static final int FiCh = 1;
    static final int LaVol = 10;
    static final int FiVol = 1;
    boolean status = false;
    int channel =1;
    int volume = 5;

    void PushPower(boolean status) {
        if (!status) {
            System.out.println("TV를 켭니다.");
            this.status = true;
        }
        else if (status) {
            System.out.println("TV를 끕니다.");
            this.status = false;
        }
    }
    void ChannelUp() {
        if(channel == LaCh){
            channel = FiCh;
        }
        else
            channel++;
    }
    void ChannelDown() {
        if(channel == FiCh){
            channel = LaCh;
        }
        else
            channel--;
    }
    void VolumeUp() {
        if (volume == LaVol) {
            volume = LaVol;
        }
        else
            volume++;
    }
    void VolumeDown() {
    if(volume == FiVol) {
        volume = FiVol;
    }
        else
            volume--;
    }
}
