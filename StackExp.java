class StackModel<T> {
    int a[] = new int[5];
    int top;

    public void push(int data) {
        a[top] = data;
        top++;
    }
    public int pop(){
        int data =0;
        top--;
        data = a[top];
        a[top]=0;
        return data;
    }

    public void show() {
        for (int n : a) {
            System.out.print(n + " ");
        } 
        // n is iteration and a is till how much
        System.out.println();
    }

}

public class StackExp {
    public static void main(String[] args) {
        StackModel<Integer> sm = new StackModel<>();
        sm.push(10);
        sm.push(20);
        sm.pop();
        sm.show();
    }
}