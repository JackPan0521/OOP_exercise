設計一個 SortStrategy 介面，定義：void sort(int[] nums);
另外，設計 BubbleSort 和 QuickSort 兩種排序類別，實作 SortStrategy 介面，完成對應的排序策略。
設計 Sorter 類別，可在執行時設定不同的 SortStrategy。

測試類別:

import java.util.\*;
public class Main {
public static void main(String[] args) {
int[] data1 = {5, 1, 4, 2};
int[] data2 = {5, 1, 4, 2};
Sorter sorter = new Sorter(new BubbleSort());
sorter.sort(data1);
System.out.println(Arrays.toString(data1));

        sorter.setStrategy(new QuickSort());
        sorter.sort(data2);
        System.out.println(Arrays.toString(data2));
    }

}

輸出:

[1, 2, 4, 5]
[1, 2, 4, 5]
