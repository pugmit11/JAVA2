package session1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("World");
        hs.add("Hello");
        hs.add("World");
        for (String s: hs){
            System.out.println(s);
        }
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(4);
        number.add(2);
        number.add(1);
        System.out.println("Number: " + number);

        int first = number.peek();
        System.out.println("first: " + first);
        System.out.println("Total: " + number.size());

        System.out.println("Pill: " + number.poll() + " remain:" + number.size());
        System.out.println("Pill: " + number.poll() + " remain:" + number.size());
        System.out.println("Pill: " + number.poll() + " remain:" + number.size());

        PriorityQueue<Student> st = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getMark() - o1.getMark();
            }
        });
        st.add(new Student("Nguyen Tuan Anh", 1));
        st.add(new Student("Cao Hoang Nam", 3));
        st.add(new Student("Tran Van Thanh", 2));
        st.add(new Student("Songoku", 9));

        Student s;
        while ((s = st.poll()) != null){
            System.out.println("Sv: " + s.getName() + " Diem thi: " + s.getMark());
        }

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("good_student", 10);
        hm.put("bad_student", 3);
        System.out.println("Tieu chuan lam sinh vien gioi diem thi phai dat: " + hm.get("good_student"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }
}
