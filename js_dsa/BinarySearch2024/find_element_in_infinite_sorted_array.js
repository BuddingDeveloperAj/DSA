let inputs = [
  {
    array: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29],
    target: 13,
  },
  {
    array: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30],
    target: 9,
  },
  { array: Array.from({ length: 1000 }, (_, i) => i * 2), target: 200 },
];

let expected_output = [6, -1, 100];

let testResults = [];

let testingFrom = 0;
let testingEnd = inputs.length;

for (let ind = testingFrom; ind < testingEnd; ind++) {
  let output = programme(inputs[ind]);
  let result;

  if (Array.isArray(expected_output[ind])) {
    result = JSON.stringify(output) === JSON.stringify(expected_output[ind]);
  } else {
    result = output === expected_output[ind];
  }
  testResults.push({
    Input: inputs[ind],
    Output: output,
    Expected: expected_output[ind],
    Passed: result ? "PASSED" : "FAILED",
  });
}

function programme({ array, target }) {
  function binarySearch(arr, start, end, t) {
    while (start <= end) {
      let mid = Math.floor(start + (end - start) / 2);

      if (arr[mid] === t) {
        return mid;
      } else if (arr[mid] < t) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  let start = 0;
  let end = 1;

  while (target > array[end]) {
    console.log(array[end], target, start, end);
    let temp = end + 1;
    end = start + (end - start + 1) * 2;
    start = temp;
  }

  console.log("********************************");
  return binarySearch(array, start, end, target);
}

console.table(testResults);
