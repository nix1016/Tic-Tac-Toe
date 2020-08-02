import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String order = "";
        while (scanner.hasNext()) {
            int s = scanner.nextInt();

            if (s == 0) {
                break;
            } else if (order == ""){
                if (s > n) {
                    order = "asc";
                } else if (s < n) {
                    order = "desc";
                }
            } else {
                if (order == "asc" && s < n) {
                    order = "false";
                    break;
                } else if (order == "desc" && s > n) {
                    order = "false";
                    break;
                }
            }

            n = s;

        }

        if (order == "asc" || order == "desc" || order == "") {
            order = "true";
        }
        System.out.println(order);

        /* official solution
        long num = sc.nextLong();
        long old;

        boolean rordered = true;
        boolean lordered = true;

        while (true) {
            old = num;
            num = sc.nextLong();

            if (num == 0) {
                break;
            }

            if (rordered && num < old) {
                rordered = false;
                continue;
            }

            if (lordered && num > old) {
                lordered = false;
                continue;
            }

            if (!rordered && !lordered) {
                break;
            }
        }

        System.out.println(lordered || rordered);
         */
    }
}