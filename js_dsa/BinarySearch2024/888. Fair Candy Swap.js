let inputs = [
  [
    [1, 1],
    [2, 2],
  ],
  [
    [1, 2],
    [2, 3],
  ],
  [[2], [1, 3]],
  [
    [1, 2, 5],
    [2, 4],
  ],
];

let expected_output = [
  [1, 2],
  [1, 2],
  [2, 3],
  [5, 4],
];

let testResults = [];

let testingFrom = 0;
let testingEnd = inputs.length;

for (let ind = testingFrom; ind < testingEnd; ind++) {
  let output = programme(...inputs[ind]);
  let result =
    typeof output === "object"
      ? JSON.stringify(output) === JSON.stringify(expected_output[ind])
      : output === expected_output[ind];
  testResults.push({
    Input: inputs[ind],
    Output: output,
    Expected: expected_output[ind],
    Passed: result ? "PASSED" : "FAILED",
  });
}

function programme(aliceSizes, bobSizes) {
  let aliceTot = aliceSizes.reduce((tot, cur) => (tot += cur), 0);
  let bobTot = bobSizes.reduce((tot, cur) => (tot += cur), 0);

  let diff = (bobTot - aliceTot) / 2;

  let botSorted = [...new Set(bobSizes)];
  console.log(botSorted);

  for (let i of aliceSizes) {
    if (botSorted.includes(i + diff)) {
      return [i, i + diff];
    }
  }
}

console.table(testResults);
