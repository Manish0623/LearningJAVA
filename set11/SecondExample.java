interface TvRemote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

interface SmartTvRemote extends TvRemote {
    void browse(String url);
    void netflix();
}

class TV implements SmartTvRemote {
    public void powerOn() {
        System.out.println("TV is ON..");
    }
    public void powerOff() {
        System.out.println("TV is OFF..");
    }
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
    public void browse(String url) {
        System.out.println("Browsing: " + url);
    }
    public void netflix() {
        System.out.println("Opening Netflix...");
    }
}

public class SecondExample {
    public static void main(String[] args) {
        TV t = new TV();
        t.powerOn();
        t.changeChannel(10);
        t.browse("www.netflix.com");
        t.netflix();
        t.powerOff();
    }
}
