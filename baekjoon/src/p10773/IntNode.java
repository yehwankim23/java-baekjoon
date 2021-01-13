package p10773;

class IntNode {
    private IntNode next;
    private Integer integer;
    
    public IntNode() {
        this(null);
    }
    
    public IntNode(Integer integer) {
        next = null;
        this.integer = integer;
    }
    
    public IntNode getNext() {
        return next;
    }
    
    public void setNext(IntNode intNode) {
        next = intNode;
    }
    
    public Integer getInt() {
        return integer;
    }
    
    public String toString() {
        return integer.toString();
    }
}
