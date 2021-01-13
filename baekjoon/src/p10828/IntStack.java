package p10828;

class IntStack {
    static final int EMPTY_STACK = -1;
    private IntNode top;
    private int size;
    
    public IntStack() {
        top = new IntNode();
        size = 0;
    }
    
    public Integer getTop() {
        if (top.getNext() == null || top.getNext().getInt() == null) {
            return EMPTY_STACK;
        }
        
        return top.getNext().getInt();
    }
    
    public int getSize() {
        return size;
    }
    
    public void push(Integer integer) {
        if (integer == null) {
            return;
        }
        
        IntNode intNode = new IntNode(integer);
        
        intNode.setNext(top.getNext());
        top.setNext(intNode);
        
        size++;
    }
    
    public Integer pop() {
        if (top.getNext() == null) {
            return EMPTY_STACK;
        }
        
        IntNode tempNode = top.getNext();
        top.setNext(top.getNext().getNext());
        
        size--;
        
        return tempNode.getInt();
    }
    
    public String toString() {
        String tempString = "";
        IntNode tempNode;
        
        for (tempNode = top.getNext(); tempNode != null;
                tempNode = tempNode.getNext()) {
            tempString += tempNode.toString() + "\n";
        }
        
        return tempString;
    }
}
