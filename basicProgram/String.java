public class String{
    public static void main(String[] args) {
        java.lang.String str="i am girl";

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }

    public Object subString(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subString'");
    }

    public char[] toCharArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toCharArray'");
    }
}
