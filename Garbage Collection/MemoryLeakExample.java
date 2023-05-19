import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    private static List<String> list = new ArrayList<>();

    // 가비지 컬렉션으로 인해 메모리 누수가 발생하는 예제 코드
    public static void main(String[] args) {
        while (true) {
            // 객체를 계속해서 추가하면 메모리 누수가 발생
            list.add("Leaked data");
        }
    }
}
