import java.io.*;
import java.net.Socket;

public class UserThread extends Thread {
    private Socket socket;
    private ChatServer server;
    private PrintWriter writer;

    public UserThread(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
            printUsers();

            String userName = reader.readLine();
            server.addUserName(userName);
            String serverMesage = "New user Connected: " + userName;
            server.broadcast(serverMesage, this);
            String clientMessage;

            do {
                clientMessage = reader.readLine();
                serverMesage = "[" + userName + "]: " + clientMessage;
                server.broadcast(serverMesage, this);
            } while (!clientMessage.equals("bye"));

            server.removeUser(userName, this);
            socket.close();
            serverMesage = userName + " has quited.";
            server.broadcast(serverMesage, this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void printUsers() {
        if (server.hasUsers()) {
            writer.println("Connected Users: " + server.getUserNames());
        } else {
            writer.println("No other users connected");
        }
    }

    void sendMessage(String message) {
        writer.println(message);
    }
}
