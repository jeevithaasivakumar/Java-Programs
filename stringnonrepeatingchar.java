public class stringnonrepeatingchar {
    public static void main(String[] args) {
        String ip = "prepinsta";
        boolean flag = true;
        for(char i : ip.toCharArray()){
            if(ip.indexOf(i) == ip.lastIndexOf(i)) // checks whether it is the last occurence of othe ochar
            {
                System.out.println("non repeating string are:" + i);
                flag=false;  //so this becomes false
                break;
            }
        }
        if(flag){   //if still flag is true then no repeating char
            System.out.println("no repeating char");
        }
    }
}
