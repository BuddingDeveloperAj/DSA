const selectionSort = (arr) => {
  for (let i = 0; i < arr.length; i++) {
    let last = arr.length - 1 - i;
  }
  console.log(arr);
};

const findMax = (arr, start, end) => {
  let max = start;

  for (let i = start + 1; i <= end; i++) {
    if (arr[i] > arr[max]) max = i;
  }
};

console.log(selectionSort([5, 3, 2, 4, 8]));
