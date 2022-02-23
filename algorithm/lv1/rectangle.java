import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String str = "";
        for (int i = 0; i < b; i++) {
            
            for (int j = 0; j < a; j++) {
                str += "*";        
            }
            str += "\n";
        }
        System.out.println(str);
    }
}