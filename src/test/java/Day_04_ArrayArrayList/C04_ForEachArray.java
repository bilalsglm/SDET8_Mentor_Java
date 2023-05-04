package Day_04_ArrayArrayList;

public class C04_ForEachArray {
    public static void main(String[] args) {
        String [] names={"name1","name2","name3","name4"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

        System.out.println();
        for (String s:names) {
            System.out.print(s+" ");
        }
    }
}
