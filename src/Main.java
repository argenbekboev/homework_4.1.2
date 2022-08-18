import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello friend");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> nameC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }

        System.out.println(A);
        for (int i = 0; i < 5; i++) {

            B.add(scanner.nextLine());
        }

        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);

        int x = 0;
        while (nameC.size()<A.size()+B.size()){
            nameC.add(A.get(x));
            nameC.add(B.get(x));
            x++;
        }

        nameC.add(A.get(0));
        nameC.add(B.get(1));
        System.out.println(nameC);
        nameC.sort(new Comparator<String>() {


            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(nameC);
    }
}
