class DelA{
    public static void main(String[] args){
        String str = "Prakash Upadhyay";
        StringBuffer str2 = new StringBuffer(str);
        for (int i = 0; i<str2.length(); i++){
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'A'){
                str2.deleteCharAt(i);
            }
        }

        System.out.println(str2.toString());
    }
}