class Solution {

    static class Fenwick {
        int[] tree;

        Fenwick(int n) {
            tree = new int[n + 1];
        }

        void add(int index, int value) {
            while (index < tree.length) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int query(int index) {
            int sum = 0;

            while (index > 0) {
                sum += tree[index];
                index -= index & -index;
            }

            return sum;
        }

        int rangeQuery(int left, int right) {
            if (left > right) {
                return 0;
            }

            return query(right) - query(left - 1);
        }
    }

    static int lowerBound(long[] arr, int size, long target) {
        int left = 0;
        int right = size;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    static int upperBound(long[] arr, int size, long target) {
        int left = 0;
        int right = size;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public long distantSubarrays(int[] nums, int goal, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long[] sorted = Arrays.copyOf(prefix, n + 1);
        Arrays.sort(sorted);

        int m = 0;

        for (int i = 0; i < sorted.length; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                sorted[m++] = sorted[i];
            }
        }

        Fenwick bit = new Fenwick(m);
        long close = 0;

        for (int j = 0; j <= n; j++) {
            long current = prefix[j];

            long lowerValue = current - ((long) goal + k);
            long upperValue = current - ((long) goal - k);

            int left = upperBound(sorted, m, lowerValue);
            int right = lowerBound(sorted, m, upperValue) - 1;

            if (left <= right) {
                close += bit.rangeQuery(left + 1, right + 1);
            }

            int position = lowerBound(sorted, m, current);
            bit.add(position + 1, 1);
        }

        long total = (long) n * (n + 1) / 2;
        return total - close;
    }
}