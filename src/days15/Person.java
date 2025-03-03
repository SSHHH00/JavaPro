package days15;

public class Person {
    String name;
    private int age;
    private boolean gender;

    // 생성자
    public Person() {
        this("익명사용자", 1, true);
        System.out.println("> Person 0 디폴트 생성자 호출됨.");
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(boolean gender) {
        this("익명사용자", 1, gender); // 기본값 설정
    }

    // Getter (읽기 전용)
    public int getAge() {
        return age;
    }

    public boolean isGender() {  // boolean 타입은 isGender()로 자동 변경됨
        return gender;
    }

    // Setter (값 변경)
    public void setAge(int a) {
        if (a >= 0 && a <= 120) {
            this.age = a;
        } else {
            System.out.println("0~120의 나이를 입력!!");
            throw new RuntimeException("0~120 사이의 나이만 입력 가능합니다.");
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
