public class StringBufferExample {

    public static void main(String[] args) {
       
        StringBuffer sb = new StringBuffer("Hello");

        // 1. Using append() 

        sb.append(" World");

        System.out.println("After append: " + sb); 

        // 2. Using insert() 

        sb.insert(5, " Java");

        System.out.println("After insert: " + sb);  

        // 3. Using delete()

        sb.delete(5, 9);
  
        System.out.println("After delete: " + sb); 
 
        // 4. Using reverse() 

        sb.reverse();

        System.out.println("After reverse: " + sb);  

        // 5. Using toString()
 
        String str = sb.toString();

        System.out.println("After toString: " + str);  
    }
}
