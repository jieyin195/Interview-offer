package 揭尹;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Jline on 2019/4/5.
 */
/*


int main(){
    int n;
    char c;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>c;
        if(S.empty()||S.top()==c)S.push(c);
        else S.pop();
    }
    cout<<S.size()<<endl;
    return 0;
}
 */
public class Main {
    public static void main( String[] args ) {
        Stack<Character> stack = new Stack<>();

        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            char c =s.charAt(i);
            if(stack.isEmpty()||stack.peek()==c)
                stack.push(c);
            else
                stack.pop();
        }
        System.out.println(stack.size());
    }
}
