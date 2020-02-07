package com.epam.lesson8;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String serialNumber, String manufacturer, double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed = " + speed +
                ", mac = " + mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        EthernetAdapter other = (EthernetAdapter) obj;
        if (!this.mac.equals(((EthernetAdapter) obj).mac)) {
            return false;
        }
        return this.speed == other.speed;
    }
}
