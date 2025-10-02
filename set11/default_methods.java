

interface Camera {
    void takeSnap();
    void recordVideo();
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, Camera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Mendis", "Writz", "Havertz"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        ms.connectToNetwork("Mendis");
    }
}
