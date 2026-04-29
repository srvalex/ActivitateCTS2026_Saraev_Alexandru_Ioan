package drone_autonome.main;

import drone_autonome.prototype.clase.IPrototype;
import drone_autonome.prototype.clase.ModulAI;
import drone_autonome.singleton.DroneConnection;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
//        ModulAI versiunea1 = new ModulAI("v1",85,900.5f);
//        IPrototype versiunea1_2= versiunea1.clone(60,500);
//        IPrototype versiunea1_3 = versiunea1.clone(45,200);
//        ((ModulAI)versiunea1_2).applyRule(1,"AAAAAA");
//        System.out.println(versiunea1);
//        System.out.println(versiunea1_2);
//        System.out.println(versiunea1_3);
//        ModulAI versiunea2 = new ModulAI("v2",55,400);
//        IPrototype v2_1 = versiunea2.clone(65,200);
//        System.out.println(versiunea2);
//        System.out.println(v2_1);


        DroneConnection conexiuneDrona = DroneConnection.getInstance();
        DroneConnection conexiuneDrona2 = DroneConnection.getInstance();
        System.out.println(conexiuneDrona == conexiuneDrona2);
        conexiuneDrona.connectUser("1");
        conexiuneDrona.connectUser("1");
        conexiuneDrona.disconnectUser("1");
        System.out.println(conexiuneDrona.isUserConnected("1"));
        conexiuneDrona.connectUser("Charlie");
//        conexiuneDrona.connectUser("3");
        conexiuneDrona.disconnectUser("4");



    }
}
