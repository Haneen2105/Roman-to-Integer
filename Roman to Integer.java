public class RomanToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "III";
        int sum = 0;
        String[] str_arr = new String[10];
        str_arr = s.split("(?!^)");

        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        hash_map.put("I", 1);
        hash_map.put("V", 5);
        hash_map.put("X", 10);
        hash_map.put("L", 50);
        hash_map.put("C", 100);
        hash_map.put("D", 500);
        hash_map.put("M", 1000);

        for (int i = 0; i < str_arr.length; i++) {
            if (i!=str_arr.length-1 &&hash_map.get(str_arr[i]) < hash_map.get(str_arr[i + 1])){
                sum -= hash_map.get(str_arr[i]);
            } else {
                sum += hash_map.get(str_arr[i]);
            }
        }
         System.out.println (sum);
    }

   

}