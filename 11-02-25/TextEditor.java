class TextState {
    String content;
    TextState next;
    TextState prev;
    public TextState(String content) {
    this.content = content;
    this.next = null;
    this.prev = null;
    }
    }
    
    class TextEditor {
    TextState head;
    TextState tail;
    TextState current;
    int historySize;
    int currentSize;
    
    public TextEditor(int historySize) {
    this.head = null;
    this.tail = null;
    this.current = null;
    this.historySize = historySize;
    this.currentSize = 0;
    }
    
    public void addState(String content) {
    TextState newState = new TextState(content);
    if (current == null) {
    head = tail = current = newState;
    } else {
    if (current.next != null) {
    current.next = null; // Clear any redo history
    }
    current.next = newState;
    newState.prev = current;
    current = newState;
    tail = current;
    if (currentSize == historySize) {
    head = head.next; // Remove oldest state if history is full
    } else {
    currentSize++;
    }
    }
    
    public void undo() {
    if (current != null && current.prev != null) {
    current = current.prev;
    System.out.println("Undo: " + current.content);
    } else {
    System.out.println("No more states to undo.");
    }
    }
    
    public void redo() {
    if (current != null && current.next != null) {
    current = current.next;
    System.out.println("Redo: " + current.content);
    } else {
    System.out.println("No more states to redo.");
    }
    }
    
    public void displayCurrentState() {
    if (current != null) {
    System.out.println("Current State: " + current.content);
    } else {
    System.out.println("No content available.");
    }
    }
    
    }
    
    public class TextEditorApp {
    public static void main(String[] args) {
    TextEditor editor = new TextEditor(5); // Limit history to last 5 states
    
    editor.addState("Initial content");
    editor.addState("First edit");
    editor.addState("Second edit");
    editor.addState("Third edit");
    
    editor.displayCurrentState(); // Should display "Third edit"
    editor.undo(); // Should undo to "Second edit"
    editor.undo(); // Should undo to "First edit"
    editor.redo(); // Should redo to "Second edit"
    editor.addState("Fourth edit");
    editor.addState("Fifth edit");
    editor.addState("Sixth edit");
    
    editor.displayCurrentState(); // Should display "Sixth edit"
    editor.undo(); // Should undo to "Fifth edit"
    editor.redo(); // Should redo to "Sixth edit"
    editor.undo(); // Should undo to "Fifth edit"
    editor.undo(); // Should undo to "Fourth edit"
    editor.undo(); // Should undo to "Third edit"
    editor.undo(); // Should display "No more states to undo."
    }
    }
    