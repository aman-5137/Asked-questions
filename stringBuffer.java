public class stringBuffer {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("welocome");
        System.out.println(sb);

        sb.append(" hello welcome to java");
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.insert(0, "you are ");
//        sb.deleteCharAt(0);
        sb.delete(0,16);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.replace(0, 20, "Do not do ");
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);

    }
}
