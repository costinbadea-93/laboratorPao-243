import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
    private String hostName;
    private int port;
    private String userName;

    public ChatClient(String hostName, int port) {
        this.hostName = hostName;
        this.port = port;
    }

    public void execute() {
        try {
            Socket socket = new Socket(hostName, port);
            System.out.println("Connected to the chat server");
            new ReadThread(socket, this).start();
            new WriteThread(socket, this).start();
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static void main(String[] args) {
        if (args.length < 2) return;

        String hostName = args[0];
        int port = Integer.parseInt(args[1]);
        ChatClient client = new ChatClient(hostName, port);
        client.execute();
    }
}
