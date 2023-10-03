package jarvis.parser;

import jarvis.command.Command;
import jarvis.command.CommandList;
import jarvis.command.CommandDelete;
import jarvis.command.CommandMark;
import jarvis.command.CommandUnmark;
import jarvis.command.CommandToDo;
import jarvis.command.CommandEvent;
import jarvis.command.CommandDeadline;
import jarvis.command.CommandExit;
import jarvis.exception.JarvisException;
/**
 * Represents a parser that converts user inputs into command objects.
 */
public class Parser {
    public Command parseCommand(String userInput){
        String commandTitle = userInput.split(" ")[0];
        String commandDescription;
        int taskIndex;
        try{
            switch(commandTitle){
            case "bye":
                return new CommandExit();
            case "list":
                return new CommandList();
            case "mark":
                commandDescription = userInput.split(" ")[1];
                taskIndex = Integer.parseInt(commandDescription.strip());
                return new CommandMark(taskIndex-1);
//            case "unmark":
//                return;
            case "deadline":
                return new CommandDeadline(userInput);
            case "event":
                return new CommandEvent(userInput);
            case "todo":
                return new CommandToDo(userInput);
            default:
                throw JarvisException.invalidCommand();
            }
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException invalidIndex){
            System.out.println("Please enter valid integer index!");
        }catch(JarvisException e){
            System.out.println(e.getMessage());
            // TODO: send the help /help
        }

        return new Command(null);
    }
}