
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            TaskList taskList = new TaskListServer();
            Registry registry = LocateRegistry.createRegistry(19999);
            registry.bind("TaskList", taskList);
            System.out.println("Service TaskList enregistre et pret.");
        } catch (Exception e) {
            System.err.println("Erreur serveur: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
