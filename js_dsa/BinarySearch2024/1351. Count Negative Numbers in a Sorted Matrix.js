let inputs = [
  [
    [4, 3, 2, -1],
    [3, 2, 1, -1],
    [1, 1, -1, -2],
    [-1, -1, -2, -3],
  ],
  [
    [3, 2],
    [1, 0],
  ],
  [
    [1, -1],
    [-1, -1],
  ],
];

let expected_output = [8, 0, 3];
let testResults = [];

let testingFrom = 0;
let testingEnd = inputs.length;

for (let ind = testingFrom; ind < testingEnd; ind++) {
  let output = programme(...inputs[ind]);
  let result = output === expected_output[ind];
  testResults.push({
    Input: inputs[ind],
    Output: output,
    Expected: expected_output[ind],
    Passed: result ? "PASSED" : "FAILED",
  });
}
console.table(testResults);

function programme(...args) {
  let count = 0;
  for (let i of args) {
    let start = 0;
    let end = i.length - 1;

    while (start <= end) {
      let mid = Math.round(start + (end - start) / 2);

      if (0 > i[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    count += i.length - start;
  }
  return count;
}
