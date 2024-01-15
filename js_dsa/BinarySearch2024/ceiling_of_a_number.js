let inputs = [
  {
    arr: [1, 2, 3, 4, 6, 8, 9, 10, 13],
    target: 7,
  },
  {
    arr: [1, 2, 3, 4, 6, 8, 9, 10, 13],
    target: 9,
  },
  {
    arr: [1, 3, 4, 5, 7, 10, 12, 15],
    target: 11,
  },
  {
    arr: [1, 3, 4, 5, 7, 10, 11, 12, 15],
    target: 9,
  },
];

let expected_output = [8, 9, 12, 10];

let testResults = [];

let testingFrom = 0;
let testingEnd = inputs.length;

for (let ind = testingFrom; ind < testingEnd; ind++) {
  let output = programme(inputs[ind]);
  let result = output === expected_output[ind];
  testResults.push({
    Input: inputs[ind],
    Output: output,
    Expected: expected_output[ind],
    Passed: result ? "PASSED" : "FAILED",
  });
}

function programme({ arr, target }) {
  let start = 0;
  let end = arr.length - 1;

  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2);

    if (arr[mid] === target) {
      return arr[mid];
    }

    if (arr[mid] > target) {
      end = mid - 1;
    } else {
      start = mid + 1;
    }
  }
  return arr[start];
}

console.table(testResults);
