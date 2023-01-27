
package Duke.Exceptions;
/**
 * Contains a duke exception object when description is missing for the command.
 */

public class emptyDescriptionException extends DukeException {
    private String command;
    /**
     * Constructor for the emptyDescription Exception
     * @param command user inputted which require description as arugment
     */
    public emptyDescriptionException(String command) {
        this.command = command;
    }
    /**
     * Obtain the string representation of the exception.
     * @return string representation of the exception
     */

    @Override
    public String toString() {
        return  String.format("%s The description of a %s cannot be empty.", super.toString(), command );
    }
}
