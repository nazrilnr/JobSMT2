package pratikum1;

    public class Stack {
        Book data[];
        int size;
        int top;
        int push;
        
        public Stack(int size) {
            this.size = size;
            data = new Book [size];
            top = -1;
        }
    
        // public boolean IsFull() {
        //     if (top == size -1){
        //         return true;
        //     } else
        //     {
        //         return false;
        //     }
        // }
        public boolean IsFull() {
            return top == size - 1;
        }
    
        public boolean IsEmpty() {
            if (top == - 1){
                return true;
            } else
            {
                return false;
            }
        }
    
        public void push(Book bk){
            if(!IsFull()){
                top++;
                data[top] = bk;
            }else{
                System.out.println("Stack is full");
            }
        }
    
        // public void pop(){
        //     if(!IsEmpty()) {
        //         int x = data[top];
        //         top --;
        //         System.out.println("Remove data : " + x);
        //     }else{
        //         System.out.println("Stack is empty");
        //     }
        // }

        // public void pop() {
        //     if (!IsEmpty()) {
        //         Book x = data[top];
        //         top--;
        //         System.out.println("Removed data: " + x);
        //     } else {
        //         System.out.println("Stack is empty. Cannot pop element.");
        //     }
        // }

        public void pop () {
            if(!IsEmpty ()) {
                Book x = data[top];
                top--;
                System.out.println ("Removed data : " + x.title + " " +
                           x.authorName + " " + x.publishedYear + " " + x.pagesAmount + " " + x.price);
            }else{
                 System.out.println ("Stack is empty");}}
    
        // public void peek(){
        //     System.out.println("Top element : " + data[top]);
        // }
        
        public void peek() {
            if (!IsEmpty()) {
                System.out.println("Top element: " + data[top]);
            } else {
                System.out.println("Stack is empty. Cannot peek.");
            }
        }
        
    
        // public void print (){
        //     System.out.println("Stack content:: ");
        //     for (int i = top; i >- 0; i--){
        //         System.out.println(data[i] + " ");
        //     }
        //     System.out.println("");
        // }

        // public void print (){
        //     System.out.println("Stack content:: ");
        //     for (int i = top; i >= 0; i--){
        //         System.out.println(data[i] + " ");
        //     }
        //     System.out.println("");
        // }

        public void print () {
            System.out.println ("Stack content: ");
            for (int i = top; i >- 0; i--) {
                System.out.println(data[i].title + " " + data[i].authorName + " " + data[i].publishedYear + data[i].pagesAmount + " " + data[i].price);
                System. out.println ("");
            }
            System.out.println("");
        }

       public void clear(){
            if(!IsEmpty()){
                for (int i = top; i >= 0; i--){
                    top--;
                }
                System.out.println("Stack is now empty");
            }else{
                System.out.println("Failed ! Stack is still empty");
            }
        }
    }
