package drone_autonome.singleton;

public interface IDroneConnection {
    void connectUser(String userId);
    void disconnectUser(String userId);
    boolean isUserConnected(String userId);
    String getDedicatedChannel(String userId);
}
