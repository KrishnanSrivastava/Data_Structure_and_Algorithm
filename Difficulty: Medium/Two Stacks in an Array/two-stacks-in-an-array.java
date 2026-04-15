class twoStacks {
    int [] arr;
    int top1;
    int top2;
    twoStacks() {
        arr = new int[200];
        top1 = 0;
        top2 = 200 - 1;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if (top1 < top2){
            arr[top1] = x;
            top1++;
        }
        // else {
        //     //overflow
        // }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        if (top1 < top2){
            arr[top2] = x;
            top2--;
        }
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if (top1 == 0) return -1; // underflow
        
        top1--;
        return arr[top1];
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if (top2 == 199) return -1;
        int n = arr[top2];
        top2++;
        return arr[top2];
    }
}