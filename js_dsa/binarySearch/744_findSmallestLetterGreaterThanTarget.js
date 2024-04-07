const array = ['a', 'b', 'c', 'd', 'e'];
const target = 'c';

function main(arr, target) {
  let start = 0;
  let end = arr.length - 1;

  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2);

    if (arr[mid] < target) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return arr[start % arr.length];
}

console.log(main(array, target)); // Output: 'd'
