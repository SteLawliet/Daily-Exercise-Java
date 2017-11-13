package StringDemo;

/**
 * Created by Stelawliet on 17/9/26.
 */
public class mString {
    public static void main(String[] args) {
        String s = "5432100096766558887777776543345476";
        String s1 = "abcdefgh";

        String string = reverse(s, 3);

        System.out.println(string);
        String s2="#end";
        System.out.println(s2=="#end");
    }

    public static String reverse(String s, int isInt) {

        char[] chars = s.toCharArray();
        int size = chars.length;
        int[] ints = new int[size];
        for (int i = 0; i < chars.length; i++) {
            String string = String.valueOf(chars[i]);
            ints[i] = Integer.parseInt(string);
        }
        if (isInt == 1) {
            for (int i = 0; i < ints.length - 1; i++) {
                for (int j = 0; j < ints.length - 1 - i; j++) {
                    if (ints[j] > ints[j + 1]) {
                        int temp = ints[j + 1];
                        ints[j + 1] = ints[j];
                        ints[j] = temp;
                    }
                }
            }


            StringBuilder stringBuilder = new StringBuilder();
            for (int i : ints) {
                stringBuilder.append(i);
            }

            return new String(stringBuilder);

        } else {
   /*
    *
    *
    *     ints={5,4,3,2,1,0} size = 6
    *           0 1 2 3 4 5
    * */
            for (int i = 0; i < ints.length-1; i++) {
                for (int j = i+1; j < ints.length; j++) {
                    if (ints[i] > ints[j] ){
                        int temp = ints[i];
                        ints[i] = ints[j];
                        ints[j] =temp;
                    }
                }
                
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i : ints) {
                stringBuilder.append(i);
            }

            return new String(stringBuilder);


        }

    }



    public static void change() {

    }
}
