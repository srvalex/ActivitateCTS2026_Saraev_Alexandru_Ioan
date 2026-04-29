package drone_autonome.singleton;

import java.util.HashMap;
import java.util.Map;

public class DroneConnection implements IDroneConnection{

    public static DroneConnection instanta = null;

    Map<String, String> conexiuni;

    private DroneConnection(){
        this.conexiuni = new HashMap<>();
    }

    public static final synchronized DroneConnection getInstance() {
        if(instanta == null) {
            instanta = new DroneConnection();
            return instanta;
        }
        return instanta;
    }

    @Override
    public void connectUser(String userId) {
        if(conexiuni.containsKey(userId)) {
            System.out.println("Utilizatorul este deja conectat");
        }
        else
        {
            this.conexiuni.put(userId,getDedicatedChannel(userId));
            System.out.println("S-a conectat " + userId + getDedicatedChannel(userId));
        }
    }

    @Override
    public void disconnectUser(String userId) {
        if(isUserConnected(userId)) {
            this.conexiuni.remove(userId);
            System.out.println("S-a deconectat " + userId);
        }
        else System.out.println("Nu exista utilizatorul cu ID-ul " +userId);
    }

    @Override
    public boolean isUserConnected(String userId) {
        return this.conexiuni.containsKey(userId);
    }

    @Override
    public String getDedicatedChannel(String userId) {
        return "Channel no: " + this.conexiuni.size();
    }
}
