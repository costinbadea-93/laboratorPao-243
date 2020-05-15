import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    private int port;
    private Set<String> userNames = new HashSet<>();
    private Set<UserThread> userThreads = new HashSet<>();

    public ChatServer(int port) {
        this.port = port;
    }

    public void execute() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Chat server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New User Connected");

                UserThread newUser = new UserThread(socket, this);
                userThreads.add(newUser);
                newUser.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void broadcast(String message, UserThread excludeUser) {
        userThreads.forEach(userThread -> {
            if (userThread != excludeUser) {
                userThread.sendMessage(message);
            }
        });
    }

    void addUserName(String userName) {
        userNames.add(userName);
    }

    void removeUser(String userName, UserThread userThread) {
        boolean removed = userNames.remove(userName);
        if (removed) {
            userThreads.remove(userThread);
            System.out.println("This user " + userName + "quited");
        }
    }

    Set<String> getUserNames() {
        return this.userNames;
    }

    boolean hasUsers() {
        return !this.userNames.isEmpty();
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Syntax: java ChatServer <port-number>");
            System.exit(0);
        }

        int port = Integer.parseInt(args[0]);

        ChatServer server = new ChatServer(port);
        server.execute();
    }
}
