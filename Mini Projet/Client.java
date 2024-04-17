
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 19999);
            TaskList taskList = (TaskList) registry.lookup("TaskList");

            // Test des fonctionnalités
            taskList.addTask("Acheter du lait");
            taskList.addTask("Payer les factures");
            System.out.println("Taches actuelles: " + taskList.getTasks());
            taskList.removeTask("Payer les factures");
            System.out.println("Taches apres suppression: " + taskList.getTasks());
        } catch (Exception e) {
            System.err.println("Erreur client: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
