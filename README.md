# Java Sorting & Searching Templates (Copy‑Paste)

Thin, **generic templates** for classic sorting & searching on `int[]`.  
Paste into your project and tweak quickly — no package, minimal ceremony, static APIs.

## Files
- `BinarySearch.java` – binary search + lower/upper bound.
- `BubbleSort.java` – stable, adaptive bubble with last‑swap boundary.
- `InsertionSort.java` – stable insertion; includes `[lo..hi]` overload.
- `MergeSort.java` – stable top‑down merge with early‑exit.
- `HeapSort.java` – in‑place heap (max‑heap), not stable.
- `QuickSort3Way.java` – Dijkstra 3‑way with median‑of‑three + smaller‑side‑first.
- `RadixSort.java` – LSD base‑256 for full signed `int` (negatives OK), plus a simple base‑10 non‑negative demo.
- `CountingSort.java` – stable counting sort with `[min..max]` and auto‑detect overload.

### How to use as templates
- Copy the class (or just the static method) into your project.
- Rename the class/methods.
- If needed, adapt comparisons (e.g., reverse order), or change ranges like `[lo..hi]`.
- For objects, consider writing a comparator‑based variant in your project.

> These are deliberately minimal and self‑contained so they’re quick to reuse.
