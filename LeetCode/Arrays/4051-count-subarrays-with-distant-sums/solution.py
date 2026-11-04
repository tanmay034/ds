def distantSubarrays(self, A: list[int], goal: int, k: int) -> int:
        if k == 0:
            return len(A) * (len(A) + 1) // 2
        st = SortedList([0])
        res = p = 0
        for a in A:
            p += a
            res += st.bisect_right(p - (goal + k))
            res += len(st) - st.bisect_left(p - (goal - k))
            st.add(p)
        return res