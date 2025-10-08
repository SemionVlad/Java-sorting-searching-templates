# Java Sorting & Searching Templates (Copy‑Paste)
<!-- Tech & meta badges (static; no CI required) -->
![Language: Java](https://img.shields.io/badge/Language-Java-red?logo=java)
![Domain: Algorithms](https://img.shields.io/badge/Domain-Algorithms-0aa)
![Focus: Sorting](https://img.shields.io/badge/Focus-Sorting-4c1)
![Focus: Searching](https://img.shields.io/badge/Focus-Searching-795548)
![Arrays: int[]](https://img.shields.io/badge/Arrays-int%5B%5D-999)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
> Minimal, static Java templates for classic sorting/searching on int[]: binary search + lower/upper bound, bubble/insertion/merge/heap/quick (3-way), counting, radix (LSD).

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
