
public static void main(String[] args){
    String s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    int len = s.length();
    String Lowercase =  s.toLowerCase();
    String upperCase = s.toUpperCase();
    int vowel_Count = 0;

    char[] vowel = {'a' , 'e' ,'i' ,'o' ,'u'};

    for(int i=0;i<len;i++){
        for(int j=0;j<5;j++) {
            if (Lowercase.charAt(i) ==(vowel[j]))vowel_Count++;
        }
    }
    StringBuilder Reverse = new StringBuilder()  ;
    for(int i=len-1;i>=0;i--){
        Reverse.append(s.charAt(i));
    }

    System.out.println(Lowercase);
    System.out.println(upperCase);
    System.out.println(vowel_Count);
    System.out.println(Reverse);



}