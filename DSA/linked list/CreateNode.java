    //first way 
    class Node{
        //node :two value and addres 
        //value 
        int value;
        //address :refrence variable 
        Node next; //Node class and next :refrence variable 
        //create node 
        Node(int value){
            this.value=value;
        }
    }
    public class CreateNode{
        //second way to create Node class 
        static class Node1{
            //two part :value and refrence 
            int data;
            Node1 next;
            Node1(int data){
                this.data=data;
            }
        }
        public static void main(String[] args){

        }
    }