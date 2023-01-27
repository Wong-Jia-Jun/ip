package duke.Tasks;

import duke.Tasks.Task;

public class ToDo extends Task {
    public ToDo(String description){
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();

    }
    @Override
    public String changeFormat() {

        return String.format("T %s", super.changeFormat());

    }
}
