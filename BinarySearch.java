    /*
     * =========================  TEMPLATE  =========================
     * Binary Search utilities for sorted int[] (iterative)
     * Copy-paste into your project and tweak as needed.
     * - No package
     * - Small, static API
     * - Safe to rename class/methods
     * - TODO: rename class/methods as you wish.
- TODO: if you need custom compare logic, adapt comparisons.
     * ===============================================================
     */
public class BinarySearch {
    private BinarySearch() {} // optional: remove if you want instances

    /** Returns index of key or -1 if not found. */
    public static int binarySearch(int[] a, int key) {
        if (a == null || a.length == 0) return -1;
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int v = a[mid];
            if (v == key) return mid;
            if (v < key)  left = mid + 1;
            else          right = mid - 1;
        }
        return -1;
    }

    /** Range variant on [lo..hi] inclusive. */
    public static int binarySearch(int[] a, int key, int lo, int hi) {
        if (a == null || a.length == 0) return -1;
        if (lo < 0 || hi >= a.length || lo > hi) throw new IllegalArgumentException("bad range");
        int left = lo, right = hi;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int v = a[mid];
            if (v == key) return mid;
            if (v < key)  left = mid + 1;
            else          right = mid - 1;
        }
        return -1;
    }

    /** First index i with a[i] >= key (or a.length if none). */
    public static int lowerBound(int[] a, int key) {
        if (a == null || a.length == 0) return 0;
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] < key) left = mid + 1;
            else              right = mid;
        }
        return left;
    }

    /** First index i with a[i] > key (or a.length if none). */
    public static int upperBound(int[] a, int key) {
        if (a == null || a.length == 0) return 0;
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] <= key) left = mid + 1;
            else               right = mid;
        }
        return left;
    }
}
