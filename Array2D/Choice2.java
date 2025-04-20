public class Choice2 {
    public static void main(String[] args) {
        int[] student = {0, 1, 2, 3, 4, 5, 6, 7};
        int[][] ans = {{1, 2, 1, 3, 3, 4, 5, 5, 1, 4},{4, 2, 1, 2, 3, 1, 5, 5, 1, 4},{5, 4, 4, 1, 3, 2, 5, 5, 1, 4},{3, 2, 1, 5, 4, 3, 5, 5, 1, 4},{1, 2, 4, 3, 3, 4, 5, 5, 1, 4},{2, 2, 5, 3, 3, 4, 5, 5, 1, 4},{2, 2, 1, 3, 3, 4, 5, 5, 1, 4},{5, 2, 5, 3, 3, 4, 5, 5, 1, 4}};
        int[] key = {4, 2, 4, 3, 3, 4, 1, 5,1,4};
        int[] scores = new int[student.length];

        // Check each student's answers against the key and count scores
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                if (ans[i][j] == key[j]) {
                    scores[i]++;
                }
            }
        }

        // Print scores for each student
        for (int i = 0; i < student.length; i++) {
            System.out.println("Student " + student[i] + " score: " + scores[i]);
        }
    }
}


