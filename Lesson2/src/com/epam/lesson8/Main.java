package com.epam.lesson8;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
//        System.out.println(device.toString());

        device = new Device("OO34PK", "Apple", 3500);
//        System.out.println(device.toString());

        Monitor monitor = new Monitor("HDSD2000", "DELL", 2500, 1280, 1020);
//        System.out.println(monitor.toString());

        EthernetAdapter ethernetAdapter = new EthernetAdapter("TP230", "Xiomi", 500, 300, "00:32:b9:47");
//        System.out.println(ethernetAdapter.toString());


        Device[] devices = {
                monitor,
                new Device("OO34PK", "Apple", 3500),
                ethernetAdapter,
                new Monitor("HDSD2000", "DELL", 2500, 1280, 1020),
                new Device("OO34PK", "Apple", 3700),
                device
        };
        for (Device devi : devices) {
            System.out.println(devi.toString());
        }
        System.out.println("Monitor equals -> " + devices[0].equals(devices[3]));
        System.out.println("Device equals -> " + devices[1].equals(devices[4]));
        System.out.println("Adapter equals -> " + devices[2].equals(devices[4]));
    }
}
