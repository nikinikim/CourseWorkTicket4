public class Main {

    //Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "James";
        names[1] = "Nick";
        names[2] = "Michael";
        names[3] = "Nick";
        System.out.println(deleteDublicates(names));
    }

    public static String deleteDublicates(String[] names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                for (int j = i + 1; j < names.length; j++) {
                    if (names[i].equals(names[j])) {
                        names[j] = null;
                    }
                }
                sb.append(names[i] + " ");
            }
        }
        return sb.toString();
    }



}