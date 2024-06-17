class Decipherer{
    public static String decipherer(String message){
        int key = message.length() / 2;
        String subMessage = message.substring(5, 5 + key);

        String step2 = subMessage.replace("@", " ").replace("#", "").replace("?", " ");

        String decipheredMessage = new StringBuilder(step2).reverse().toString();

        return decipheredMessage;
    }
    public static void main(String[] args){
        System.out.println(decipherer("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(decipherer("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipherer("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}

