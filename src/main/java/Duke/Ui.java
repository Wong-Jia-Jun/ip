package Duke;

import Duke.Exceptions.DukeException;
import Duke.Tasks.TaskList;
import Duke.Tasks.Task;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

/**
 * Contains Ui object that deals with interactions with the user
 */

public class Ui {
    private final static String UNDERLINE = "________________________________________________________________";
    private final static String logo = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";
    private Scanner text = new Scanner(System.in);

    /**
     * The method of Underline() to print out a separating line
     */
    public static void Underline(){
        System.out.println((UNDERLINE));
    }
    /**
     * The method of readIn user input
     * @return String
     */
    public String readIn(){
        return this.text.nextLine();
    }
    /**
     * The method of showing logo and welcoming when run at start
     */

    public void greet() {
        System.out.println(logo);
        System.out.println("Welcome! I'm duke.Duke.");
        System.out.println("What can I do for you?");
        Underline();
    }

    /**
     * The method of sayBye when exiting program
     */
    public static void sayBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }
    /**
     * The method of markedMessage()
     */

    public static void markedMessage() {
        System.out.println("\tNice! I've marked this task as done:");

    }

    /**
     * The method of unMarkedMessage()
     */
    public static void unMarkedMessage() {
        System.out.println("\tOK, I've marked this task as not done yet:");
    }
    /**
     * The method of showDeleteMessage()
     */
    public static void showDeleteMessage() {
        System.out.println("\tNoted. I've removed this task:");
    }
    /**
     * The method of addTaskMsg()
     */
    public static void addTaskMsg(TaskList list, int num) {
        System.out.println("\tGot it. I've added this task:");
    }
    /**
     * The method of listMsg()
     */

    public static void listMsg() {
        System.out.println("\tHere are the tasks in your list:");

    }

    /**
     * The method of findTask
     * @param list
     * @parma task
     */



    /**
     * The method of DukeExeptionMsg
     * @param e the exception catched
     */

    public void DukeExceptionMsg(DukeException e) {
        System.out.printf("\t%s\n", e);
    }
}

