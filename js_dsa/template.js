let inputs = [
  // Populate this array with test cases
];

let expected_output = [
  // Corresponding expected outputs for test cases
];

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

function programme(...args) {
  // Your function logic goes here
}

console.table(testResults);
