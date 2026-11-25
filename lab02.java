public class lab02 {
    public static void main(String[] args) {
        AirPurifier p1 = new AirPurifier("Pro");
        AirPurifier p2 = new AirPurifier("Mini");
        AirPurifier p3 = new AirPurifier("Base");
        AirPurifier p4 = new AirPurifier("Base");
        p4.show();
        p4.changeMode("Night");
        p4.show();
        p4.turnOn();
        p4.changeMode("Night");
        p4.show();
        p4.changeMode("High");
        p4.show();
        p4.turnOff();
        p4.show();
    }
}

