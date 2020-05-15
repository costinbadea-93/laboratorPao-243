import java.io.Console;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread {
    private PrintWriter writer;
    private Socket socket;
    private ChatClient client;

    public WriteThread(Socket socket, ChatClient client) {
        this.socket = socket;
        this.client = client;

        try {
            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

//        Console console = System.console();
        System.out.println("Enter username : ");
        String username = scanner.nextLine();
        client.setUserName(username);
        writer.println(username);
        String text;
        do {
            System.out.println("[" + username + "]: ");
            text = scanner.nextLine();
            writer.println(text);
        } while (!text.equals("bye"));

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
