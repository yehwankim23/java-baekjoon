package l07.p10845;

class IntQueue {
    static final int EMPTY_QUEUE = -1;
    private IntNode front, back;
    private int size;
    
    public IntQueue() {
        front = new IntNode();
        back = new IntNode();
        
        front.setNext(back);
        back.setPrev(front);
        
        size = 0;
    }
    
    public Integer getFront() {
        if (front.getNext() == null || front.getNext().getInt() == null) {
            return EMPTY_QUEUE;
        }
        
        return front.getNext().getInt();
    }
    
    public Integer getBack() {
        if (back.getPrev() == null || back.getPrev().getInt() == null) {
            return EMPTY_QUEUE;
        }
        
        return back.getPrev().getInt();
    }
    
    public int getSize() {
        return size;
    }
    
    public void push(Integer integer) {
        if (integer == null) {
            return;
        }
        
        IntNode intNode = new IntNode(integer);
        
        back.getPrev().setNext(intNode);
        intNode.setPrev(back.getPrev());
        intNode.setNext(back);
        back.setPrev(intNode);
        
        size++;
    }
    
    public Integer pop() {
        if (front.getNext() == null || front.getNext().getInt() == null) {
            return EMPTY_QUEUE;
        }
        
        IntNode tempNode = front.getNext();
        front.setNext(tempNode.getNext());
        tempNode.getNext().setPrev(front);
        
        size--;
        
        return tempNode.getInt();
    }
    
    public String toString() {
        String tempString = "";
        IntNode tempNode;
        
        for (tempNode = front.getNext(); tempNode.getNext() != null;
                tempNode = tempNode.getNext()) {
            tempString += tempNode.toString() + "\n";
        }
        
        return tempString;
    }
}
