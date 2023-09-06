package Command;

public class MessageDisplayer {

    private static final String LOGO = "\n" +
            "     ____.  _____ ______________   ____.___  _________\n" +
            "    |    | /  _  \\\\______   \\   \\ /   /|   |/   _____/\n" +
            "    |    |/  /_\\  \\|       _/\\   Y   / |   |\\_____  \\ \n" +
            "/\\__|    /    |    \\    |   \\ \\     /  |   |/        \\\n" +
            "\\________\\____|__  /____|_  /  \\___/   |___/_______  /\n" +
            "                 \\/       \\/                       \\/ \n";
    private static final String LINE_BREAK = "____________________________________________________________";

    public static void displayWelcomeMessage() {
        System.out.println("Hello from\n" + LOGO);
        System.out.println(LINE_BREAK + "\n Hi Sir! I'm JARVIS \n" + " What can I do for you today?\n" + LINE_BREAK);
    }

    public static void displayGoodbyeMessage() {
        System.out.println(LINE_BREAK + "\n" +
                "Good bye sir! Have a good day" + "\n" + LINE_BREAK);
    }
}
