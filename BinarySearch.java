public class BinarySearch {

// Использовались процедурная и структурная парадигма в императивном стиле, поскольку задача простая и не требует применения ООП и чистых 
// математических функций

  public static void main(String[] args) {
    int[] valuesArray = { 1, 2, 4, 5, 7, 8, 10 };
    int valueToFind = 4;

    System.out.printf("Индекс искомого элемента = %d", binarySearch(valuesArray, valueToFind));
  }

  private static int binarySearch(int[] sortedArray, int valueToFind) { //процедура
    int index = -1;
    int low = 0;
    int high = sortedArray.length - 1;  //небольшой пример использования декларативного стиля для поиска размера массива

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (sortedArray[mid] < valueToFind) {
        low = mid + 1;
      } else if (sortedArray[mid] > valueToFind) {
        high = mid - 1;
      } else if (sortedArray[mid] == valueToFind) {
        index = mid;
        break;
      }
    }
    return index;
  }
}