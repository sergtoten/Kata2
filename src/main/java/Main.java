import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        try(Reader reader = new InputStreamReader(url.openStream())) {
            List<Employee> employees = loadEmployeesFrom(reader);
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    private static List<Employee> loadEmployeesFrom(Reader reader) throws IOException {
        return loadEmployeesFrom(reader.readAllLines());
    }

    private static List<Employee> loadEmployeesFrom(List<String> strings) {
        List<Employee> result = new ArrayList<>();
        for (int i = 1; i < strings.size(); i++) {
            result.add(loadEmployeesFrom(strings.get(i)));
        }
        return result;
    }

    private static Employee loadEmployeesFrom(String s) {
        return loadEmployeesFrom(s.split("\t"));
    }

    private static Employee loadEmployeesFrom(String[] split) {
        return new Employee(split[0], Gender.from(split[5]));
    }

}
