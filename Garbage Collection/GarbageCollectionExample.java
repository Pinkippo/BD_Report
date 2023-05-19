public class GarbageCollectionExample {
    public static void main(String[] args) {

        // 가비지 컬렉션이 제대로 동작하도록 코드를 작성한 예시

        // 객체 생성
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // obj2에 대한 참조 제거
        obj2 = null;

        // 가비지 컬렉션 실행을 유도하기 위해 메모리 부족 상황 조성
        for (int i = 0; i < 10000; i++) {
            new MyClass();
        }

        // 가비지 컬렉션 요청
        System.gc();
    }
}

class MyClass {

    // 객체 정리를 위한 메서드
    public void cleanUp() {
        System.out.println("Cleaning up resources: " + this);
        // 리소스 정리 작업 수행
    }
}

