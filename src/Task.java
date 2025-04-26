public class Task {
    private String title;
    private boolean isDone;

    public Task(String title) {
        this.title = title;
        this.isDone = false;
    }

    public void markDone() {
        this.isDone = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return (isDone ? "[x] " : "[ ] ") + title;
    }
}
