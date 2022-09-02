// fizzbuzz
public class fizzbuzz {
    public static void main(String[] args) {
        for(int i=1; i<101; i++) {
            // 3の倍数 かつ 5の倍数の場合
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzbuzz");
            }
            // 3の倍数の場合
            else if(i % 3 == 0) {
                System.out.println("fizz");
            }
            // 5の倍数の場合
            else if(i % 5 == 0) {
                System.out.println("buzz");
            }
            // 3の倍数 でも 5の倍数でもないの場合
            else {
                System.out.println(i);
            }
        }
    }
}
