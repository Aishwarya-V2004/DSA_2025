package Basic_problems;

public class cuberoot{
    public static int CubeRoot(int n) {
        int result = 0;
        while ((result + 1) * (result + 1) * (result + 1) <= n) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(CubeRoot(3)); // Output: 1
        System.out.println(CubeRoot(8)); // Output: 2
        System.out.println(CubeRoot(27)); // Output: 3
        System.out.println(CubeRoot(64)); // Output: 4
    }
}
