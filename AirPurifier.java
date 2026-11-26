public class AirPurifier {
    String serialNo;
    String model;
    String mode;
    boolean power;
    static int count = 0;

    AirPurifier(String model){
        this.model = model;
        this.mode = "Default";
        this.power = false;
        count++;
        this.serialNo = createSerialNo(model);
        IO.println("Airpurifier(" + model + ") No." + serialNo + " is created");
    }

    void turnOn() {
        power = true;
        IO.println("Airpurifier(" + model + ") No." + serialNo + " is power on");
    }
    void turnOff() {
        power = false;
        IO.println("Airpurifier(" + model + ") No." + serialNo + " is power off");
    }

    void changeMode(String mode){
        if(!power){
            IO.println("Airpurifier(" + model + ") No." + serialNo + " is not power on");
            return;
        }
        if(mode.equals("Night")) this.mode = mode;
        else if(mode.equals("Low")) this.mode = mode;
        else if(mode.equals("High")) this.mode = mode;
        else this.mode = "Default";

        IO.println("Airpurifier(" + model + ") No." + serialNo + " is on " + mode + " mode");
    }

    void show(){
        String status = power ? "on" : "off";
        IO.println("Airpurifier(" + model + ") No." + serialNo +
                " { Status: " + status + ", Mode: " + mode + " }"
        );
    }

    static String createSerialNo(String model){
        String serialNo;
        if(model.equals("Base")) serialNo = "001";
        else if(model.equals("Mini")) serialNo = "002";
        else if(model.equals("Pro")) serialNo = "003";
        else serialNo = "000";
        String no = String.valueOf(count);
        int len = no.length();
        while(len<4){
            serialNo += "0";
            len++;
        }
        return serialNo += String.valueOf(count);
    }
}